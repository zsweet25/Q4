# Q4
Quarter 4 Project
I'm learning Java
idk how long its gonna take im just gonna do codecademy
week 1: I got to 15% completion
week 2: maybe 25%
4/29/2024: 26%
4/30/24: 31%
5/2/24: still 31%
5/3/24: 3055



Ok so basically so far I learned about like the really basic stuff in Java and its taking me a while bc its pretty confusing. Right now Im learning about methods and classes, and how to connect them within the main method and constructor classes. Right now Im working with parameters and public/private variables. I also learned about the basic syntax, like prints, defining variable, and the math that goes along with it. Heres a fun little thing that im working on right now

public class Store {
  String productType;
  double price;
    
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
    
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
    
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price * tax;
    return totalPrice;
  }

}
public class Main {
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
  }
}
