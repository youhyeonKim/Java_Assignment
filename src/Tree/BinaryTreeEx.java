package Tree;

public class BinaryTreeEx {

  public static void main(String[] args) {
    NodeMgmt mytree = new NodeMgmt();
    mytree.insertNode(10);
    mytree.insertNode(7);
    mytree.insertNode(4);
    mytree.insertNode(9);
    mytree.insertNode(8);
    mytree.insertNode(5);
    mytree.insertNode(18);
    mytree.insertNode(17);
    mytree.insertNode(22);
    mytree.insertNode(20);

    mytree.deleteNode_first();
    System.out.println(mytree.head.value);
    System.out.println(mytree.head.left.value);
    System.out.println(mytree.head.left.left.value);

    mytree.deleteNode_last();
    System.out.println(mytree.head.value);
    System.out.println(mytree.head.right.value);
    System.out.println(mytree.head.right.right.value);

  }

}
