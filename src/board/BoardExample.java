package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardExample {
  static Connection connection = null;
  static ResultSet rs = null;
  static ArrayList<Boards> boards = new ArrayList<>();

  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    BoardExample boardExample = new BoardExample();
    boardExample.list();

  }

  public void list(){
    //DB에 있는 내용 긁어서 가져오기
    read_all();
    mainMenu();
  }
  public void mainMenu(){;
    int choice = 0;
    while(choice != 4){
      System.out.println("메인메뉴: 1.Create | 2. Read | 3. Clear | 4. Exit");
      System.out.print("메인선택: ");
      choice = Integer.parseInt(sc.nextLine());
      switch (choice){
        case 1:
          create();
          break;
        case 2:
          Read();
          break;
        case 3:
          clear();
          break;
        case 4:
          System.out.println("** 게시판 종료 **");
          break;
        default:
          System.out.println("1~4 선택해주시기 바랍니다.");
          break;
      }

    }
  }

  public static void read_all() {
    connection = DBConnection.getInstance().open();
    String query = "SELECT * FROM board ORDER BY id DESC;";
    System.out.println("-----------------------------------------------");
    System.out.println("no" + "\t\t" + "writer" + "\t\t" + "title" + "\t\t\t" + "date");
    System.out.println("-----------------------------------------------");

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        Boards board = new Boards();
        board.setBno(rs.getInt("id"));
        board.setBwriter(rs.getString("writer"));
        board.setBtitle(rs.getString("title"));
        board.setBcontent(rs.getString("content"));
        board.setBdate(rs.getTimestamp("date"));
        boards.add(board);
        System.out.println(
            board.getBno() + "\t" + board.getBwriter() + "\t" + board.getBtitle() + "\t\t" + board.getBdate());
      }
      System.out.println("-----------------------------------------------");
    }catch (SQLException e) {
      System.err.println("내용을 가져오지 못했습니다.");
    } finally {
      DBConnection.getInstance().close();
    }

  }
  public static void create(){
    System.out.println("[새 게시물 입력]");
    System.out.print("제목: ");
    String title = sc.nextLine();
    System.out.print("내용: ");
    String content = sc.nextLine();
    System.out.print("작성자: ");
    String writer = sc.nextLine();
    System.out.println("-----------------------------------------------");
    System.out.println("보조메뉴: 1.OK | 2. Cancel");
    System.out.print("메뉴 선택: ");
    int choice = Integer.parseInt(sc.nextLine());
    if(choice == 1){
      connection = DBConnection.getInstance().open();
      String query = "INSERT INTO board(writer, title, content) "+"VALUES(?,?,?)";
      try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,writer);
        ps.setString(2,title);
        ps.setString(3, content);
        ps.executeUpdate();
        read_all();
      } catch (SQLException e) {
        System.err.println("게시물이 정상적으로 입력되지 못했습니다.");
      }
    }

  }

  public static void clear(){
    System.out.println("게시물 전체 삭제");
    System.out.println("-----------------------------------------------");
    System.out.println("보조메뉴: 1.OK | 2. Cancel");
    System.out.print("메뉴 선택: ");
    connection = DBConnection.getInstance().open();
    int choice = Integer.parseInt(sc.nextLine());
    if(choice == 1){
      String query = "TRUNCATE TABLE board";
      try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.executeUpdate();
        read_all();
        ps.close();
      } catch (SQLException e) {
        System.err.println("게시물이 정상적으로 삭제되지 못했습니다.");
      }
    }
  }
  public static void Read(){
    System.out.println("[게시물 읽기]");
    System.out.print("bno: ");
    int bno = Integer.parseInt(sc.nextLine());

    connection = DBConnection.getInstance().open();
    String query = "SELECT * FROM board " +"where id = ?";
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setInt(1,bno);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        System.out.println("#####################");
        System.out.print("번호: "+rs.getInt("id")+"\n");
        System.out.print("제목: "+rs.getString("title")+"\n");
        System.out.print("내용: "+rs.getString("content")+"\n");
        System.out.print("작성자: "+rs.getString("writer")+"\n");
        System.out.print("날짜: "+rs.getTimestamp("date")+"\n");
        System.out.println("#####################");
      }
    } catch (SQLException e) {
      System.err.println("게시물이 정상적으로 불러오지 못했습니다.");
    }

    System.out.println("보조메뉴: 1. Update | 2. Delete | 3. List");
    int choice2 = Integer.parseInt(sc.nextLine());
    if(choice2 == 1) update(bno);
    else if(choice2 == 2) delete(bno);
  }

  public static void update(int id){
    System.out.println("[수정 내용 입력]");
    System.out.print("제목: ");
    String title = sc.nextLine();
    System.out.print("내용: ");
    String content = sc.nextLine();
    System.out.print("작성자: ");
    String writer = sc.nextLine();

    System.out.println("보조메뉴: 1.OK | 2. Cancel");
    System.out.print("메뉴 선택: ");
    int choice = Integer.parseInt(sc.nextLine());
    if(choice == 1){
      String query = new StringBuilder()
          .append("UPDATE board SET ")
          .append("title = ? ,")
          .append("content = ?, ")
          .append("writer = ? ")
          .append("WHERE id = ?").toString();

      try {
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, title);
        pstmt.setString(2, content);
        pstmt.setString(3, writer);
        pstmt.setInt(4, id);
        pstmt.executeUpdate();
        read_all();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }

  }

  public static void delete(int id){
    System.out.println(id+"번째 게시물을 삭제하시겠습니까?");
    System.out.println("보조메뉴: 1.OK | 2. Cancel");
    System.out.print("메뉴 선택: ");
    int choice = Integer.parseInt(sc.nextLine());
    if(choice == 1){
      String query = new StringBuilder()
          .append("DELETE FROM board ")
          .append("where id = ?").toString();

      try {
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        read_all();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }



}
