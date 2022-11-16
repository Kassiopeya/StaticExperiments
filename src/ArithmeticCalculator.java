public class ArithmeticCalculator {
    private int a;
    private int b;
    private Operation operationType;
    double result;
    ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate (Operation operationType) throws Exception {
        if (operationType == Operation.ADD) {
            result = a + b;
        } else if (operationType == Operation.MULTIPLY) {
            result = a * b;
        } else if (operationType == Operation.SUBTRACT) {
            result = a - b;
        } else {
            //на тот случай, если "кто-то" добавит новый вариант enum Operation, а в метод дополнить забудет
            throw new Exception("ошибка во входных параметрах");
        }
    }

    public double getResult() {
        return result;
    }
}
