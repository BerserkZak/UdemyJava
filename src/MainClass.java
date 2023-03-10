public class MainClass {

    public static void main(String[] args) {

    }

    //AllAboutStrings
/*
    public static void StringTests(String string) {
        int length = string.length();
        System.out.printf("The leght is %d %n", length);
        System.out.printf("The leght is %c %n", string.charAt(0));
        System.out.printf("The leght is %c %n", string.charAt(length - 1));
        System.out.printf("Index of char i is %d %n", string.indexOf("i"));
        System.out.printf("Index of char l is %d %n", string.indexOf("l", 3));
        String matchString = string.toLowerCase();
        if (string.equals(matchString)) {
            System.out.println("Equals");
        }
        if (string.equalsIgnoreCase(matchString)) {
            System.out.println("Equals ignore case");
        }
        if (string.startsWith("Collusion")) {
            System.out.println("Start with Collusion");
        }
        if (string.endsWith("Earth")) {
            System.out.println("Ends with Earth");
        }
        if (string.contentEquals("Collusion Earth")) {
            System.out.println("Equals to Collusion Earth");
        }


    }
*/
    //TextBlock
/*
    public static void TextBlock() {
        String name = "Steve";
        int health = 20;

        String bulletin = "Info: \n" +
                "\t• Name: " + name + "\n" +
                "\t\t• Health: " + health + "\n";

        System.out.println(bulletin);

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        for (int i = 1; i <= 1000000; i *= 10) {
            System.out.printf("Number %7d %n", i);
        }

        String formattedString = String.format("Age is %d!", age);
        System.out.println(formattedString);

        formattedString = "Age is %d".formatted(age);
        System.out.println(formattedString);
    }
*/
    //AnimalOOPMain
/*
    public void AnimalOOP() {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStaff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStaff(dog, "fast");

        Dog yorkie = new Dog("Yorkey", 15);
        doAnimalStaff(yorkie, "fast");
        Dog retriever = new Dog("Retriever", 150, "Floppy", "Fluffy");
        doAnimalStaff(retriever, "slow");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStaff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStaff(goldie, "fast");
    }
*/
    //AnimalOOP
/*    public static void doAnimalStaff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");

 */   }
    //POJO and Record Lesson
/*    public static void StudentLoop() {
        for (int i = 1; i <= 5; i++) {
            BeforeOOP.LPAStudent s = new BeforeOOP.LPAStudent("5900" + i,
                    switch (i) {
                    case 1 -> "Mary";
                    case 2 -> "Sancho";
                    case 3 -> "Pego";
                    case 4 -> "Tune";
                    case 5 -> "Mira";
                    default -> "Anon";
                    },
                    "05/11/1998",
                    "Java class");
            System.out.println(s);
        }
    }*/
//        BeforeOOP.BankAccount steveAccount = new BeforeOOP.BankAccount("1", 400, "Steve Mojang","stevemoj@mail.ru",
//                "89999999999");
//        System.out.println(steveAccount.getAccountNumber());
//        System.out.println(steveAccount.getAccountBalance());
//        System.out.println(steveAccount.getCustomerName());
//        System.out.println(steveAccount.getEmail());
//        System.out.println(steveAccount.getPhoneNumber());
//        BeforeOOP.BankAccount steveAccount = new BeforeOOP.BankAccount();
//        BeforeOOP.BankAccount timsAccount = new BeforeOOP.BankAccount("Tim Buche", "me@email.com", "(999) 434-34-34");
//        System.out.println("Acc #: " + timsAccount.getAccountNumber());
//        BeforeOOP.Customer steve = new BeforeOOP.Customer("Steve", "steve@mail.com");
//        System.out.println(steve.getCreditLimit());
//        steve = new BeforeOOP.Customer();
//        System.out.println(steve.getEmailAddress());




    //PersonChallenge
/*
    public static void Persons() {
        BeforeOOP.Person person = new BeforeOOP.Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
*/
    //BeforeOOP.Calculator
/*
    public static void BeforeOOP.Calculator() {
        BeforeOOP.Calculator calculator = new BeforeOOP.Calculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
*/
    //BankChallenge
