package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Kirill Lityuchii (Kirill_lityuchii@mail.ru)
* @version 1.0
* @since 1.0
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Kirill Lityuchii";
    String expect = "Echo, echo, echo : Kirill Lityuchii"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}