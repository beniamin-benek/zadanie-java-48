import java.util.Random;

class Main {

    public static void main(String[] args) {

        int number1 = 1234; //test
        System.out.println("Suma cyfr liczby " + number1 + ": " + SumCounter.countSumOfNumbers(number1));

        int number2 = -25; //test
        System.out.println("Suma cyfr liczby " + number2 + ": " + SumCounter.countSumOfNumbers(number2));

        int number3 = 9; //test
        System.out.println("Suma cyfr liczby " + number3 + ": " + SumCounter.countSumOfNumbers(number3));

        int number4 = 999; //test
        System.out.println("Suma cyfr liczby " + number4 + ": " + SumCounter.countSumOfNumbers(number4));

        Random rand = new Random();
        int number5 = rand.nextInt(1000); //test

        System.out.println("Suma cyfr liczby " + number5 + ": " + SumCounter.countSumOfNumbers(number5));

    }
}