package com.company;

import java.util.*;
import java.lang.*;

public class LinkedList {

  static class LinkedListNode<E> {
    E data;
    LinkedListNode<E> next;
  }

  public static void main(String[] args){
    Node node = new Node(5);

    node.appendToTail(3);
    node.appendToTail(3);
    node.appendToTail(8);
    node.appendToTail(6);
    node.appendToTail(5);
    node.appendToTail(5);





    removeDuplicates(node);

    System.out.println("Nodes"+node);
  }

  public static Node removeDuplicates(Node n){
    HashSet<Integer> set = new HashSet<Integer>();
    Node previous = null;

    while (n != null){
      if(set.contains(n.data)){
        previous.next = n.next;
      }
      else{
        set.add((Integer) n.data);
        previous = n;
      }
      n = n.next;
    }

    return n;
  }


  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
    }

    public void appendToTail(int d) {
      Node end = new Node(d);
      Node n = this;

      while (n.next != null) {
        n = n.next;
      }
      n.next = end;
    }
  }

}
