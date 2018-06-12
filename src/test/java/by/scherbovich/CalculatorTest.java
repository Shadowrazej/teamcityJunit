package by.scherbovich;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    ArithmeticException e = new ArithmeticException();

    private Calculator calculator = new Calculator();

    @Test
    public void addPosPos() throws Exception {
        assertEquals(50, calculator.add(20, 30), 0);
    }

    @Test
    public void addPosNeg() throws Exception {
        assertEquals(10, calculator.add(20, -10), 0);
    }

    @Test
    public void addNegPos() throws Exception {
        assertEquals(5, calculator.add(-20.5, 25.5), 0);
    }

    @Test
    public void addNegNeg() throws Exception {
        assertEquals(-59, calculator.add(-25.6, -33.4), 0);
    }

    @Test
    public void addMaxValue() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calculator.add(Double.MAX_VALUE, Double.MAX_VALUE), 0);
    }

    @Test
    public void subtractPosPos() throws Exception {
        assertEquals(45, calculator.subtract(100, 55), 0);
    }

    @Test
    public void subtractPosNeg() throws Exception {
        assertEquals(155, calculator.subtract(100, -55), 0);
    }

    @Test
    public void subtractNegPos() throws Exception {
        assertEquals(-155, calculator.subtract(-100, 55), 0);
    }

    @Test
    public void subtractNegNeg() throws Exception {
        assertEquals(-45, calculator.subtract(-100, -55), 0);
    }

    @Test
    public void subtractMaxValue() throws Exception {
        assertEquals(Double.NEGATIVE_INFINITY, calculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE), 0);
    }

    @Test
    public void multiplyPosPos() throws Exception {
        assertEquals(125, calculator.multiply(25, 5), 0);
    }

    @Test
    public void multiplyPosNeg() throws Exception {
        assertEquals(-125, calculator.multiply(25, -5), 0);
    }

    @Test
    public void multiplyNegPos() throws Exception {
        assertEquals(-125, calculator.multiply(-25, 5), 0);
    }

    @Test
    public void multiplyNegNeg() throws Exception {
        assertEquals(125, calculator.multiply(-25, -5), 0);
    }

    @Test
    public void multiplyMaxValue() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calculator.multiply(Double.MAX_VALUE, 2), 0);
    }

    @Test
    public void dividePosPos() throws Exception {
        assertEquals(2.5, calculator.divide(5, 2), 0);
    }

    @Test
    public void dividePosNeg() throws Exception {
        assertEquals(-2.5, calculator.divide(5, -2), 0);
    }

    @Test
    public void divideNegPos() throws Exception {
        assertEquals(-2.5, calculator.divide(-5, 2), 0);
    }

    @Test
    public void divideNegNeg() throws Exception {
        assertEquals(2.5, calculator.divide(-5, -2), 0);
    }

    @Test
    public void divideMinValue() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(1, Double.MIN_VALUE), 0);
    }

    @Test
    public void calculateTest() throws Exception {
        assertEquals(10, calculator.calculate(20, 2, "/"), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() throws Exception {
        calculator.divide(50, 0);
    }

}