/**
 * Created by Stas on 14.09.2018.
 */

//операция умножения
public class Multiplication extends Operation{

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public double calculateResult() {
        return getNumber1()*getNumber2();
    }
}
