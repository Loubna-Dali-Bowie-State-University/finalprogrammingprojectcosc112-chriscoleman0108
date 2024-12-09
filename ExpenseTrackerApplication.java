/*User Manual: Enter atleast 1 expense. Type the number of the selection you are choosing and then press enter. 
When adding an expense, type the name, press enter, type the amount (in dollars) then press enter again.*/
import java.util.Scanner;
public class ExpenseTrackerApplication
{
	public static void main(String[] args) {
	    System.out.println("Welcome to Expense Tracker Application.");
	    
	    Scanner scnr = new Scanner(System.in);
	    String[] expenses = new String[100];
	    int[] expenseBudget = new int[100];
	    int[] prices = new int[100];
	    int opt1 = 0;
	    int p = 0;
	    int budgetTot = 0;
	    int categoryBudget = 0;
	    int optCount = 0;
	    int total = 0;
	    
	for(int i = 0; i<1;){
		System.out.println("Select an option.");
		System.out.println("1. Add new expenses.");
		System.out.println("2. View summaries.");
		System.out.println("3. Set budget limits.");
		System.out.println("4. Exit the program.");
	    int option = scnr.nextInt();
	    
	if(option == 3){
	    System.out.println("Set budget limits:");
        System.out.println("1. Set total budget.");
        System.out.println("2. Set category budget limits.");
        System.out.println("3. Exit to main menu.");
        int budgetOpt = scnr.nextInt();
        
    if (budgetOpt == 1) {
        System.out.println("Enter the total budget amount:");
        budgetTot = scnr.nextInt();
        System.out.println("Total budget is " + budgetTot);
        
    } else if (budgetOpt == 2) {
        for (int a = 0; a < optCount; a++) {
	        if(expenses[a] != null){
	        System.out.println("Would you like to set a budget for "+ expenses[a] +"?");
	        System.out.println("Select 1 for yes and 2 for no.");
	        int categoryChecker = scnr.nextInt();
	        if(categoryChecker == 1){
	        System.out.println("Enter the budget for "+ expenses[a]);
	        int budgetCategory = scnr.nextInt();
	        expenseBudget[a] = budgetCategory;
	        }
	        }
        }
    } else if (budgetOpt == 3) {
        System.out.println("Returning to main menu.");
        
    } else {
        System.out.println("You did not select a valid option.");
    }
    
}else if(option == 1){
	   do{
	    System.out.println("Select an option."); 
	    System.out.println("1. Add a new expense.");
	    System.out.println("2. View expenses.");
	    System.out.println("3. Edit expenses.");
	    System.out.println("4. Exit.");
	    opt1 = scnr.nextInt();
	    
	    if(opt1 == 1){
	        System.out.println("Insert the name of the expense:");
	        System.out.println("Insert the price of the expense.");
	        String d0notusel0l = scnr.nextLine();
	        String expense = scnr.nextLine();
	        int price = scnr.nextInt();
	        
            if (optCount < expenses.length) {
            expenses[optCount] = expense;
            prices[optCount] = price;
            optCount++;
            System.out.println("Expense added successfully.");

            } else {
            System.out.println("Error. You exceed the 100 expense limit.");
            }
            
	    }else if(opt1 == 2){
	       System.out.println("Your expenses:");
             for (int l = 0; l < optCount; l++) {
            if(expenses[l] != null){
             System.out.println((l + 1) + ". " + expenses[l]);
             System.out.println("$" + prices[l]);
             }
             }
            System.out.println("Would you like to exit expenses? Enter 1 if yes. Enter another number if you want to stay in expenses.");
	        int check = scnr.nextInt();
	        if(check == 1){
	        p++;
	        }
	        
	    }else if(opt1 == 3){
	        System.out.println("Enter the number of the expense you would like to edit.");
	        System.out.println("To delete/ignore an expense, enter 0 for the price.");
	        int change = scnr.nextInt();
	        change -= 1;
	        if(expenses[change] != null){
	        System.out.println("You are changing " +expenses[change]);
	        System.out.println("1. To change the expense.");
	        System.out.println("2. Change the price of the expense.");
	        int option13 = scnr.nextInt();
	        if(option13 == 1){
	        System.out.println("Enter the new name of the expense.");
	        String IGNORE = scnr.nextLine();
	        expenses[change] = scnr.nextLine();
	        
	        }else if(option13 == 2){
	       System.out.println("Enter the new price of the expense.");
	       System.out.println("You are changing " +expenses[change]+ "'s price of "+prices[change]);
	        prices[change] = scnr.nextInt();
	        }else{
	        System.out.println("The option you selected was not 1 or 2.");
	        }
	    }else{
	       System.out.println("The number you entered is not a valid expense.");
	    }
	    }else if(opt1 ==4){
	        p++;
	    }else{
	   System.out.println("You did not enter a valid number.");
	   }
	    }while(p<1);
	    
	    }else if(option == 2){
	    for (int l = 0; l < optCount; l++) {
	        if(expenses[l] != null){
            System.out.println((l + 1) + ". " + expenses[l]);
            System.out.println("The expenses are: " + "$" + prices[l]);
            if(expenseBudget[l] == 0){
            System.out.println("No budget has been set.");
            }else{
            System.out.println("The budget for this item is: "+"$" + expenseBudget[l]);
            System.out.println("You are $ "+(expenseBudget[l]-prices[l])+" under budget for "+expenses[l]);
            }
            if(expenseBudget[l] != 0 && expenseBudget[l]<prices[l]){
                System.out.println("You are over budget for "+expenses[l]+"!");
            }
        total += prices[l];
	    }
	    }
	    System.out.println("Your total expenses are: $" +total);
	    if(budgetTot == 0){
	    System.out.println("You have not yet entered a budget");
	    }else{
	   System.out.println("Your budget is: $" + budgetTot);
	   System.out.println("You are under budget by $"+(budgetTot-total));
	    }
	    if(budgetTot<total && budgetTot != 0){
	    System.out.println("You are over budget!");
	    }
	   System.out.println("Would you like to exit the program? Enter 1 if you do. Enter another number if you want to stay in the program.");
	    int exit12 = scnr.nextInt();
	    if(exit12 == 1)
	    i++;
	    
	   }else if(option == 4){
	    i++;
	    }else{
        System.out.println("The number you entered is invalid.");
	    }
	}
	}
}