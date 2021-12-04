package com.testng;

import org.testng.annotations.Test;

public class timeout5 {
	
	@Test(timeOut=2000)
	public void test1() {
		int i=3;
		while(i>2) {
			System.out.println(i);
			i++;
		}
	}

}
