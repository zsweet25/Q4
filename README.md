# Q4
Quarter 4 Project
I'm learning Java
5/20/2024: 50%
I worked on my slides today and yesterday
last class i was a junior and had to see the capstones
Today I worked on my menu, and added some stuff so I dont have an F in the class

What I've learned about so far:
The different types of variables and calling them. There is double (numbers with decimals), int (no decimals), String (text), and boolean (True or False). If you are assigning something to a varible, you HAVE to call one of these before hand.
For example I want to set Shipping to 50.67$, you have to do double shipping = 50.67;
I learned about the basic math operaters that with go along with these, that is + - %% / *, etc. Those are used to do math with numbers or the variables you assign those to
I learned about printing certain things, we primarily used System.out.println(); to print, but you can do it as System.out.print(); if you want it to continue it on the same line
I also learned about how java is an object oriented language and how it works with different classes and the main statement.
Classes and objects are still a little confusing to me but basically classes are just certain real world ideas that you use it with the main statment. Different classes are used in different folders but is still connected.
For example if I have a shipping class, I can use that in the main statment and it will print different things based on the functions that I put.
Functions work basically the same as they do in python, though its a little bit different. When you are first making a function you have to state if it prints nothing, which is void, or a string, double, boolean, int. You also call if it is a private or public function.
Functions also take parameters and we learned different things we can do with the different conditionals we learned
We learned stuff like if else statements, switch statements, return, and the different math operaters that we originally learned.
Im learning stuff with arrays and lists right now, java is pretty different then python so its a little bit of a change

Learned about ArrayLists today. Its an import you have to do to be able to make an array flexable. You call it by doing ArrayList<xxxxx> = new ArrayList<xxx>();
Learned more about Arraylists, I learned how to add and remove them. I learned how to change them and little commands you can do with them like indexOf






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
So with the order you call a book, its filled is True, the cost is 9.99, and they got express shipping, and it will print what is it told to do in the functions.

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
