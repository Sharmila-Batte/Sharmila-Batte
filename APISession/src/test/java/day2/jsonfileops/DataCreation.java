package day2.jsonfileops;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.testng.annotations.Test;

public class DataCreation {
	@Test
	public void testCase1() {

		Faker jf = new Faker();
		System.out.println(jf.idNumber());
		System.out.println(jf.phoneNumber());
		System.out.println(jf.internet().safeEmailAddress());
		System.out.println(jf.internet().password(5, 10));
	}

}
