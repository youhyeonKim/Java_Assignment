package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private static final DBConnection conn = new DBConnection();
  private DBConnection(){}

  public static DBConnection getInstance(){return  conn;}

  private Connection connection = null;
  private String db_url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private String db_id = "root";
  private String db_pwd = "mysql1234";

  public Connection open(){
    try {
      connection = DriverManager.getConnection(db_url, db_id, db_pwd);
      //System.out.println("<<DB 정상연결 완료>>");
    } catch (SQLException e) {
      System.err.println("<<DB 연결 실패>>");
    }

    return connection;
  }

  public void close(){
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println("<<DB 정상종료 실패>>");
    }
  }



}
