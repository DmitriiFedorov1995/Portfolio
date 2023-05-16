
import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class PositiveCalculatorTest {
    // todo: @DataProvider for positiveData
    @DataProvider
    public Object[]positiveData(){
        return new Object[][]{
                {"+", "2", "2", 4.0},
                {"-", "2", "2", 0.0},
                {"/", "2", "2", 1.0},
                {"*", "2", "2", 4.0},
                {"-", "2", "1.1", 0.8999999999999999},
                {"/", "1.25", "5", 0.25},
                {"*", "3.45", "-2.5", -8.625},
                {"*", String.valueOf(Integer.MAX_VALUE), "0", 0.0},
                {"*", String.valueOf(Integer.MIN_VALUE), "0", -0.0},
                {"+", String.valueOf(Integer.MAX_VALUE - 0.0000000000000001), String.valueOf(0.0000000000000001), Integer.MAX_VALUE},
                {"-", String.valueOf( Integer.MIN_VALUE + 0.0000000000000001), String.valueOf(0.0000000000000001), Integer.MIN_VALUE}
        };
    }
    // todo: positive test

    @Test(dataProvider = "positiveData")
    public void positiveTest(String operator, String one, String two, double actual){
        Assert.assertEquals( String.valueOf(actual), Calculator.execute(new String[]{operator, one, two}), "test broken");
    }
}