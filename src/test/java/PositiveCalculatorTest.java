
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
                {"*", "2", "2", 4.0}
        };
    }
    // todo: positive test

    @Test(dataProvider = "positiveData")
    public void positiveTest(String operator, String one, String two, double expected){
        Assert.assertEquals( String.valueOf(expected), Calculator.execute(new String[]{operator, one, two}), "test broken");
    }
}