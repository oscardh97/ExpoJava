/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exposicion;

/**
 *
 * @author oscardiaz
 */
public class MyClass {
    int a;
    static int b;
    
    MyClass() {
        b++;
    }
    
    void incrementA() {
        a++;
    }
    
    @Override
    public String toString() {
        return "@myClass\t{a: " + a + "; b: " + b;
    }
}
