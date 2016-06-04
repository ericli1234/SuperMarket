import java.util.Scanner;

/**
 * The terminal system in a supermarket
 * 
 * @version 1.0 
 */
public class Terminal
{
    public static void main(String[] args)    
    {
        // Initialize the I/O
        Scanner scanner = new Scanner(System.in);
        
        // Add the employees into the system
        Employee tim = new Manager();
        Employee kim = new SalesStaff();
        Employee frank = new WarehouseStaff();
        
        // Show the terminal main screen
        System.out.println("Welcome to the SuperMarket Terminal");
        System.out.println("===================================");
        System.out.println("Please enter your customer ID or staff username: ");
        String input = Scanner.nextLine();
        
        if (input = "tim")
        {
            System.out.print('\u000C');
            System.out.println("Welcome Manager"); 
            System.out.println("Enter an option from the list to perform a task: ");
            System.out.println("1. Maintain Unit Price");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            
        }
        else if (input = "kim")
        {
            
        }
        else if (input = "frank")
        {
            
        }
        else 
        {
            
        }
    }
}
