package JavaBasics;

import org.testng.annotations.Test;

public class TestMayorMenor {
	
	@Test
	public void probarMayorMenor() {
		
		MayorMenor obj = new MayorMenor (100.200);
		
		System.out.println(obj.getNum1());
		System.out.println(obj.getNum2());
		
	}
	

}
