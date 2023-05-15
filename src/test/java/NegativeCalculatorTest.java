import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    // todo: @DataProvider for negativeData
    @DataProvider
    public Object[] negativeData(){
        return new Object[][]{
                {"+", String.valueOf(Integer.MAX_VALUE), "2"},
                {"-", "2", String.valueOf(Integer.MIN_VALUE)},
                {"/", "2", "0"},
                {":", "2", "2"},
                {" ", "2", "2"},
                {"+", " ", "2"},
                {"/", "3", " "}
        };
    }

    // todo: negative test
    @Test(dataProvider = "negativeData", expectedExceptions = {CalculatorException.class})
    public void negativeTest(String operator, String one, String two) throws CalculatorException{
        Assert.assertEquals( CalculatorException.class, Calculator.execute(new String[]{operator, one, two}), "test broken");
    }
}
