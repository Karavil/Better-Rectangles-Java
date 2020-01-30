/**
   Source Code: BRectTester.java
   Author: Alp Karavil
   Student ID: 5827197
   Assignment: Program #4 BetterRectangle

   Course: 3337-Programming II
   Section: U09
   Instructor: William Feild
   Due Date: 10/18/2018 - Beginning of class

   I hereby certify that this collective work is my own
   and none of it is the work of any other person or entity

   Signature:


   Language: Java
   Compile/Run:
   javac BRectTester.java BetterRectangle.java
   java BRectTester
 
   ------------------------------------------------------------------

   Description:
   This is a tester class for the BetterRectangle class which extends the
   java.awt.Rectangle class. This tester creates four (4) better rectangles,
   using each of the required constructors. Next, utilizing one of the
   rectangles, this class executes all of the added accessor methods. Then,
   using two of the remaining rectangles, the Tester will execute the
   utility methods (and the equals() method), comparing the two rectangles.
   Finally, using the remaining rectangle, this tester will execute the mutator
   method.

   This tester will print the expected values while testing the accessor,
   utility, and mutator methods to make sure output is correct.

   Input:
   No input is needed, the created BetterRectangles objects are hard-coded
   into this tester class.

   Output:
   
   This program output will print information regarding to the 4 created
   BetterRectangle objects, then print information about BetterRectangle A
   using accessor methods, print expected values, then print utility checks
   between BetterRectangle B and C along with expected values, and then finally
   print mutator method information, along with expected values, that will
   be performed on BetterRectangle D.

   Process:
   1. Create 4 BetterRectangles with different constructors
   2. Print information about all 4
   3. Use and print accessor methods on first BetterRectangle
   4. Print expected values
   5. Use and print utility methods between second and third
   6. Print expected outcome
   7. Use and print mutator, scaleBy(multiplier) method, on last BetterRectangle
   8. Print expected outcome

   No particular algorithms are used.

   Known Bugs: None
**/

//Import Point class which is used for the midpoint of a BetterRectangle
import java.awt.Point;

public class BRectTester {

   public static void main(String[] args) {
      BetterRectangle bRectA = new BetterRectangle(3, 4);
      BetterRectangle bRectB = new BetterRectangle(bRectA);
      BetterRectangle bRectC = new BetterRectangle(1, 1, 4, 3);
      BetterRectangle bRectD = new BetterRectangle();

      // Print information about the BetterRectangles (toString() is called)
      System.out.println("Rectangle A: " + bRectA.toString());
      System.out.println("Rectangle B: " + bRectB.toString());
      System.out.println("Rectangle C: " + bRectC.toString());
      System.out.println("Rectangle D: " + bRectD.toString());
      System.out.println();

      System.out.println("Accessor methods being executed for Rectangle A...");
      accessorCheck(bRectA, "A");

      // Print expected values for the accessor check
      System.out.println("Expected values:");
      System.out.println("area: 12");
      System.out.println("perimeter: 14");
      System.out.println("slope: 1.33");
      System.out.println("midpoint: (1,1)");
      System.out.println();

      System.out.println("Utility methods being executed for Rectangle B and " + "C...");
      utilityCheck(bRectB, "B", bRectC, "C");

      // Print the expected values for the utility check
      System.out.println("Expected values:");
      System.out.println("B is equal to C: false");
      System.out.println("B is congruent to C: true");
      System.out.println("B is equivalent to C: true");
      System.out.println("B is similar to C: true");
      System.out.println("B is concentric to C: false");
      System.out.println();

      final int FIRST_MULTIPLIER = 4;
      final int SECOND_MULTIPLIER = -4;
      System.out.println("Mutator methods being executed for Rectangle D...");
      mutatorCheck(bRectD, "D", FIRST_MULTIPLIER, SECOND_MULTIPLIER);

      // Print expected values for the mutator check.
      System.out.println("Expected values:");
      System.out
            .println("[x=0,y=0,width=1,height=1][area=1,perimeter=4," + "slope=1.0,mid-point=java.awt.Point[x=1,y=1]]");
      System.out.println("Scale by 4 true");
      System.out.println("Scale by -4 false");
      System.out.println(
            "[x=0,y=0,width=4,height=4][area=16,perimeter=16," + "slope=1.0,mid-point=java.awt.Point[x=1,y=1]");
      System.out.println();
   }

