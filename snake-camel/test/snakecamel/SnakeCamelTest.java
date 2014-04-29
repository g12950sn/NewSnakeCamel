package snakecamel;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
//import org.junit.runners.model.InitializationError;


public class SnakeCamelTest extends SnakeCamelUtil{

	@Test
	public void snakeToCamelcase�̎��s����(){//�X�l�[�N�P�[�X����L�������P�[�X�ɕς���
		SnakeCamelUtil camel = new SnakeCamelUtil();
		String expected = "SnakeCamel";
	    String actual = camel.snakeToCamelcase("snake_camel_ ");
	    assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecase�̎��s����() {//�L�������P�[�X����X�l�[�N�P�[�X�ɕς���
		SnakeCamelUtil camel = new SnakeCamelUtil();
		String expected = "snake_camel";
	    String actual = camel.camelToSnakecase("SnakeCamel");
	    assertThat(actual,is(expected));
	}
}
