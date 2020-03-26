import java.util.Scanner;
import java.lang.*;
public class Main{
	public static void main(String arg[])
	{
	int choice; 
	Scanner input= new Scanner(System.in);
      while(true)
      {
      System.out.println("Which calculator you want to use: \n 1. simple calculator \n 2. scientific calculator \n 3.exit");
      choice = input.nextInt();
      if(choice==1)
      {
      	System.out.println("Which function you want to perform: \n 1. addition \n 2. multiplication \n 3. subtraction \n 4. division \n 5.exit");
       	choice = input.nextInt();
      	SimpleCalculator obj =	new SimpleCalculator();
      	if(choice == 1)
      	{
      		obj.sum();
      	} 
      	else if(choice == 2)
      	{
      		obj.multiplication();
      		System.exit(0);
      		break;

      	}
 
      	else if(choice == 3)
      	{
      		obj.subtraction();
      	}
      	else if(choice == 4)
      	{
      		obj.division();
      	}
      	 else if (choice ==5)
    	{
      		System.exit(0);
      	}

      	else
      	{
      		System.out.println("you selected wrong option");

      	}
 
      }
      else if (choice==2)
      {
      	System.out.println("user select scientific calculator");
 		System.out.println("Which function you want to perform: \n 1. power \n 2. sqrroot \n 3. sin \n 4. cos \n 5. tan \n 6.exit");
       	choice = input.nextInt();
      	ScientificCalculator obj =	new ScientificCalculator();
      	if(choice == 1)
      	{
      		obj.power();
      	} 
      	else if(choice == 2)
      	{
      		obj.sqrroot();

      	}
 
      	else if(choice == 3)
      	{
      		obj.sine();
      	}
      	else if(choice == 4)
      	{
      		obj.cosin();
      	}

      	else if(choice == 5)
      	{
      		obj.tangent();
      	}
      	else if (choice ==6)
      	{
      		System.exit(0);
      	}
      	else
      	{
      		System.out.println("you selected wrong option");

      	}

      	
      }
      else if (choice ==3)
    	{
      		System.exit(0);
      	}

      else
      {
      	  	System.out.println("wrong selection");
    
      }
      }
       
	}
}
class SimpleCalculator
{   Scanner input= new Scanner(System.in);
	int num1, num2;
	int result;
	public void sum()
	{
		 
		System.out.println("ENter two number for addition ");
         num1= input.nextInt();
         num2= input.nextInt();
         result = num1+num2;
        System.out.println("answer is "+result);
  	}

	public void multiplication()
	{
		 
		System.out.println("ENter two number for multiplication ");
         num1= input.nextInt();
         num2= input.nextInt();
         result = num1*num2;
        System.out.println("answer is "+result);
  	}
	public void subtraction()
	{
		 
		System.out.println("ENter two number for subtraction ");
         num1= input.nextInt();
         num2= input.nextInt();
         result = num1-num2;
        System.out.println("answer is "+result);
  	}
	public void division()
	{
		 
		System.out.println("ENter two number for division ");
         num1= input.nextInt();
         num2= input.nextInt();
         result = num1/num2;
        System.out.println("answer is "+result);
  	}
}
class ScientificCalculator
{
  Scanner input= new Scanner(System.in);
		double num1, num2;
		double result;
	public void power()
	{
		System.out.println("Enter base number : ");
		num1 = input.nextDouble();
		int flag_count =1;
		System.out.println("Enter power of base number : ");
		num2 = input.nextDouble();
		for(int i=1; i<=num2;i++)
		{
           flag_count*= num1;
		}
		result = flag_count;
		System.out.println("the answer is :"+result);

	}
	public void sqrroot()
	{
         System.out.println("Enter the number for taking its sqrroot: ");
         num1 = input.nextDouble();
		result = Math.sqrt(num1);
		System.out.println("the answer is :"+result);

	}
	 public void sine()
	 {
         System.out.println("Enter the number for taking its sine value: ");
          num1 = input.nextDouble();
		result = Math.sin(num1);
		System.out.println("the answer is :"+result);

		
	}
	public void cosin()
	{
         System.out.println("Enter the number for taking its cosine value: ");
         num1 = input.nextDouble();
		result = Math.cos(num1);
		System.out.println("the answer is :"+result);

		
	}
	public void tangent()
	{
         System.out.println("Enter the number for taking its tangent value: ");
         num1 = input.nextDouble();
		result = Math.tan(num1);
		System.out.println("the answer is :"+result);

		
	}


}





