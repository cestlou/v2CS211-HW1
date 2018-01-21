import java.util.*;
import java.awt.*;

public class Purchase {
   private double pricePerUnit;
   private String itemName;
   private int unitsPurchased; 
     
   public Purchase(String itemName, int unitsPurchased, double units){
      this.pricePerUnit = units;
      this.itemName = itemName;
      this.unitsPurchased = unitsPurchased;   
   }
   
//    public Purchase(String itemName, double units){
//       this(itemName, units, null);
//       itemName = "";
//       units = 0.0;      
//    }  
   
   public double getPricePerUnit() {
      return this.pricePerUnit;
   }
   
   public String getItemName() {
      return this.itemName;
   }
   
   public int getUnitsPurchased() {
      return this.unitsPurchased;
   }
   
   public double getCost() {
      return getUnitsPurchased() * getPricePerUnit();
   }
   
   public String toString() {
      String s = "";
      // s = itemName + ", number of units: " + unitsPurchased + 
      
      return s.format("Name of product: %s, units purchased: %s, and price per unit: %s", itemName, unitsPurchased, pricePerUnit);
   }
}

