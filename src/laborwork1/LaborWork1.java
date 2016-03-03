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
public class LaborWork1 {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Operators oper = new Operators();
        double a = 15.4, b = a*2;        
        System.out.println(""+a+"+"+b+"="+oper.add(a, b));
        System.out.println(""+b+"/"+a+"="+oper.multiply(b, 1/a));
    }
    
}
