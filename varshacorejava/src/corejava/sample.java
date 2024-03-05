package corejava;
import java.util.*;
public class sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a and b values");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
        System.out.println("addition of a="+a+" and b="+b+"is:"+c);
        c=a-b;
        System.out.println("Subtraction of a="+a+" and b="+b+"is:"+c);
	}

}
