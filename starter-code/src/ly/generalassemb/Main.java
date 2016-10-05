package ly.generalassemb;

/**
 * Starter code for Data Types and Variables Homework
 * Please complete the code per the instructions below.
 *
 * Created by charlie on 6/20/16.
 */
public class Main {

    public static void main(String[] args) {

        // Reminder: comments are anything after // on a single line
        // or anything on one or more lines between /* and */


        /**
         * 1) Fill in an appropriate data type for the following variable declarations based on the initialized value.
         *
         * Hint - the data type of the variable must match the type of the value being assigned to that variable!)
         *
         * Hint 2 - try running the code (right click on this file and select "Run Main.main()" and if you get
         * zero errors then your data types and values all match up
         */
        int varA = 3;
        double varB = 9.75;
        double varC = 4.0;
        double varD = 2.;
        float varE = 8573f;
        String varF = "Macarons are delicious!";
        char varG = '$';
        String varH = "$";
        boolean varI = true;
        boolean varJ = (2 == 3);
        int varK = Integer.valueOf("9235");
        boolean varL = varF.equals("Macarons are delicious!");


        /**
         * 2a) Imagine you need a variable named "price" to represent the cost of an item in an online store.
         * Declare the variable price below, then on the next line assign some value to price.
         *
         * Hint - in the code above we did the declaration and the initialization (or initial assignment
         * of a value) both on the same line. But those are actually two distinct steps that could also
         * be done in separate lines of code.
         */

        int price;
        price = 5;


        /**
         * 2b) Next, image you need a variable for customer comments on an item. Declare comment below and
         * give it an initial value of "placeholder comment" all in one line of code.
         */

        String comment = "placeholder comment";


        /**
         * 3) Predict what the result of the division operation below. Compare your prediction to what
         * is printed to the terminal. If they are the same, explain how you made your prediction in
         * a comment. If they are different, modify the code below so that it will produce the result
         * you expect.
         *
         * Hint - google "integer division"
         */

        int numerator = 10;
        int divisor = 3;
        int divisionResult = numerator / divisor;
        System.out.println(divisionResult);
        //SERKAN: I predicted the printed value on the terminal to be 3; because both numerator and divisor variables
        //are of the int dataType. Division between two int dataTypes only give us another int value; which means
        //that the decimal points are cut off. If we want the actual 3.3333.. value; we must assign the variables as
        //double dataType.
    }
}
