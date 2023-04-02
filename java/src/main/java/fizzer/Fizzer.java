package fizzer;

public class Fizzer {
    public String fizz(int number) {
        if (number / 3 == 0) { // Bug! It should instead Fizz numbers that are divisible by 3.  
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
