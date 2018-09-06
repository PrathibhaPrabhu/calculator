package com.teamaankya.calculator;

import org.junit.Test;

import com.teamSankya.calculator.Addition;

import junit.framework.TestCase;

public class AdditionSuitTest {
		@Test
		public void addIntTest() {
		Addition addition = new Addition();
		TestCase.assertEquals(50, addition.add(20, 30));
		}
		@Test
		public void addDoubleTest() {
		Addition addition = new Addition();
		TestCase.assertEquals(51.0, addition.add(20.8, 30.2));
		}
}
