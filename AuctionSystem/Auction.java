/**
 * Write a description of class Auction here.
 *
 * @author Fayha Syifa Qalbi
 * @version 0.1 28 Oct 2020
 */
 
import java.util.ArrayList;    
 
public class Auction  
{  
  private ArrayList<Lot> lots;  
  private int nextLotNumber;
 
  public Auction()  
  {  
    lots = new ArrayList<Lot>();  
    nextLotNumber = 1;  
  }    
   
  public void enterLot(String description)  
  {  
    lots.add(new Lot(nextLotNumber, description));  
    nextLotNumber++;  
  }  
   
  public void showLots()  
  {  
    for(Lot lot : lots)  
    {
        System.out.println(lot.toString());  
    }  
  }  
   
  public void makeABid(int lotNumber, Person bidder, long value)  
  {  
    Lot selectedLot = getLot(lotNumber);  
    if (selectedLot != null)  
    {  
      boolean succesful = selectedLot.bidFor(new Bid(bidder, value));  
      if (succesful)  
      {  
        System.out.println("The bid for lot number " + lotNumber + " was succesful.");  
      }  
      else  
      {  
        Bid highestBid = selectedLot.getHighestBid();  
        System.out.println("Lot number: " + lotNumber + " already has a bid of: " + highestBid.getValue());  
      }  
    }  
  }  
   
  public Lot getLot(int lotNumber)  
  {  
    if((lotNumber >= 1) && (lotNumber < nextLotNumber))  
    {  
      Lot selectedLot = lots.get(lotNumber-1);    
      if (selectedLot.getNumber() != lotNumber)  
      {  
        System.out.println("Internal error: Lot number " + selectedLot.getNumber() + " was returned instead of " + lotNumber);  
        selectedLot = null;  
      }  
      return selectedLot;  
    }  
    else  
    {  
      System.out.println("Lot number: " + lotNumber + " does not exist.");  
      return null;  
    }  
  }  
 
  public void close()  
  {  
    System.out.println("Closing auction.");  
    for (Lot lot : lots)  
    {  
      System.out.println(lot.getNumber() + ": " + lot.getDescription());  
      if (lot.getHighestBid() == null)  
      {  
        System.out.println (" (No bids) ");  
      }  
      else  
      {  
        Bid highestBid = lot.getHighestBid();  
        System.out.println(" sold to " + highestBid.getBidder().getName() + " for " + highestBid.getValue());  
      }  
    }  
  }  
}
