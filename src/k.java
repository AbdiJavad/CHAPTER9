  public class TestCircleWithPrivateDataFields {
   /** Main method */
           public static void main(String[] args) {
          // Create a circle with radius 5.0
                  TestCircleWithPrivateDataFields myTestCircleWithPrivateDataFields = new TestCircleWithPrivateDataFields(5.0);
          System.out.println("The area of the circle of radius "
                  + myTestCircleWithPrivateDataFields.getRadius() + " is " + myTestCircleWithPrivateDataFields.getArea());
         
          // Increase myCircle's radius by 10%
                  myTestCircleWithPrivateDataFields.setRadius(myTestCircleWithPrivateDataFields.getRadius() * 1.1);
          System.out.println("The area of the circle of radius "
                  + myTestCircleWithPrivateDataFields.getRadius() + " is " + myTestCircleWithPrivateDataFields.getArea());
         
          System.out.println("The number of objects created is "
                  + TestCircleWithPrivateDataFields.getNumberOfObjects());
          }

         private String getArea() {
         }

         private static String getNumberOfObjects() {
         }

         private void setRadius(double v) {
         }

         private String getRadius() {
         }
  }