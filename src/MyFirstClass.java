public class MyFirstClass {

    public static void main(String[] args) {

    }



    //PerfectNumber
/*    public static boolean isPerfectNumber(int number) {
        int sumOfProperDivisors = 0;

        for (int i = 1;i < number;i++)
            if (number % i == 0)
                sumOfProperDivisors += i;

        return sumOfProperDivisors == number && number > 1;
    }*/
    //Greatest Common Divisor
/*    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestDivisor = 0;
        int minDigit = first<second ? first : second;

        for (int i = minDigit; minDigit > 1; i--) {
            if (first%i == 0 && second%i == 0) {
                return greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }*/
    //FactorsOfDigit
/*    public static void printFactors(int number) {
        int digitFactor = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        while (digitFactor <= number) {
            digitFactor++;
            if (number%digitFactor == 0) {
                System.out.println(digitFactor);
            }
        }
    }*/
    //Palindrome
/*    public static boolean isPalindrome(int number) {
        int newNumber = number;
        int reverse = 0;

        while (newNumber != 0) {
            int remainder = newNumber%10;
            reverse = reverse*10 + remainder;
            newNumber = newNumber/10;
        }

        return number == reverse;
    }*/
    //FirstAndLastDigits
/*    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number%10;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            number /= 10;
        }
        return  lastDigit + number;
    }*/
    //SumEvenNumbers
/*    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }

        while (number >= 2) {
            int checkDigit = number%10;
            number /= 10;
            if (checkDigit%2 == 0) {
                sum += checkDigit;
            }
        }
        return sum;
    }*/
    //SharedDigit
/*   public static boolean hasSharedDigit(int x,int y) {
        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        }else {
            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
        }
    }*/
    //LastDigitChecker
/*    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10) || (x > 1000) || (y < 10) || (y > 1000) || (z < 10) || (z > 1000)) {
            return false;
        }
        int xLastDigit = x%10;
        int yLastDigit = y%10;
        int zLastDigit = z%10;

        if ((xLastDigit == yLastDigit) || (zLastDigit == yLastDigit) || (xLastDigit == zLastDigit)) {
            return true;
        } return false;
    }

    public static boolean isValid(int x) {
        if ((x < 10) || (x > 1000)) {
            return false;
        } return true;
    }*/





}
