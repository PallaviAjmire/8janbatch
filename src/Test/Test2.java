package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test2 {
@Test
public void test1() {
System.out.println("test1");	
}
@Test
public void test2() {
	System.out.println("test2");
}
@Test
public void test3() {
	System.out.println("test 3");
}
@Test
@Parameters({"firstnumber","secondnumber"})
public void sample(int a, int b ) {
	System.out.println("a+b");
}
}
