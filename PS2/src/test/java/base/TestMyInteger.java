package base;

import static org.junit.Assert.*;

import org.junit.Test;

import base1.MyInteger;

public class TestMyInteger {

	@Test
	public void Test() {
		//create objects to test
		MyInteger AA = new MyInteger(1);
		MyInteger BB = new MyInteger(2);
		MyInteger CC = new MyInteger(4);

		//create tests
	
		//create isOdd() test
		assertEquals(AA.isOdd(),true);
		assertEquals(BB.isOdd(),false);
		
		//create isPrime() test
		assertEquals(CC.isPrime(),false);
		assertEquals(BB.isPrime(),true);
		
		//create isEven() test
		assertEquals(AA.isEven(),false);
		assertEquals(BB.isEven(),true);
		
		//create isOdd(int) test
		assertEquals(MyInteger.isOdd(5),true);
		assertEquals(MyInteger.isOdd(6),false);
		
		//create isEven(int) test
		assertEquals(MyInteger.isEven(5),false);
		assertEquals(MyInteger.isEven(6),true);
		
		//create isPrime(int) test
		assertEquals(MyInteger.isPrime(2),true);
		assertEquals(MyInteger.isPrime(4),false);
		
		//test MyInteger is prime
		assertEquals(MyInteger.isPrime(BB),true);
		assertEquals(MyInteger.isPrime(CC),false);
		
		//test MyInteger is odd
		assertEquals(MyInteger.isOdd(BB),false);
		assertEquals(MyInteger.isOdd(AA),true);
		
		//test MyInteger is even
		assertEquals(MyInteger.isEven(AA),false);
		assertEquals(MyInteger.isEven(BB),true);
		
		//equals test static
		assertEquals(AA.equals(4),false);
		assertEquals(BB.equals(2),true);
		
		//equals test non-static
		assertEquals(AA.equals(AA),false);
		assertEquals(CC.equals(CC),true);
	}

}
