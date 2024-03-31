
/***
 * 
 * Driver to test the checker
 * 
 * @author tai
 *
 */
public class HomeworkDriver {
  public static void main(String[] args) {

    // these should be balanced
    System.out.println("the next four should be balanced: ");
    Checker test = new Checker("({}){}{[()()](())}");
    System.out.println(test.checkBalance());
    test = new Checker("(\"I know\", she said (though she said it uncertainly))");
    System.out.println(test.checkBalance());
    test = new Checker("x*{3+5*[2+4(x-2)]-6}");
    System.out.println(test.checkBalance());
    test = new Checker(
        "public static void main(String[] args) { System.out.println(\"Checking for balanced braces...\"); int[] count = new int[10]; for (int i = 1; i < count.length; i++) { count[i] = 2*i; }}");
    System.out.println(test.checkBalance());

    // these should NOT be balanced
    System.out.println("the next four should NOT be balanced: ");
    test = new Checker("{(})");
    System.out.println(test.checkBalance());
    test = new Checker(")What? (I don't know)");
    System.out.println(test.checkBalance());
    test = new Checker("{x+3](2-x]+4}");
    System.out.println(test.checkBalance());
    test = new Checker("public static void main(String[] args) { \n");
    System.out.println(test.checkBalance());
  }

}
