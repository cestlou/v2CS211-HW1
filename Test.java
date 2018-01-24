import java.util.*;
import java.awt.*;

public class Test {
   public static void main(String[] args) {
      Purchase p = new Purchase("dildos", 2000, 6.66);
      double x = p.getCost();
      System.out.println(x);
      System.out.println(p.toString());
   }
}

