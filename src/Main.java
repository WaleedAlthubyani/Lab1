import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input*/
        System.out.println("Please enter the first number");
        int numberOne = input.nextInt();
        System.out.println("Please enter the second number");
        int numberTwo = input.nextInt();

        System.out.println(numberOne+"+"+numberTwo+" = "+(numberOne+numberTwo));
        System.out.println(numberOne+"-"+numberTwo+" = "+(numberOne-numberTwo));
        System.out.println(numberOne+"*"+numberTwo+" = "+(numberOne*numberTwo));
        System.out.println(numberOne+"/"+numberTwo+" = "+(numberOne/numberTwo));
        System.out.println(numberOne+" mod "+numberTwo+" = "+(numberOne%numberTwo));

        /*2. Write a Java program that takes a number as input and prints its multiplication table up to 10*/
        System.out.println("Please enter a number for its multiplication table");
        int numberMultiplied = input.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(numberMultiplied+ " x " + i + " = " + (numberMultiplied*i));
        }

        /*3. Write a Java program to print the area and perimeter of a circle.*/
        //area = pi*r^2 perimeter = 2*pi*r
        System.out.println("Please enter the radius");
        double radius = input.nextDouble();
        double pi=Math.PI;

        System.out.println("Perimeter is = " + (2*pi*radius));
        System.out.println("Area is = " + (pi*radius*radius));

        /*4.Java program to find out the average of a set of integers*/
        int userNumberQ4;
        double sum =0;
        double counter=-1;
        do {
            counter++;
            System.out.println("Enter a number or 0 to quit");
            userNumberQ4=input.nextInt();
            sum+=userNumberQ4;
        }while (userNumberQ4!=0);
        System.out.println("The average is: " + (sum/counter));

        /*5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.*/

        System.out.println("Input the first number :");
        int firstNumber=input.nextInt();
        System.out.println("Input the second number :");
        int secondNumber=input.nextInt();
        System.out.println("Input the third number :");
        int thirdNumber=input.nextInt();

        System.out.println((firstNumber+secondNumber==thirdNumber) ? "The result is: true" : "The result is: false");

        /*6. Write a Java program to reverse a word.*/
        System.out.println("Input a word");
        String word = input.next();
        String reverseWord="";
        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord+=word.charAt(i);
        }
        System.out.println("Reverse word: "+reverseWord);

        /*7 - Java program to check whether the given number is even or odd*/
        System.out.println("Please enter a number");
        int evenOdd = input.nextInt();

        System.out.println((evenOdd%2==0) ? "The number is Even":"The number is Odd");

        /*8 - Java program to convert the temperature in Centigrade to Fahrenheit*/

        //F=(9/5 *C)+32
        System.out.println("Please enter the temperature in centigrade");

        double temperature = input.nextDouble();
        System.out.println("Temperature in Fahrenheit is: "+((9.0/5)*temperature+32));//9.0 to make the result double 1.8 rather than an integer 1


        /*9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index*/
        System.out.println("Input a string:");
        String inputtedString = input.nextLine();
        System.out.println("Input a number:");
        int itsIndex = input.nextInt();

        System.out.println(inputtedString.charAt(itsIndex));

        /*10. Write a Java program to print the area and perimeter of a rectangle.*/
        //A=width*height P=2*(width+height
        System.out.println("Please enter the height");
        double height = input.nextDouble();
        System.out.println("Please enter the width");
        double width = input.nextDouble();

        System.out.println("Area is " + width + " * " + height + " = " + (width*height));
        System.out.println("Perimeter is " + 2 +" * ("+ width + " + " + height + ") = " + (2*(width+height)));

        /*11. Write a Java program to compare two numbers.*/
        System.out.println("Enter the first number");
        int firstNumberQ11 = input.nextInt();
        System.out.println("Enter the second number");
        int secondNumberQ11=input.nextInt();
        if(firstNumberQ11 == secondNumberQ11)
            System.out.println(firstNumberQ11+" == "+secondNumberQ11);
        if(firstNumberQ11 != secondNumberQ11)
            System.out.println(firstNumberQ11+" != "+secondNumberQ11);
        if(firstNumberQ11 > secondNumberQ11)
            System.out.println(firstNumberQ11+" > "+secondNumberQ11);
        if(firstNumberQ11 >= secondNumberQ11)
            System.out.println(firstNumberQ11+" >= "+secondNumberQ11);
        if(firstNumberQ11 < secondNumberQ11)
            System.out.println(firstNumberQ11+" < "+secondNumberQ11);
        if(firstNumberQ11 <= secondNumberQ11)
            System.out.println(firstNumberQ11+" <= "+secondNumberQ11);

        /*12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("Please input the seconds");*/
        int secondsInputted = input.nextInt();
        int seconds=secondsInputted%60;
        int minutes=secondsInputted/60%60;
        int hours= secondsInputted/(60*60)%24;
        System.out.println(hours+":"+minutes+":"+seconds);

        /*13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.*/
        System.out.println("Input first number: ");
        int firstNumberEx13 = input.nextInt();
        System.out.println("Input second number: ");
        int secondNumberEx13 = input.nextInt();
        System.out.println("Input third number: ");
        int thirdNumberEx13 = input.nextInt();
        System.out.println("Input fourth number: ");
        int fourthNumberEx13 = input.nextInt();
        boolean equal=false;

        if(firstNumberEx13==secondNumberEx13){
            if (firstNumberEx13==thirdNumberEx13){
                if (firstNumberEx13==fourthNumberEx13)
                    equal=true;
            }
        }

        System.out.println((equal) ? "Numbers are equal!":"Numbers are not equal!");

        /*14. Write a Java program that reads an integer and check whether it is negative, zero, or
        positive*/

        System.out.println("Please enter a number");
        int positiveNegativeZero = input.nextInt();

        if(positiveNegativeZero>0)
            System.out.println("Number is positive");
        else if (positiveNegativeZero<0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");

        /*15.Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 ,
        Don’t count -1).*/
        int userNumber=0;
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=-1;
        do {
            if(userNumber>0)
                positiveCount++;
            else if (userNumber<0)
                negativeCount++;
            else
                zeroCount++;

            System.out.println("enter a number or -1 to quit");
            userNumber= input.nextInt();
        }while(!(userNumber==-1));

        System.out.println(positiveCount+" positives\n" + zeroCount + " zeros\n" + negativeCount + " negatives");

        /*16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.*/
        System.out.println("Input an integer");
        String integer = input.nextInt()+"";
        String reverseInteger ="";
        for (int i = integer.length()-1; i >= 0; i--) {
            reverseInteger+=integer.charAt(i);
        }
        System.out.println(reverseInteger);

        /*17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.*/
        int largestSmallest;
        int largest=0;
        int smallest=0;
        do {
            System.out.println("Enter a number or 0 to quit");
            largestSmallest=input.nextInt();
            if(largestSmallest>largest  || largest==0)
                largest=largestSmallest;
            if (largestSmallest<smallest || smallest==0)
                smallest=largestSmallest;
        }while (largestSmallest!=0);

        System.out.println("The large number is: " + largest + "\nThe small number is: " + smallest);

        /*18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.*/
        System.out.println("Enter a string");
        String stringQ18 = input.nextLine();
        int aCounter=0;
        for (int i = 0; i < stringQ18.length(); i++) {
            if(stringQ18.charAt(i)=='a')
                aCounter++;
        }
        System.out.println("Number of a's: " + aCounter);

    }
}