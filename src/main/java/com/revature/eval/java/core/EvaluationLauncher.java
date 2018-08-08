package com.revature.eval.java.core;

import com.revature.eval.java.core.EvaluationService.Triangle;

public class EvaluationLauncher {
	public static void main(String[] args) {
		EvaluationService test = new EvaluationService();
		
		//1.
		System.out.println(test.reverse("example"));
		
		//2.
		String str = " James Rho ";
		System.out.println(test.acronym(str));
		
		//3.
		Triangle testTriangle = new Triangle(2,2,1);
		if(testTriangle.isEquilateral())
		{
			System.out.println("The triangle is equilateral");
		}
		else if(testTriangle.isIsosceles())
		{
			System.out.println("The triangle is isosceles");
		}
		else
		{
			System.out.println("The triangle is scalene ");
		}
		
		//4.
		System.out.println("------4------");
		System.out.println("The example word is CABBAGE");
		System.out.println("The score is " +test.getScrabbleScore("cabbage"));
		
		//5.
		System.out.println("------5------");
		test.cleanPhoneNumber("+1 (613)-995-0253");
		test.cleanPhoneNumber("+1 614.356.9999");
		
		//6.
		System.out.println("------6------");
		test.wordCount("hi hi there is james");
		
		//7.
		
		//18.
		int[] set = {3,5};
		test.getSumOfMultiples(20, set);
	}
}
