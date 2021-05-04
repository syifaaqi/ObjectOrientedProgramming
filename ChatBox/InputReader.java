/**
 * Write a description of class SupportSystem here.
 *
 * @author Fayha Syifa Qalbi
 * @version 0.1 10 November 2020
 */
 import java.util.*;  
 public class InputReader  
 {  
   private Scanner reader;  
   public InputReader()  
   {  
     reader = new Scanner(System.in);  
   }  
 
   public HashSet<String> getInput()  
   {  
     System.out.print("-> ");  
     String inputLine = reader.nextLine().trim().toLowerCase();  
     
     String[] wordArray = inputLine.split(" ");  
     HashSet<String> words = new HashSet<String>();  
     for(String word : wordArray)  
     {  
       words.add(word);  
     }  
     return words;  
   }  
 }  