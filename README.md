# Q4
Quarter 4 Project
I'm learning Java
idk how long its gonna take im just gonna do codecademy
week 1: I got to 15% completion
week 2: maybe 25%
4/29/2024: 26%
4/30/24: 31%
5/2/24: still 31%
5/3/24: 30
5/6/24 = 40%



Ok so basically so far I learned about like the really basic stuff in Java and its taking me a while bc its pretty confusing. Right now Im learning about methods and classes, and how to connect them within the main method and constructor classes. Right now Im working with parameters and public/private variables. I also learned about the basic syntax, like prints, defining variable, and the math that goes along with it. Heres a fun little thing that im working on right now

public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping){
        case "Regular":
          shippingCost = 0;
          break;
        case "Express":
          shippingCost = 1.75;
          break;
        default:
        shippingCost = 0.50;
    return shippingCost;


    }
    
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}
    
    book.ship();
    chemistrySet.ship();
  }
}
