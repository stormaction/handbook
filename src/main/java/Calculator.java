public class Calculator {
  public int add(int a, int b) {
    return (a + b);
  }

  public int subtract(int a, int b) {
    return (a - b);
  }

  public int multiply(int a, int b) {
    return (a * b);
  }

  public int divide(int a, int b) {
    if (b != 0)
      return (a / b);
    else
      return (0);
  }

  public int modulo(int a, int b) {
    if (b != 0)
      return (a % b);
    else
      return (0);
  }
}
