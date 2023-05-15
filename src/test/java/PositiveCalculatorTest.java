
import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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
                {"*", String.valueOf(Integer.MIN_VALUE), "0", -0.0}
        };
    }
    // todo: positive test

    @Test(dataProvider = "positiveData")
    public void positiveTest(String operator, String one, String two, double actual){
        Assert.assertEquals( String.valueOf(actual), Calculator.execute(new String[]{operator, one, two}), "test broken");
    }
}