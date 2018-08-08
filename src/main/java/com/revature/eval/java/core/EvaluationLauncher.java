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
		
		//8. pig latin
		
		
		test.toPigLatin("apple");
		test.toPigLatin("therapy");
		test.toPigLatin("school");
		test.toPigLatin("yellow");
		test.toPigLatin("quick fast run");
		
		test.isArmstrongNumber(9);
		test.isArmstrongNumber(10);
		test.isArmstrongNumber(153);
		test.isArmstrongNumber(100);
		test.isArmstrongNumber(9474);
		test.isArmstrongNumber(8208);
		
		test.calculatePrimeFactorsOf(12l);
		
		test.calculateNthPrime(10);
		
		test.isValidIsbn("3-598-21508-9");
		
		
		test.isPangram("");
		test.isPangram("abcdefghijklmnopqrstuvwxyz");
	    test.isPangram("the quick brown fox jumps over the lazy dog");
	    test.isPangram("a quick movement of the enemy will jeopardize five gunboats");
	    
	    
	    test.getGigasecondDate(LocalDate.of(2011, Month.APRIL, 25));
	    

	    
	    
	    
//	    public void modernTime() {
//			assertEquals(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40),
//					evaluationService.getGigasecondDate(LocalDate.of(2011, Month.APRIL, 25)));
//		}
//
//		@Test
//		public void afterEpochTime() {
//			assertEquals(LocalDateTime.of(2009, Month.FEBRUARY, 19, 1, 46, 40),
//					evaluationService.getGigasecondDate(LocalDate.of(1977, Month.JUNE, 13)));
//		}
//
//		@Test
//		public void beforeEpochTime() {
//			assertEquals(LocalDateTime.of(1991, Month.MARCH, 27, 1, 46, 40),
//					evaluationService.getGigasecondDate(LocalDate.of(1959, Month.JULY, 19)));
//		}
//
//		@Test
//		public void withFullTimeSpecified() {
//			assertEquals(LocalDateTime.of(2046, Month.OCTOBER, 2, 23, 46, 40),
//					evaluationService.getGigasecondDate(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0)));
//		}
//
//		@Test
//		public void withFullTimeSpecifiedAndDayRollover() {
//			assertEquals(LocalDateTime.of(2046, Month.OCTOBER, 3, 1, 46, 39),
//					evaluationService.getGigasecondDate(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59)));
//		}

	    
	    
//		@Test
//		public void emptySentenceIsNotPangram() {
//			assertFalse(evaluationService.isPangram(""));
//		}
//
//		@Test
//		public void recognizesPerfectLowerCasePangram() {
//			assertTrue(evaluationService.isPangram(""));
//		}
//
//		@Test
//		public void pangramWithOnlyLowerCaseLettersIsRecognizedAsPangram() {
//			assertTrue(evaluationService.isPangram("the quick brown fox jumps over the lazy dog"));
//		}
//
//		@Test
//		public void phraseMissingCharacterXIsNotPangram() {
//			assertFalse(evaluationService.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
//		}
//
//		@Test
//		public void phraseMissingAnotherCharacterIsNotPangram() {
//			assertFalse(evaluationService.isPangram("five boxing wizards jump quickly at it"));
//		}
		
//		@Test
//		public void testWordBeginningWithA() {
//			assertEquals("appleay", evaluationService.toPigLatin("apple"));
//		}
//
//		@Test
//		public void testThTreatedLikeAConsonantAtTheBeginningOfAWord() {
//			assertEquals("erapythay", evaluationService.toPigLatin("therapy"));
//		}
//
//		@Test
//		public void testSchTreatedLikeAConsonantAtTheBeginningOfAWord() {
//			assertEquals("oolschay", evaluationService.toPigLatin("school"));
//		}
//
//		@Test
//		public void testYTreatedLikeAConsonantAtTheBeginningOfAWord() {
//			assertEquals("ellowyay", evaluationService.toPigLatin("yellow"));
//		}
//
//		@Test
//		public void testAWholePhrase() {
//			assertEquals("ickquay astfay unray", evaluationService.toPigLatin("quick fast run"));
//		}
		
		//18.
		int[] set = {3,5};
		test.getSumOfMultiples(20, set);
	}
}
