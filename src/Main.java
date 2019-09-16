import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //2. Divide 2 numbers input by user.
        double num1 = 0;
        double num2 = 0;
        getDiv(num1, num2);

        //3. Sort 5 letters input by user.
        ArrayList<String> letters = new ArrayList<>();
        getAlpha(letters);

        //4. Get the length of a string.
        String word = "";
        getLength(word);

        //5. Get the average of three numbers.
        double[] numbers = {0,0,0};
        getAverage(numbers);

        //6. Check if a year is a leap year.
        int year = 0;
        getLeapYear(year);

        //7. Count all words in the sentence: "The dog jumped over the fence."
        String sentence = "The dog jumped over the fence.";
        getNumberWords(sentence);

        //9. Print 5 random numbers given a bound.
        int[] randomNumbers = {0,0,0,0,0};
        getRandomNumbers(randomNumbers);

        //10. Print a random word from the array list (module, class, implement).
        ArrayList<String> words = new ArrayList<>();
        getRandomWord(words);

        //11. Output whether a user input integer is even or odd.
        int integer = 0;
        getEvenOdd(integer);

    }
    //2. Method to divide 2 numbers input by user.
    public static void getDiv(double num1, double num2){
        Scanner key = new Scanner(System.in);
        System.out.println("Let's divide two numbers.");
        System.out.println("Please enter a number (numerator): ");
        num1 = key.nextDouble();
        key.nextLine();
        System.out.println("Please enter a number other than zero (denominator): ");
        num2 = key.nextDouble();
        key.nextLine();
        if(num2 != 0){
            double div = num1 / num2;
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(3);
            System.out.println(num1 + " divided by " + num2 + " equals " + nf.format(div));
        }else{
            System.out.println(num1 + " divided by " + num2 + " is undefined because you cannot divide by zero.");
        }
    }
    //3. Method to alphabetize 5 letters input by user.
    public static void getAlpha(ArrayList letters){
        Scanner key = new Scanner(System.in);
        System.out.println("I will ask you for 5 letters.");
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter letter number " + (i + 1) + ": ");
            letters.add(key.nextLine());
        }
        Collections.sort(letters);
        System.out.println("Your letters in alphabetical order are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(letters.get(i) + " ");
        }
        System.out.println();
    }
    //4. Method to get length of word.
    public static void getLength(String word){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a word and I will tell you its length: ");
        word = key.nextLine();
        System.out.println("Your word has " + word.length() + " letters.");
    }
    //5. Method to get the average of 3 numbers.
    public static void getAverage(double[] numbers) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter three numbers and I will tell you their average.");
        for (int i = 0; i <3; i++){
            System.out.println("Please enter number #" + (i + 1) + ":");
            numbers[i] = key.nextDouble();
            key.nextLine();
        }
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            average = sum / (i+1);
        }
        System.out.println("The average of your numbers is " + average + ".");
    }
    //6. Method to check if a year is a leap year.
    public static void getLeapYear(int year){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a year and I will tell you if it is a leap year: ");
        year = key.nextInt();
        key.nextLine();
        String leapYear = "";
        if(year % 400 == 0) {
            leapYear = "yes";
        }else if (year % 100 == 0) {
            leapYear = "no";
        }else if(year % 4 == 0){
            leapYear = "yes";
        }else{
            leapYear = "no";
        }
        if(leapYear.equalsIgnoreCase("yes")){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
    //7. Method to get the number of words in the sentence.
    public static void getNumberWords(String sentence){
        String[] sentenceWords = sentence.split(" ");
        System.out.println("\"" + sentence + "\" has " + sentenceWords.length + " words.");
    }
    //9. Method to print 5 random numbers given a bound.
    public static void getRandomNumbers(int[] randomNumbers){
        Scanner key = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter a number greater than 10 and I will give you 5 random numbers up to your number: ");
        int bound = key.nextInt();
        key.nextLine();
        System.out.print("Today's random numbers are: ");
        for (int i = 0; i < 5; i++){
            randomNumbers[i] = 1 + r.nextInt(bound);
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
    }
    //10. Method to get a random word from the array list words.
    public static void getRandomWord(ArrayList words) {
        Collections.addAll(words, "module", "class", "implement");
        Random r = new Random();
        int randomWordIndex = r.nextInt(2);
        String randomWord = words.get(randomWordIndex).toString();
        System.out.println("Here is a random word: " + randomWord);
    }
    //11. Method to get whether a user input integer is even or odd.
    public static void getEvenOdd(int integer){
        Scanner key = new Scanner(System.in);
        System.out.println("Please input a number and I will tell you if it is even or odd: ");
        integer = key.nextInt();
        key.nextLine();
        if(integer % 2 == 0){
            System.out.println(integer + " is even.");
        }else{
            System.out.println(integer + " is odd.");
        }
    }
}
