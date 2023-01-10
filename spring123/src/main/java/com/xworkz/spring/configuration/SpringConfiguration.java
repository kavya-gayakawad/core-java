package com.xworkz.spring.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")

public class SpringConfiguration {
@Bean
public String email() {
	String string = new String();
	return string;
}
@Bean
	public String chair() {
		String str = new String();
		return str;
	}
@Bean
		public String home () {
			String st = new String();
			return st;
		}
@Bean
			public String bottle() {
				String strg = new String();
				return strg;

}
@Bean
			public String bag() {
				String strng = new String();
				return strng;
			}
		
@Bean
public Double one() {
	System.out.println("one double");
	return 1.1;
}

@Bean
public Double two() {
	System.out.println("two double");
	return 2.6;
}

@Bean
public Double three() {
	System.out.println("three double");
	return 2.5;
}

@Bean
public Double four() {
	System.out.println("four double");
	return 3.9;
}

@Bean
public Double five() {
	System.out.println("five double");
	return 4.9;
}

@Bean
public Boolean a() {
	System.out.println("a is boolean");
	return true;
}

@Bean
public Boolean b() {
	System.out.println("b is boolean");
	return false;
}
@Bean
public Boolean c() {
	System.out.println("c is boolean");
	return true;
}
@Bean
public Boolean d() {
	System.out.println("d is boolean");
	return true;
}
@Bean
public Boolean e() {
	System.out.println("e is boolean");
	return false;
}


@Bean
public StringBuffer buf() {
	StringBuffer buf = new StringBuffer("Buffer 1");
	return buf;
}

@Bean
public StringBuffer buf1() {
	StringBuffer buf1 = new StringBuffer("Buffer 2");
	return buf1;
}

@Bean
public StringBuffer buf2() {
	StringBuffer buf2 = new StringBuffer("Buffer 3");
	return buf2;
}

@Bean
public StringBuffer buf4() {
	StringBuffer buf4 = new StringBuffer("Buffer 4");
	return buf4;
}

@Bean
public StringBuffer buf5() {
	StringBuffer buf5 = new StringBuffer("Buffer 5");
	return buf5;
}
@Bean
public StringBuilder bul() {
	StringBuilder bl = new StringBuilder("Buffer 5");
	return bl;
}

@Bean
public StringBuilder bul1() {
	StringBuilder bl1 = new StringBuilder("Buffer 1");
	return bl1;
}

@Bean
public StringBuilder bul2() {
	StringBuilder bl2 = new StringBuilder("Buffer 5");
	return bl2;
}

@Bean
public StringBuilder bul3() {
	StringBuilder bl3 = new StringBuilder("Buffer 5");
	return bl3;
}

@Bean
public StringBuilder bul4() {
	StringBuilder bl4 = new StringBuilder("Buffer 5");
	return bl4;
}


@Bean
public Map hash() {

HashMap<String,Integer> hs = new HashMap();
			hs.put("a",45);
			hs.put("b",52);
			hs.put("c",34);
			hs.put("d",21);
			hs.put("e",36);
			
			return hs;
}		





@Bean
public ArrayList arr() {

ArrayList<Integer> coll = new ArrayList();
			coll.add(45);
			coll.add(52);
			coll.add(34);
			coll.add(47);
			coll.add(10);
			
			return coll;
}		
		

}
