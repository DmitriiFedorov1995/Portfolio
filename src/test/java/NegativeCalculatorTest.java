import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    // todo: @DataProvider for negativeData
    @DataProvider
    public Object[]negativeData(){
        return new Object[][]{
                {"+", String.valueOf(Integer.MAX_VALUE), "2", 4.0},
                {"-", "2", String.valueOf(Integer.MIN_VALUE), 0.0},
                {"/", "2", "0", 1.0},
                {":", "2", "2", 4.0}
        };
    }

    // todo: negative test
    @Test(dataProvider = "negativeData", expectedExceptions = {CalculatorException.class})
    public void negativeTest(String operator, String one, String two, double expected) throws CalculatorException{
        Assert.assertEquals( String.valueOf(expected), Calculator.execute(new String[]{operator, one, two}), "test broken");
    }
}
