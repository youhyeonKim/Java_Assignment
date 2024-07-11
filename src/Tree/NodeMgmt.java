package Tree;

public class NodeMgmt {
  Node head = null;
  public class Node{
    Node left;
    Node right;
    int value;
    public Node(int data){
      this.value = data;
      this.left = null;
      this.right = null;
    }
  }

  public boolean insertNode(int data){
    if(head == null){
      head = new Node(data);
    }else{
      Node findnode = this.head;
      while(true){
        if(data<findnode.value){
          if(findnode.left == null){
            findnode.left = new Node(data);
            break;
          } else{
            findnode = findnode.left;
          }
        }
        else{
          if(findnode.right == null){
            findnode.right = new Node(data);
            break;
          }
          else{
            findnode = findnode.right;
          }
        }
      }
    }
    return true;
  }

  public boolean findNode(int data){
    if(this.head == null)
      return false;
    else{
      Node findnode = this.head;
      while(true){
        if(data == findnode.value)
          return true;
        else{
          if(data<findnode.value){
            if(findnode.left == null)
              return false;
            else{
              findnode = findnode.left;
            }
          }
          else{
            if(findnode.right == null)
              return false;
            else{
              findnode = findnode.right;
            }
          }
        }
      }
    }
  }

  public void deleteNode_first(){
    if(head != null){
      if(head.left == null){
        this.head = this.head.right;
      }else{
        Node node = this.head;
        Node parentnode = null;
        while(node.left!=null){
          parentnode = node;
          node = node.left;
        }
        if(node.right==null)
          parentnode.left = null;
        else{
          parentnode.left = node.right;
        }
      }
    }
  }


  public void deleteNode_last(){
    if(head != null){
      if(head.right == null){
        this.head = this.head.left;
      }else{
        Node node = this.head;
        Node parentnode = null;
        while(node.right!=null){
          parentnode = node;
          node = node.right;
        }
        if(node.left==null)
          parentnode.right = null;
        else{
          parentnode.right = node.left;
        }
      }
    }
  }
}

