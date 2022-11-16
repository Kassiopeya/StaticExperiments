public class Main {
    public static void main(String[] args) throws Exception {
//        ДЗ 6.5
//        Product product1 = new Product("Бутылка кефира", 2, 1);
//        Product product2 = new Product("Полбатона", 3, 1);
//        int count = Product.getCount();
//        double averagePrice = Product.getAveragePrice();
//        System.out.println("Общее количество: " + count);
//        System.out.println("Средняя стоимость: " + averagePrice);

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(2,3);
        arithmeticCalculator.calculate(Operation.ADD);
        System.out.println("Результат сложения: "+ arithmeticCalculator.getResult());
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        System.out.println("Результат умножения: "+ arithmeticCalculator.getResult());
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        System.out.println("Результат вычитания: "+ arithmeticCalculator.getResult());
        }
    }