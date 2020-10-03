import java.util.Date;
import java.util.Scanner;  // Import the Scanner class
public class Main {

    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        
        System.out.println("Is member enter true or false");
        Boolean isMember = Boolean.parseBoolean(myObj.nextLine());
        String membershipType; 
        if(isMember){
        System.out.println("Enter Membership type: Premium, Silver, Gold");
        membershipType = myObj.nextLine();
        }
        else{
            membershipType ="None";
            
        }
        Customer c1 = new Customer(userName, isMember, membershipType);
        System.out.println("Customer Detailts"+c1.toString());
      
        Visit v1 = new Visit(c1, new Date());
        
        System.out.println("Enter Product Expense");
        Double productExpense = Double.parseDouble(myObj.nextLine());
        v1.setProductExpense(productExpense);
        
        System.out.println("Enter Service Expense");
        Double serviceExpense = Double.parseDouble(myObj.nextLine());
        v1.setServiceExpense(serviceExpense);
     
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
}