/*
    public static void banking() {
        BeforeOOP.BankAccount bank = new BeforeOOP.BankAccount();
        bank.setAccountBalance(1000);
        bank.withdrawFunds(500);
        bank.depositFunds(200);
        bank.withdrawFunds(100);
        bank.depositFunds(600);
        bank.withdrawFunds(4000);
        System.out.println(bank.getAccountBalance());
    }
*/
    //Painter
/*    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double remainingBuckets = (width * height) - (areaPerBucket * extraBuckets);
        return (int) ((int) Math.ceil(remainingBuckets / areaPerBucket));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketTotal = Math.ceil(width * height / areaPerBucket);
        return (int) bucketTotal;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaTotal = Math.ceil(area / areaPerBucket);
        return (int) areaTotal;
    }*/
    //InputCalculator
/*
    public static void inputThenPrintSumAndAverage() {
        Scanner userInput = new Scanner(System.in);
        boolean isChar = false;
        double count = 0;
        int sum = 0;
        double avg = 0;

        do {
            String number = userInput.nextLine();

            try {
                int numberToCheck = Integer.parseInt(number);
                count++;
                sum += numberToCheck;
                avg = sum/count;
            } catch (NumberFormatException nfe) {
                isChar = true;
            }

        } while (!isChar);
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
    }
*/
    //MinMax
/*    public static void inputMinMax() {
        Scanner userInput = new Scanner(System.in);
        boolean isChar = false;
        int maxNumber = 0;
        int minNumber = 0;

        do {
            System.out.println("Enter a number or any char to quit the loop");
            String number = userInput.nextLine();

            try {
                int numberToCheck = Integer.parseInt(number);
                if (numberToCheck >= maxNumber) {
                    maxNumber = numberToCheck;
                } else if (numberToCheck < minNumber || minNumber == 0) {
                    minNumber = numberToCheck;
                }

            } catch (NumberFormatException nfe) {
                isChar = true;
            }

        } while (!isChar);
        System.out.println("Min: " + minNumber + " Max: " + maxNumber);

    }*/
    //UserInput
/*
    public static void numberInput() {
        Scanner userNumberInput = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String userNumber = userNumberInput.nextLine();
            try {
                int number = Integer.parseInt(userNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println(sum);
    }
*/
    //Diagonal Star
/*    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int currentRow = 1; currentRow <= number; currentRow++){
            for (int currentColumn = 1; currentColumn <= number; currentColumn++) {
                if ((currentColumn == 1) || (currentRow == 1) || (currentColumn == number) || (currentRow == number)) {
                    System.out.print("*");
                } else if (currentColumn == currentRow) {
                    System.out.print("*");
                } else if (currentColumn == ((number - currentRow + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }*/
    //Largest Prime
/*    public static int getLargestPrime(int number) {
        if (number <= 1 ) {
            return -1;
        }

        int largestPrime = 0;
        int largestPrimeTemp = 0;
        for (int x = 2; x <= (number/2); x++) {
            if (number%x == 0) {
                largestPrimeTemp=getLargestPrime(x);
                if (largestPrimeTemp <= x) {
                    largestPrime = largestPrimeTemp;
                } else {
                    largestPrime = x;
                }
            }
        }

        if (largestPrime == 0) {
            largestPrime = number;
        }
        return largestPrime;
    }*/
    //Flour Pack Problem
/*    public static boolean canPack(int  bigCount, int smallCount, int goal) {
        int totalBigCount = bigCount*5;
        int totalPacksCount = totalBigCount + smallCount;

        if (totalPacksCount == goal) {
            return true;
        }

        if (((bigCount < 0) || (smallCount < 0) || (goal < 0)) || goal == 0) {
            return false;
        }

        if (goal < 5 && smallCount < goal) {
            return false;
        }

        if (totalPacksCount >= goal) {
            if (goal%5 == 0) {
                return true;
            } else if ((smallCount >= goal) || (smallCount >= goal%5)) {
                return true;
            }
            return false;
        }
        return false;
    }*/
    //NumberToWords
/*    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reverseNumber /= 10;
        }
    }*/
    //Reverse
/*    public static int reverse(int number) {
       int reverseNumber = 0;
       while (number != 0) {
           int lastDigit = number%10;
           reverseNumber = reverseNumber*10 + lastDigit;
           number /= 10;
       }
       return reverseNumber;
    }*/
    //getDigitCount
/*    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 1;
            while (number > 9) {
                digitCount++;
                number /= 10;
            }
        return digitCount;
    }*/
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
