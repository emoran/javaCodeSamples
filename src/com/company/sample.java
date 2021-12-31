package com.company;

class Sample {
  public static void main(String[] args){
    System.out.println(hasUniqueChars("hola"));
  }

  public static boolean hasUniqueChars(String word){

    if (word.length()>128) return false;

    boolean[] char_set = new boolean[128];

    for(int i =0; i < word.length();i++){
      int val = word.charAt(0);

      if(char_set[val]){
        return false;
      }
      char_set[val] = true;
    }

    return true;
  }


}
