package com.teamaankya.calculator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.teamSankya.calculator.Division;

@RunWith(Suite.class)
	@SuiteClasses({AdditionTest.class,SubtractionTest.class,
	Division.class,Parameterized.class})
	public class TestCases {
	}
	public class TestRunner {
	public static void main(String[] args) {
	Result result = JUnitCore.runClasses(AdditionTest.class);
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.getMessage());
	}
	System.out.println(result.wasSuccessful());
	}
}
