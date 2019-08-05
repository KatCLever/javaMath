/* page 226 #7

	8-1-19
	
	Use the Math class to answer the following: 
	a. square root of 37
	b. sine and cosine of 300
	c. value of floor, ceil and round of 22.8
	d. larger and smaller of the character "D" and the integer of 71 
	e. random number between 0 and 20 
*/


import java.util.Scanner;

public class MathTest
{
	public static void main(String[] args)
	{	
		System.out.println("a.");	
		System.out.println("The square root of 37 is " + Math.sqrt(37));
		System.out.println("");	
		
		System.out.println("b.");	
		System.out.println("The sine of 300 is " + Math.sin(300) + " and the cosine of 300 is " + Math.cos(300));
		System.out.println("");
		
		System.out.println("c.");	
		System.out.println("The floor value of 22.8 is " + Math.floor(22.8));
		System.out.println("The ceiling value of 22.8 is " + Math.ceil(22.8));
		System.out.println("The round value of 22.8 is " + Math.round(22.8));
		System.out.println("");
		
		System.out.println("d.");
		System.out.println("The larger of D and 71 is " + Math.max('D', 71));
        System.out.println("The smaller of D and 71 is " + Math.min('D', 71));
		System.out.println("");	
		
		System.out.println("e.");	
		System.out.println("A random number between 0 and 20 is " + Math.random()*21);	
		System.out.println("");	
		
	}
}



























