//fibonacci series using recursion in java


import java.util.*;
import java.util.Scanner;
class fibonacci{
    public int fibo(int x){
        if(x<=1){
            return x;
        }else{
            return fibo(x-1)+fibo(x-2);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		fibonacci obj=new fibonacci();
		for(int i=0;i<n;i++){
		    System.out.print(obj.fibo(i)+" ");
		}
	}
}
