package com.company;

public class StringCompression {

  public static void main(String[] args){
    System.out.println(compressedBad("aaaooonnnu"));
  }
  public static String compressedBad(String word){
    String compressedString = "";
    int countConsecutive=0;

    for(int i=0; i < word.length();i++){
      countConsecutive++;

      if(i+1 >= word.length() || word.charAt(i) != word.charAt(i +1) ){
        compressedString += ""+ word.charAt(i) + countConsecutive;
        countConsecutive = 0;
      }
    }
    return compressedString.length() < word.length() ? compressedString :word;
  }
}
