
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
                //проверка граничных значений ввода/вывода
                {"+",String.valueOf(0), String.valueOf(Integer.MIN_VALUE), Integer.MIN_VALUE},  // нижняя граница диапазона для result и value2
                {"+",String.valueOf(Integer.MIN_VALUE), String.valueOf(0.001), Integer.MIN_VALUE+0.001},     //"справа" от нижней границы для result и нижняя граница для value1
                {"+",String.valueOf(0), String.valueOf(Integer.MAX_VALUE), Integer.MAX_VALUE},  // верхняя граница диапазона для result и value2
                {"-",String.valueOf(Integer.MAX_VALUE), String.valueOf(0.001), Integer.MAX_VALUE-0.001},  // "слева" от верхней гранцы  для result и верхняя граница для value1

                {"+",String.valueOf(Integer.MIN_VALUE+0.001), String.valueOf(0.001), Integer.MIN_VALUE+0.002},     //"справа" от нижней границы value1
                {"-",String.valueOf(Integer.MAX_VALUE-0.001), String.valueOf(0.001), Integer.MAX_VALUE-0.002},      //"слева" от верхней гранцы value1

                {"+",String.valueOf(0.001), String.valueOf(Integer.MIN_VALUE+0.001), Integer.MIN_VALUE+0.002},     //"справа" от нижней границы value2
                {"-",String.valueOf(0.001) , String.valueOf(Integer.MAX_VALUE-0.001), 0.002 - Integer.MAX_VALUE},  //"слева" от верхней гранцы value2

                //операции с целыми числами
                {"+", "2", "2", 4.0},
                {"-", "2", "2", 0.0},
                {"/", "2", "2", 1.0},
                {"*", "2", "2", 4.0},
                {"-", "2", "4", -2.0},
                {"+", "2", "-2", 0.0},
                {"-", "-2", "2", -4.0},

                //операции над числами с плавающей точкой
                {"+", "2.001", "2.001", 4.002},
                {"-", "2", "1.1", 0.899},
                {"/", "1.25", "5", 0.250},
                {"*", "3.45", "-2.5", -8.625},
        };
    }
    // todo: positive test

    @Test(dataProvider = "positiveData")
    public void positiveTest(String operator, String one, String two, double actual){
        double x = Double.parseDouble(Calculator.execute(new String[]{operator, one, two}));
        Assert.assertEquals(actual, x, 0.001);
    }
}