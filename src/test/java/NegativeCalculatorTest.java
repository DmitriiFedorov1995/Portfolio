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
                //проверка вывода результата за границами диапазона
                {"+", String.valueOf(Integer.MAX_VALUE), "0.001"},// result не существует за верхней границей
                {"-", String.valueOf(Integer.MIN_VALUE), "0.001"}, //result не существует за нижней границей
                //проверка ввода значений за границами диапазона
                {"*", String.valueOf((double) Integer.MIN_VALUE-0.001), "0"}, //value1 не существует за нижней границей
                {"*", String.valueOf((double) Integer.MAX_VALUE+0.001), "0"}, //value1 не существует за верхней границей
                {"*", "0", String.valueOf((double) Integer.MIN_VALUE-0.001)}, //value2 не существует за нижней границей
                {"*", "0", String.valueOf((double) Integer.MAX_VALUE+0.001)}, //value2 не существует за верхней границей

                //проверка осноных исключений
                {"/", "2", "0"}, //деление на ноль
                {":", "2", "2"}, //несуществующий оператор ":"
                {" ", "2", "2"}, //несуществующий оператор " "
                {"", "2", "2"},  //несуществующий оператор ""
                {"+", " ", "2"},
                {"+", "", "2"},
                {"/", "3", " "},
                {"/", "3", ""},
                {"/", "one", "two"},
        };
    }

    // todo: negative test
    @Test(dataProvider = "negativeData", expectedExceptions = {CalculatorException.class})
    public void negativeTest(String operator, String one, String two) throws CalculatorException{
        Calculator.execute(new String[]{operator, one, two});
    }
}
