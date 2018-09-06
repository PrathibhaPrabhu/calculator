package com.teamsankya.calculator;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Addition {
	final static Logger LOGGER = Logger.getLogger(Addition.class);

	static {
		Layout layout = new SimpleLayout();
		Appender appender;
		Appender a = new ConsoleAppender(layout);
		LOGGER.addAppender(a);
		try {
			appender = new FileAppender(layout, "log.html", true);
			// 3rd parameter is true by default
			// true = Appends the data into my.txt
			// false = delete previous data and re-write
			LOGGER.addAppender(appender);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

   public static int add(int a,int b) {
	   LOGGER.info("adding 2 int"+a+" "+b);
	   return a+b;
   }
   public static double add(double a,double b) {
	   return a+b;
   }
   public static long add(long a,long b) {
	   return a+b;
   }
   public static float add(float a, float b)
   {
	   return a+b;
   }
}
