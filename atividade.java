public class BuggyExample {
  public static int divide(int a, int b) {
    if (b==0){
      return -1 ; // Should throw an except ion, not retum -1
    }
    return a/ b;
}
public static void main(String(] args) {
  int result = divide{1O, O);
  System.out.println("Result : • + result); // This will c rash dueto division by zero
  }
}
