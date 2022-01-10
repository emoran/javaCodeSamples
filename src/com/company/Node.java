package com.company;


class TreeImplementation{
  public static void main(String[] args){

    Node node = new Node(6);
    node.insert(10);
    node.insert(3);

    System.out.println(node.contains(10));
   // node.printInOrder();
  }
}

public class Node {

  Node right, left; //pointers
  int data; //actual data

  //Constructor
  public Node(int data){
    this.data = data;
  }

  //insert
  public void insert(int value){
    if(value <= data){
      if(left == null){
        left = new Node(value);
      } else {
        left.insert(value);
      }
    } else {
      if (right == null) {
        right = new Node(value);
      } else {
        right.insert(value);
      }
    }
  }


  public boolean contains(int value){
    if(value == data){
      return true;
    }
    else if (value < data){
      if(left  == null){
        return false;
      }
      else{
        return left.contains(value);
      }
    }
    else {
      if(right  == null){
        return false;
      }
      else{
        return right.contains(value);
      }
    }
  }


  public void printInOrder(){
    if(left != null){
      left.printInOrder();
    }
    System.out.println(data);
    if(right != null){
      right.printInOrder();
    }
  }

}
