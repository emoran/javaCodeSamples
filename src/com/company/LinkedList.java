package com.company;

public class LinkedList {

  public static void main(String[] args){
    Node node = new Node(5);

    node.appendToTail(3);
    node.appendToTail(6);


    System.out.println("Nodes"+node);

  }

  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
    }

    public void appendToTail(int d){
      Node end = new Node(d);
      Node n = this;

      while(n.next != null){
        n = n.next;
      }
      n.next = end;
    }
  }

}
