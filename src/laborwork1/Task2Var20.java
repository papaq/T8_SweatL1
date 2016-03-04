/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborwork1;

/**
 *
 * @author yural
 */
public class Task2Var20 {
    /**
     * Count number of digits
     * @param number
     * @return number of digits in an input
     */
    public int numberOfDigits(int number) {
        int digits = 0;
        while (number > 0) {            
            digits++;
            number/=10;
        }
        return digits;
    }
    
    /**
     * Shift number right n times
     * @param number is what we shift
     * @param n is a number of shift times
     * @return new number
     */
    public int shiftRight(int number, int n) {
        int digits = numberOfDigits(number);
        if (1 == digits) {
            return number;
        }
        int firstNumberPlace = 1;
        for (int i = 0; i < digits-1; i++) {
            firstNumberPlace*=10;
        }
        for (int i = 0; i < n; i++) {
            number = number%10*firstNumberPlace+number/10;
        }
        return number;
    }
    
    /**
     * Find log of a number
     * @param number 
     * @return natural logarithm
     */
    public double nLog(double number) {
        return Math.log(number);
    }
}

