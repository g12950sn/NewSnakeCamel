package snakecamel;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;



public class SnakeCamelTest extends SnakeCamelUtil{

	@Test
	public void snakeToCamelcase�̎��s���ʂ��̂P(){//�X�l�[�N�P�[�X����L�������P�[�X�ɕς���
		String expected = "Abc";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcase�̎��s���ʂ��̂Q(){//�X�l�[�N�P�[�X����L�������P�[�X�ɕς���
		String expected = "AbcDef";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc_def");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcase�̎��s���ʂ��̂R(){//�X�l�[�N�P�[�X����L�������P�[�X�ɕς���
		String expected = "AbcDefGh";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_gh");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcase�̎��s���ʂ��̂S(){//�X�l�[�N�P�[�X����L�������P�[�X�ɕς���
		String expected = "AbcDefGh";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc__def__gh");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcase�̎��s���ʂ��̂T(){//�X�l�[�N�P�[�X����L�������P�[�X�ɕς���
		String expected = "AbcDef";
	    String actual = SnakeCamelUtil.snakeToCamelcase("_abc_def__");
	    assertThat(actual,is(expected));
	}	
	@Test
	public void camelToSnakecase�̎��s���ʂ��̂P() {//�L�������P�[�X����X�l�[�N�P�[�X�ɕς���
		String expected = "abc";
	    String actual = SnakeCamelUtil.camelToSnakecase("Abc");
	    assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecase�̎��s���ʂ��̂Q() {//�L�������P�[�X����X�l�[�N�P�[�X�ɕς���
		String expected = "abc_def";
	    String actual = SnakeCamelUtil.camelToSnakecase("AbcDef");
	    assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecase�̎��s���ʂ��̂R() {//�L�������P�[�X����X�l�[�N�P�[�X�ɕς���
		String expected = "abc_def_gh";
	    String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGh");
	    assertThat(actual,is(expected));
	}
	@Test
	public void capitalize�̎��s���ʂ��̂P() {
		String expected = " ";
	    String actual = SnakeCamelUtil.capitalize(" ");
	    assertThat(actual,is(expected));
	}
	@Test
	public void capitalize�̎��s���ʂ���2() {
		String expected = "A";
	    String actual = SnakeCamelUtil.capitalize("a");
	    assertThat(actual,is(expected));
	}
	@Test
	public void capitalize�̎��s���ʂ���3() {
		String expected = "Xyz";
	    String actual = SnakeCamelUtil.capitalize("xyz");
	    assertThat(actual,is(expected));
	}
}
