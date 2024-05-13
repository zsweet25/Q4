# Q4
Quarter 4 Project
I'm learning Java
5/13/2024: 45%


This is a sample code from a project I was working on.

The code is a basic repersentation of an online delivery service
I learned a lot about if statements, varibles, classes, and other java features
The first public class Order states the variables I would be working with inside of the class which was isFilled, billAmount, and shipping, those are there because we are going to use those later
The next chunk of code is the constructor, its still a little confusing to me but you are taking the varibles that u made before, and calling them the parameters you put. You need to call those parameters in the main statement in order and other stuff u want to do
For example we have the if statement if cost is over 24$, then you print out high value item
The next chunks of code are functions, these are used to print and do stuff that are correlated to the parameters in the constructer.
For example the function public void ship() checks if the box is filled, if it is then you will print shipping, and then the shipping cost value. If NOT though, then you prin that the order is not ready.
The next function is to calculate the shipping. The function is meant to print a double variable, thats why we call it when making the function.
In this function we have something called switch, its basically like an if else statement. So if the shipping type is normal, then the shipping cost is 0, if not then u switch to see if its express, but the defult price would be 0.50$
The last bit is the main statment where you call the variables and it will print out what is used.
So with the order you call a book, its filled Tr

``` Java
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
```
