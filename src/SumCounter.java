class SumCounter {

    static int countSumOfNumbers (int number) {
        int sum = 0;
        int numberAbs = Math.abs(number); //dzięki temu policzymy sumę także dla liczb ujemnych
        //System.out.println("Liczba startowa: " + number); //do testów
            while (numberAbs > 0) {
                sum = sum + numberAbs % 10;
                //System.out.println(numberAbs + " % 10 = " + numberAbs % 10); //do testów
                //System.out.println("suma = " + sum + "\n"); //do testów
                numberAbs = numberAbs / 10;
                //System.out.println(numberAbs); //do testów
            }
            return sum;
        }
}