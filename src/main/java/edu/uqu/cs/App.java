package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
    public static void main(String [] args) {
       // Scanner input = new Scanner(System.in);
        /* Write your code here */
     
       //call method twisters()
       twisters();
       //prompt user to enter a string 
       //call method phoneKeypad(string)

    }
     /*public static String phoneKeypad(){
       String result;
        switch(ch)
     }*/
    
     public static void twisters(){
        for(int n=0; n<110 ; n++ ){
            if(n%2==0){
            System.out.print("Tweetle");
            }else if (n%4==0){
            System.out.print("Beetle");
            }else if (n%6==0){
            System.out.print("Poodle");    
            }else{
            System.out.print(n);  
            }
        }
     }
}
