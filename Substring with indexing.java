/*
string - substring() 
A file name like helpmanual.doc is passed as the input string str to the program. 
Fill in the missing lines of code so that the program prints the file name without the extension. 

Examples: 
- If the input value is helpmanual.doc, 
the output is helpmanual 

- If the input value is profilepic.jpg, 
the output is profilepic 

Hint: Use the combination of indexOf and substring

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		int a=str.indexOf(".");
		System.out.println(str.substring(0,a));
	}
}
