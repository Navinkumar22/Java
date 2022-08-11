/*
method - Introduction 
A method declaration can have six components. 
1.Modifiers — such as public, private, default and protected (we will learn about their implications in later chapters) 
2.Return type — the data type of the value returned by the method, or void if the method does not return a value. 
3.Method name - the name of the method 
4.Argument (Parameter) list within parenthesis — a comma-delimited list of input parameters, 
preceded by their data types, enclosed by parentheses, (). 
If there are no parameters, you must use empty parentheses. 
5.An exception list — We will discuss this in later chapters once we learn about Exceptions in Error Handling. 
6.Method body - enclosed between braces (the method's code, including the declaration of local variables, goes here) Naming a method: 
By convention, method names should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, followed by adjectives, nouns, etc. 
In multi-word names, the first letter of each of the second and following words should be capitalized. 
Examples: addNumbers checkValidity A valid method definition to add two numbers is given below. 

public int addTwoNumbers(int firstNumber, int secondNumber){ 
    return firstNumber+secondNumber; 
    
}



Fill in the missing lines of code so that the program defines a method called addThreeNumbers 
which will accept three int variables and return their sum.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Main m=new Main();
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
		System.out.println(m.addThreeNumbers(a,b,c));
	}
	public int addThreeNumbers(int x,int y,int z){
	    return x+y+z;
	}
}
