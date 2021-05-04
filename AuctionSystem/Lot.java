/**
 * Write a description of class Lot here.
 *
 * @author Fayha Syifa Qalbi
 * @version 0.1 29 Oct 2020
 */
public class Lot  
{    
  private final int number;  
  private String description;  
  private Bid highestBid;  
 
  public Lot (int number, String description)  
  {  
    this.number = number;  
    this.description = description;  
    this.highestBid = null;  
  }  
   
  public boolean bidFor(Bid bid)  
  {  
    if (highestBid==null)  
    {  
      highestBid = bid;  
      return true;  
    }  
    else if (bid.getValue() > highestBid.getValue())  
    {  
      highestBid = bid;  
      return true;  
    }  
    else  
    {  
      return false;  
    }  
  }  
 
  public String toString()  
  {  
    String details = number + ": " + description;  
    if (highestBid != null)  
    {  
      details += " Bid: " + highestBid.getValue();  
    }  
    else  
    {  
      details += " (No Bid)";  
    }  
    return details;  
  }  
 
  public int getNumber()  
  {  
    return number;  
  }  
 
  public String getDescription()  
  {  
    return description;  
  }  
 
  public Bid getHighestBid()  
  {  
    return highestBid;  
  }  
}