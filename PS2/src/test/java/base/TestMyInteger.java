package base;

import static org.junit.Assert.*;

import org.junit.Test;

import base1.MyInteger;

public class TestMyInteger {

	@Test
	public void TestOdd() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger BB = new MyInteger(2);

		//create isOdd() test
		assertEquals(AA.isOdd(),true);
		assertEquals(BB.isOdd(),false);
	}
	@Test
	public void TestPrime() {
			//create objects to test
		MyInteger BB = new MyInteger(2);
		MyInteger CC = new MyInteger(4);	
		
		//create isPrime() test
		assertEquals(CC.isPrime(),false);
		assertEquals(BB.isPrime(),true);
	}
	
	@Test
	public void TestEven() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger BB = new MyInteger(2);
		
		//create isEven() test
		assertEquals(AA.isEven(),false);
		assertEquals(BB.isEven(),true);
	}	
	
	@Test 
	public void TestOddInt() {
	
		//create isOdd(integer) test
		assertEquals(MyInteger.isOdd(5),true);
		assertEquals(MyInteger.isOdd(6),false);
	}
	
	@Test
	public void TestEvenInt() {

		//create isEven(int) test
		assertEquals(MyInteger.isEven(5),false);
		assertEquals(MyInteger.isEven(6),true);
	}
	
	@Test
	public void TestPrimeInt() {

		//create isPrime(int) test
		assertEquals(MyInteger.isPrime(2),true);
		assertEquals(MyInteger.isPrime(4),false);
	}
	
	@Test
	public void TestMyIntegerPrime() {
		//create objects to test
		MyInteger BB = new MyInteger(2);
		MyInteger CC = new MyInteger(4);	
		
		//test MyInteger is prime
		assertEquals(MyInteger.isPrime(BB),true);
		assertEquals(MyInteger.isPrime(CC),false);
	}
	
	@Test
	public void TestMyIntegerOdd() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger BB = new MyInteger(2);
		
		//test MyInteger is odd
		assertEquals(MyInteger.isOdd(BB),false);
		assertEquals(MyInteger.isOdd(AA),true);
	}
	
	@Test
	public void TestMyIntergerEven() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger BB = new MyInteger(2);
		
		//test MyInteger is even
		assertEquals(MyInteger.isEven(AA),false);
		assertEquals(MyInteger.isEven(BB),true);
	}
	
	@Test
	public void TestEqualsStatic() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger BB = new MyInteger(2);
		
		//equals test static
		assertEquals(AA.equals(4),false);
		assertEquals(BB.equals(2),true);
	}
	
	@Test
	public void TestEqualsNonStatic() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger CC = new MyInteger(4);	
		
		//equals test non-static
		assertEquals(AA.equals(CC),false);
		assertEquals(CC.equals(CC),true);
	}

}
