package snakecamel;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;



public class SnakeCamelTest extends SnakeCamelUtil{

	@Test
	public void snakeToCamelcaseの実行結果その１(){//スネークケースからキャメルケースに変える
		String expected = "Abc";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseの実行結果その２(){//スネークケースからキャメルケースに変える
		String expected = "AbcDef";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc_def");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseの実行結果その３(){//スネークケースからキャメルケースに変える
		String expected = "AbcDefGh";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_gh");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseの実行結果その４(){//スネークケースからキャメルケースに変える
		String expected = "AbcDefGh";
	    String actual = SnakeCamelUtil.snakeToCamelcase("abc__def__gh");
	    assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseの実行結果その５(){//スネークケースからキャメルケースに変える
		String expected = "AbcDef";
	    String actual = SnakeCamelUtil.snakeToCamelcase("_abc_def__");
	    assertThat(actual,is(expected));
	}	
	@Test
	public void camelToSnakecaseの実行結果その１() {//キャメルケースからスネークケースに変える
		String expected = "abc";
	    String actual = SnakeCamelUtil.camelToSnakecase("Abc");
	    assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseの実行結果その２() {//キャメルケースからスネークケースに変える
		String expected = "abc_def";
	    String actual = SnakeCamelUtil.camelToSnakecase("AbcDef");
	    assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseの実行結果その３() {//キャメルケースからスネークケースに変える
		String expected = "abc_def_gh";
	    String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGh");
	    assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeの実行結果その１() {
		String expected = " ";
	    String actual = SnakeCamelUtil.capitalize(" ");
	    assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeの実行結果その2() {
		String expected = "A";
	    String actual = SnakeCamelUtil.capitalize("a");
	    assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeの実行結果その3() {
		String expected = "Xyz";
	    String actual = SnakeCamelUtil.capitalize("xyz");
	    assertThat(actual,is(expected));
	}
}
