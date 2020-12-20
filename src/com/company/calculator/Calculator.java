package com.company.calculator;

public class Calculator {

  Calculator cl = new Calculator();//создаем экземпляр класса для теста мерджа.

  /**
   * Сложение двух чисел
   *
   * @param first  первое слагаемое
   * @param second второе слагаемое
   * @return сумма
   */
  public double add(double first, double second) {
    double result = first + second;
    try {
      return result;
    } catch (Exception e) {
      e.printStackTrace();
    }

    throw new ArithmeticException("Not implemented");
  }


  /**
   * @param first  уменьшаемое
   * @param second вычитаемое
   * @return разность
   */
  public double subtraction(double first, double second) {
    double result = first - second;
    try {
      return result;
    } catch (Exception e) {
      e.printStackTrace();
    }
    throw new ArithmeticException("Not implemented");

  }

  /**
   * @param first  первый множитель
   * @param second второй множитель
   * @return разность
   */

  public double multiply(double first, double second) {
    double result = first * second;
    try {
      return result;
    } catch (Exception e) {
      e.printStackTrace();
    }
    throw new ArithmeticException("Not implemented");

  }
  public void test(int a){
    int b=0;
  }

}