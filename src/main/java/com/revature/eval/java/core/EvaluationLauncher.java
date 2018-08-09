package com.revature.eval.java.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.Test;

import com.revature.eval.java.core.EvaluationService.Triangle;

public class EvaluationLauncher {
	public static void main(String[] args) {
		EvaluationService test = new EvaluationService();
		
		//1.
		System.out.println("-------1-------");
		System.out.println(test.reverse("example"));
		
		//2.
		System.out.println("---------2----------");
		
		String str = " James Rho ";
		System.out.println(test.acronym(str));
		
		
		//3.
		System.out.println("-------------3--------");
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
		
		//8. pig latin
		
		System.out.println("-------------8----------");
		test.toPigLatin("apple");
		test.toPigLatin("therapy");
		test.toPigLatin("school");
		test.toPigLatin("yellow");
		test.toPigLatin("quick fast run");
		
		System.out.println("----------9------------");
		test.isArmstrongNumber(9);
		test.isArmstrongNumber(10);
		test.isArmstrongNumber(153);
		test.isArmstrongNumber(100);
		test.isArmstrongNumber(9474);
		test.isArmstrongNumber(8208);
		
		System.out.println("-----------------10-------------");
		test.calculatePrimeFactorsOf(12l);
		
		System.out.println("----------------12--------------");
		test.calculateNthPrime(10);
		
		System.out.println("--------------15------------");
		test.isValidIsbn("3-598-21508-9");
		
		System.out.println("--------------16------------");
		test.isPangram("");
		test.isPangram("abcdefghijklmnopqrstuvwxyz");
	    test.isPangram("the quick brown fox jumps over the lazy dog");
	    test.isPangram("a quick movement of the enemy will jeopardize five gunboats");
	    
	    
	    System.out.println("-------------------17--------------");
	    test.getGigasecondDate(LocalDate.of(2011, Month.APRIL, 25));
	    test.getGigasecondDate(LocalDate.of(1977, Month.JUNE, 13));
	    test.getGigasecondDate(LocalDate.of(1959, Month.JULY, 19));

	    

		//18.
		/*******************************************************************
		 * Question 18
		 ******************************************************************/
	    System.out.println("-------------18---------------");
	    int[] set3= {3,5};
	    test.getSumOfMultiples(20, set3);
	    
	    int[] set = {4,6};
	    test.getSumOfMultiples(15, set);
	    
	    int[] set1 = {5,6,8};
	    test.getSumOfMultiples(150, set1);
	    int[] set4= {5,25};
	    test.getSumOfMultiples(51, set4);
	    
	    
	    
	    System.out.println("--------------------19----------------");
	    //test.isLuhnValid("");
	    //test.isLuhnValid("4539 1488 0343 6467");//true
//	    test.isLuhnValid("046 454 286");
//	    test.isLuhnValid("046 454 287");//false
//	    test.isLuhnValid("8273 1232 7352 0569");//false
	    test.isLuhnValid("046a 454 286");//false
	    test.isLuhnValid("055-444-285");//false;
	    
	    System.out.println("-----------------20------------");
	    test.solveWordProblem("what is 10 plus 20");
	    test.solveWordProblem("what is -10 plus -20");
	    test.solveWordProblem("what is -10 multiplied by -3");
//
//		public void testThatAValidCanadianSocialInsuranceNumberIsIdentifiedAsValidV1() {
//			assertTrue(evaluationService.isLuhnValid("046 454 286"));
//		}
//
//		@Test
//		public void testThatAnInvalidCanadianSocialInsuranceNumberIsIdentifiedAsInvalid() {
//			assertFalse(evaluationService.isLuhnValid("046 454 287"));
//		}
//
//		@Test
//		public void testThatAnInvalidCreditCardIsIdentifiedAsInvalid() {
//			assertFalse(evaluationService.isLuhnValid("8273 1232 7352 0569"));
//		}
//
//		@Test
//		public void testThatAddingANonDigitCharacterToAValidStringInvalidatesTheString() {
//			assertFalse(evaluationService.isLuhnValid("046a 454 286"));
//		}
//
//		@Test
//		public void testThatStringContainingPunctuationIsInvalid() {
//			assertFalse(evaluationService.isLuhnValid("055-444-285"));
//		}

	    
	  
//		@Test
//		public void testSumOfMultiplesOf4and6UpToFifteen() {
//
//			int[] set = { 4, 6 };
//			int output = evaluationService.getSumOfMultiples(15, set);
//			assertEquals(30, output);
//
//		}
//
//		@Test
//		public void testSumOfMultiplesOf5and6and8UpToOneHundredFifty() {
//
//			int[] set = { 5, 6, 8 };
//			int output = evaluationService.getSumOfMultiples(150, set);
//			assertEquals(4419, output);
//
//		}
//
//		@Test
//		public void testSumOfMultiplesOf5and25UpToFiftyOne() {
//
//			int[] set = { 5, 25 };
//			int output = evaluationService.getSumOfMultiples(51, set);
//			assertEquals(275, output);
//
//		}
//
//		@Test
//		public void testSumOfMultiplesOf43and47UpToTenThousand() {
//
//			int[] set = { 43, 47 };
//			int output = evaluationService.getSumOfMultiples(10000, set);
//			assertEquals(2203160, output);
//
//		}
//
//		@Test
//		public void testSumOfMultiplesOfOneUpToOneHundred() {
//
//			int[] set = { 1 };
//			int output = evaluationService.getSumOfMultiples(100, set);
//			assertEquals(4950, output);
//
//		}
	
	}
}
