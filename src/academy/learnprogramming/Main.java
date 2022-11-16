package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Primitive Data Types: float and double");
        System.out.println();//spaceline

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;


        System.out.println("Float minimun value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDouble);
        System.out.println("Double maximum value: " + myMaxDouble);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2f;

        //int myIntTotal = (int)myFloatValue + (int)myDoubleValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        //System.out.println("myIntTotal: " + myIntTotal);
    }
}