package testdemo;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.Hello;

public class test {

	@Test
	public void test() {
		Hello h=new Hello();
		System.out.println(h.say());
		assertEquals("这是maven——java", h.say());
	}
}
