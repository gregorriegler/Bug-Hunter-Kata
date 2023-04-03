package fizzer;

public class Fizzer {
    public String fizz(int number) {
        if (number / 3 == 0) { // Bug! It should return Fizz if the number is divisible by 3. Otherwise it should return the number as a String.
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
