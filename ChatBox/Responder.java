/**
 * Write a description of class SupportSystem here.
 *
 * @author Fayha Syifa Qalbi
 * @version 0.1 10 November 2020
 */

 import java.util.*;  
 public class Responder  
 {   
     private Random randomGenerator;  
     private ArrayList<String> defaultResponses;  
     private HashMap<String, String> responseMap;  
     
     public Responder()  
     {  
       defaultResponses = new ArrayList<String>();  
       responseMap = new HashMap<String, String>();  
       fillResponsesMap();  
       fillDefaultResponse();  
       randomGenerator = new Random();  
     }  

     public String generateResponse(HashSet<String> words)  
     {  
       for(String word : words)  
       {  
         String response = responseMap.get(word);  
         if(response != null)  
         {return response;}  
       }  
       return pickDefaultResponse();  
     }  

     private void fillResponsesMap()  
     {  
       responseMap.put("hi", "Hi, How's Life?");  
       responseMap.put("great", "Glad to hear that, Hope you happy all the time :)");  
       responseMap.put("bad", ":(, Is there something bothering you lately?");  
       responseMap.put("sad", "Don't be sad dear"+"It's okay to cry");  
       responseMap.put("thank", "Your welcome :)");
       responseMap.put("helo", "Hello, How's your day?");
     }  

     private void fillDefaultResponse()  
     {  
       defaultResponses.add("Input Failed ");  
       defaultResponses.add("Error 404");  
       defaultResponses.add("Sorry, i don't understand");    
     }  
  
     private String pickDefaultResponse()  
     {  
       int index = randomGenerator.nextInt(defaultResponses.size());  
       return defaultResponses.get(index);  
     }  
 }  