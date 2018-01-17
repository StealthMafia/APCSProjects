 /**
 * Song.java
 * Assignment: Cumulative Song
 * Purpose: Something about redundancy and static methods.
 *
 * @version 09/29/17
 */
 public class Song {
   public static void main(String[] args) {
      verseI();
      System.out.println();
      verseII();
      System.out.println();
      verseIII();
      System.out.println();
      verseIV();
      System.out.println();
      chorus();
      System.out.println();
      kaiba();
  }
  
   //This is the static method that prints rhyme1!!1!!
   public static boolean rhyme1() {
      System.out.println("Hey homies, my code is gonna rock this place");
      System.out.println("With a method named main and a curly brace");
	return false;
  }
  
   //This is the static method that prints rhyme2!!1!!
   public static void rhyme2() {
      System.out.println("I put a semicolon at the end of each line");
      System.out.println("You haters never seen code that looked so fine");
  }
  
   //This is the static method that prints rhyme3!!1!!
   public static void rhyme3() {
      System.out.println("jGrasp loves my code, no need to debug");
      System.out.println("I can rap in Java until it unplug");
  }
  
   //This is the static method that prints rhyme4!!1!!
   public static void rhyme4() {
      System.out.println("The first time I try, my code compiles");
      System.out.println("Lost a point for style cause my comments are vile");
  }
  
   //This is the static method that prints rhyme5!!1!!
   public static void rhyme5() {
      System.out.println("Got help from Ms. Myers and it was swell");
      System.out.println("But I didn't need it cause I code so well");   
  }
  
   //This is the static method that prints rhyme6!!1!!
   public static void rhyme6() {
      System.out.println("I got full credit on external correctness");
      System.out.println("Hey playa check this, my code eats yours for breakfast");
  }  
  
   //This is the static method that prints my own personal rhyme yay!!!111!!!
   public static void bluePeepsWhiteyDragon() {
      System.out.println("They all love it when I summon the Blue-Eyes White Dragon.");
      System.out.println("Yeah my deck is too efficient I'm not talking Volkswagen.");
      System.out.println("3000 attack points nobody can match it.");
      System.out.println("Just face it I'm too good why don't you just admit.");
  }
  
   //This is the static void that computes verseI!!!1!!
   public static void verseI() {
      rhyme1();
      rhyme2();
  }
  
   //This is the static void that computes verseII!!!1!!
   public static void verseII() {
      rhyme1();
      rhyme3();
      rhyme2();
  }
   //This is the static void that computes verseIII!!!1!!
   public static void verseIII() {
      rhyme1();
      rhyme4();
      rhyme3();
      rhyme2();
  }
  
   //This is the static void that computes verseIV!!!1!!
   public static void verseIV() {
      rhyme1();
      rhyme5();   
      rhyme4();
      rhyme3();
      rhyme2();
  }
  
   //This is the static void that computes chorus!!!1!!
   public static void chorus() {
      rhyme1();
      rhyme6();
      rhyme5();
      rhyme4();
      rhyme3();
      rhyme2();
  } 
  
   //This is the static void that computes kaiba!!!1!!
   public static void kaiba() {
      rhyme1();
      bluePeepsWhiteyDragon();
      rhyme6();
      rhyme5();
      rhyme4();
      rhyme3();
      rhyme2();
  }   
}