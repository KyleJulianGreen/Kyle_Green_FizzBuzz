public class FizzBuzz {
    public String FizzBuzz(int number) {

        int x = 3;
        int y = 5;
        int z = number;
        if  ((number % x) == 0 && (number % y) == 0) {
            return "FizzBuzz";
        } else if ((number % x) == 0) {
            return "Fizz";
        } else if ((number % y) == 0) {
            return "Buzz";
        }
            else return ""+number;
    }
}