   /**
    * Calls and prints the accessor methods provided by the BetterRectangle class.
    * 
    * @param rectangleInput BetterRectangle which will be accessed
    * @param rectangleName  Name of this BetterRectangle
    */
   private static void accessorCheck(BetterRectangle rectangleInput, String rectangleName) {
      // Store all accessor methods
      int area = rectangleInput.getArea();
      int perimeter = rectangleInput.getPerimeter();
      float slope = rectangleInput.getSlope();
      Point midPoint = rectangleInput.getMidPoint();

      // Print stored accessor values
      System.out.println(rectangleName + ": " + rectangleInput.toString());
      System.out.println("area: " + area);
      System.out.println("perimeter: " + perimeter);
      System.out.println("slope: " + slope);
      System.out.println("midpoint: " + midPoint.toString());
      System.out.println();
   }

   /**
    * Calls and prints utility methods between BetterRectangle inputs.
    * 
    * @param rectangle1     BetterRectangle that will be compared (1)
    * @param rectangle1Name Name of BetterRectangle rectangle1 parameter
    * @param rectangle2     BetterRectangle that will be compared (2)
    * @param rectangle2Name Name of BetterRectangle rectangle2 parameter
    */
   private static void utilityCheck(BetterRectangle rectangle1, String rectangle1Name, BetterRectangle rectangle2,
         String rectangle2Name) {
      // Store utility method results
      boolean equalResult = rectangle1.equals(rectangle2);
      boolean congruentResult = rectangle1.congruent(rectangle2);
      boolean equivalentResult = rectangle1.equivalent(rectangle2);
      boolean similarResult = rectangle1.similar(rectangle2);
      boolean concentricResult = rectangle1.concentric(rectangle2);

      // Print utility method results
      System.out.println(rectangle1Name + ": " + rectangle1.toString());
      System.out.println(rectangle2Name + ": " + rectangle2.toString());

      System.out.println(rectangle1Name + " is equal to " + rectangle2Name + ": " + equalResult);
      System.out.println(rectangle1Name + " is congruent to " + rectangle2Name + ": " + congruentResult);
      System.out.println(rectangle1Name + " is equivalent to " + rectangle2Name + ": " + equivalentResult);
      System.out.println(rectangle1Name + " is similar to " + rectangle2Name + ": " + similarResult);
      System.out.println(rectangle1Name + " is concentric to " + rectangle2Name + ": " + concentricResult);
      System.out.println();
   }

   /**
    * Calls and prints mutator method, scaleBy(multiplier), on inputted
    * BetterRectangle.
    * 
    * @param inputRectangle BetterRectangle that will be mutated
    * @param rectangleName  Name of the BetterRectangle input
    * @param firstScale     Integer that will be used by the scaleBy(multiplier)
    *                       method first.
    * @param secondScale    Integer that will be used by the scaleBy(multiplier)
    *                       method second.
    */
   private static void mutatorCheck(BetterRectangle inputRectangle, String rectangleName, int firstScale,
         int secondScale) {
      // Print information about this BetterRectangle before mutation.
      System.out.println(rectangleName + ": " + inputRectangle.toString());

      // Store multiplier values.
      final int SCALE_MULTIPLIER_1 = firstScale;
      final int SCALE_MULTIPLIER_2 = secondScale;

      // Call the mutator methods, and store boolean values regarding success.
      boolean scaleResult1 = inputRectangle.scaleBy(SCALE_MULTIPLIER_1);
      boolean scaleResult2 = inputRectangle.scaleBy(SCALE_MULTIPLIER_2);

      // Print information about mutator success
      System.out.println("Scale by " + SCALE_MULTIPLIER_1 + " " + scaleResult1);
      System.out.println("Scale by " + SCALE_MULTIPLIER_2 + " " + scaleResult2);
      // Print information about this BetterRectangle after the mutation
      System.out.println(rectangleName + ": " + inputRectangle.toString());
      System.out.println();
   }
}