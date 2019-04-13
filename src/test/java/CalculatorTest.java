import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  @Test
  public void MultiplyWithTwoIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(2, calc.multiply(1, 2));
    assertEquals(30, calc.multiply(5, 6));
    assertEquals(66, calc.multiply(6, 11));
  }

  @Test
  public void MultiplyWithTwoNegativeIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(2, calc.multiply(-1, -2));
    assertEquals(30, calc.multiply(-5, -6));
    assertEquals(66, calc.multiply(-6, -11));
  }

  @Test
  public void MultiplyWithOneNegativeIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(-2, calc.multiply(-1, 2));
    assertEquals(-30, calc.multiply(5, -6));
    assertEquals(-66, calc.multiply(6, 11));
  }

  @Test
  public void MultiplyWithZeroReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(0, calc.multiply(105, 0));
    assertEquals(0, calc.multiply(-24, 0));
    assertEquals(0, calc.multiply(0, 0));
  }

  @Test
  public void AdditionWithTwoIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(3, calc.add(1, 2));
    assertEquals(42, calc.add(19, 23));
    assertEquals(19, calc.add(19, 0));
    assertEquals(-42, calc.add(-5, -37));
  }

  @Test
  public void DivisionWithTwoIntegerReturnFalse() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(-2, calc.subtract(1, 2));
    assertEquals(-84, calc.subtract(8, 4));
    assertEquals(6, calc.subtract(6, 0));
    assertEquals(2, calc.subtract(-8, 10));
  }

  @Test
  public void DivisionWithTwoIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(1, calc.divide(2, 2));
    assertEquals(6, calc.divide(66, 11));
    assertEquals(4, calc.divide(24, 6));
  }

  @Test
  public void ModuloWithNonZeroIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(1, calc.modulo(3, 2));
    assertEquals(1, calc.modulo(8, 7));
    assertEquals(-4, calc.modulo(-19, 5));
  }

  @Test
  public void ModuloWithOneZeroIntegerReturnTrue() {
    Calculator calc = new Calculator();

    // assert statements
    assertEquals(0, calc.modulo(11, 0));
    assertEquals(0, calc.modulo(0, 24));
  }
}
