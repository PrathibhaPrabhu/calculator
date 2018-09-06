package com.teamaankya.calculator;

import org.junit.Test;

import com.teamSankya.calculator.Subtraction;

import junit.framework.TestCase;

public class SubtractionTest {
		@Test
		public void subtractIntTest() {
		//Subtraction subtraction = new Subtraction();
		TestCase.assertEquals(10, Subtraction.subtract(30, 20));
		}
		@Test
		public void subtractDoubleTest() {
		//Subtraction subtraction = new Subtraction();
		TestCase.assertEquals(14,Subtraction.subtract(35, 21));
		}
}

