/**
 * Write a description of class SupportSystem here.
 *
 * @author Fayha Syifa Qalbi
 * @version 0.1 10 November 2020
 */

 import java.util.*;  
 public class SupportSystem  
 {  

   private InputReader reader;  
   private Responder responder;  

   public SupportSystem()  
   {  
     reader = new InputReader();  
     responder = new Responder();  
   }  
   
   public void start()  
   {  
     boolean finished = false; 
     
     printWelcome();  
     while(!finished)  
     {  
       HashSet<String> input = reader.getInput();  
       if(input.contains("bye"))  
       {finished = true;}  
       else  
       {  
         String response = responder.generateResponse(input);  
         System.out.println(response);  
       }  
     }  
     printGoodbye();  
   }  
 
   private void printWelcome()  
   {  
     System.out.println("Hola, Welcome!");  
     System.out.println("Ketik 'bye' untuk mengakhiri program");  
   }  
 
   private void printGoodbye()  
   {  
     System.out.println("See you again, Merci!\n");  
   }  
 }  