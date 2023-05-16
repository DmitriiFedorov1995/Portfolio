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
                {"", "2", "2"},
                {"+", " ", "2"},
                {"+", "", "2"},
                {"/", "3", " "},
                {"/", "3", ""},
                {"+", String.valueOf(Integer.MAX_VALUE - Integer.MIN_VALUE), String.valueOf(Integer.MIN_VALUE)}, //что это?
                {"/", "one", "two"},
                //проверка ввода значений за границами диапазона
                {"*", String.valueOf((double) Integer.MIN_VALUE-1), "0"},
                {"*", String.valueOf((double) Integer.MAX_VALUE+1), "0"},
                {"*", "0", String.valueOf((double) Integer.MIN_VALUE-1)},
                {"*", "0", String.valueOf((double) Integer.MAX_VALUE+1)},
        };
    }

    // todo: negative test
    @Test(dataProvider = "negativeData", expectedExceptions = {CalculatorException.class})
    public void negativeTest(String operator, String one, String two) throws CalculatorException{
        Calculator.execute(new String[]{operator, one, two});
    }
}
