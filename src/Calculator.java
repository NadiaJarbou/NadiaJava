public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    public int add() {
        return number1 + number2;
    }

    public int sub() {
        return number1 - number2;
    }

    public int mult() {
        return number1 * number2;
    }
    public double div() {
        return (double) number1 / number2;
    }
}
