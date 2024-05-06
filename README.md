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
  String couponCode;
  
  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
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
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
        if (couponCode == "ship50"){
          return 0.85;
        } else {
          return 1.75;
        }
      
    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express", "ship50");
    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
    
    book.ship();
    chemistrySet.ship();
  }
}
