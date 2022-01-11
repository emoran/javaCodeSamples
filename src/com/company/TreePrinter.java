package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TreePrinter {


  public static void main(String[] args){
    List<Relation> listRelations = new ArrayList<Relation>();
    listRelations.add(new Relation("lifeform","animal"));
    listRelations.add(new Relation("mammal","cat"));
    listRelations.add(new Relation("animal","mammal"));
    listRelations.add(new Relation("animal","bird"));
    listRelations.add(new Relation("animal","fish"));
    listRelations.add(new Relation("cat","lion"));

    TreePrinter.printTree(listRelations);

  }


  public static void printTree(List<Relation> rs){

    Map<String,List<String>> map = new HashMap<>();
    List<String> newList;
    Set<String> children = new HashSet<>();

    for(Relation relation:rs){
      children.add(relation.child);
      if(map.containsKey(relation.parent)) {
        map.get(relation.parent).add(relation.child);
      }else {
        newList = new ArrayList<>();
        newList.add(relation.child);
        map.put(relation.parent, newList);
      }
    }

    String root = "";

    for(Map.Entry<String,List<String>> entry : map.entrySet()){
      if(!children.contains(entry.getKey())){
        root = entry.getKey();
        break;
      }
    }
     dfs(root,0,map);
  }


  public static void dfs(String root, int level, Map<String,List<String>> map){
    for(int i = 0; i < level; i++){
      System.out.print("\t");
    }

    System.out.println(root);

    List<String> children;
    if(map.containsKey(root)){
      children = map.get(root);
    }else{
      return;
    }

    for(String child: children){
      dfs(child, level + 1 , map);
    }
  }

  static class Relation{
    String parent;
    String child;

    public Relation(String parent, String child){
      this.parent = parent;
      this.child = child;
    }
  }


}
