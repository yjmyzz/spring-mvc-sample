package jimmy.mvc.test;

import jimmy.mvc.enums.SEX;

import org.junit.Test;

public class EnumTest {

	@Test
	public void test() {
		
		for (SEX s : SEX.values()) {
			System.out.println(s.name() + "/" + s.ordinal() + "/" + s.toString());
		}
	}

}
