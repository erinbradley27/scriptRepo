
package challengequestions;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ShoppingCart {
    private Item[] cart;
    private int nextItem;
    private Formatter output;
    
    public ShoppingCart()
    {
        cart = new Item[100];
        nextItem = 0;
    }
    
    public void addItem(Item item)
    {
        cart[nextItem] = item;
        nextItem++;
    }
    
    public void recepit(double taxRate, double shippingCost)
    {
        double subTotal = 0.0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a name for your reciept: ");
        try{
            output = new Formatter(scan.next());
        } catch (FileNotFoundException e){
            System.out.println("There was an error with ya file");
            System.exit(1);
        }
      
        for(int i = 0; i < nextItem; i++)
        {
            output.format("%-15s %6.2f%n", cart[i].getName(), 
                    cart[i].getPrice());  
            
            subTotal += cart[i].getPrice();
        }
        
        output.format("%nShipping: %6.2f  Subtotal: %6.2f  Total: %6.2f%n", 
                shippingCost, subTotal, subTotal*(1 + taxRate) + shippingCost);
        
        if(output != null)
            output.close();
    }
}
