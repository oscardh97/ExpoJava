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
public class Exposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] tests = new String[10];
        tests[0] = "Prueba";
        String[] names = {"Oscar", "David", "Diaz", "Hernandez"};
        
        System.out.println(Integer.toHexString(tests.hashCode()));
        System.out.println(Integer.toHexString(tests[0].hashCode()));
        
        dummyMethod(tests);
        
        /*System.out.println("@MyClass.b\t=>\t" + MyClass.b);
        
        MyClass first = new MyClass();
        System.out.println("@first\t=>\t" + first.toString());
        MyClass second = new MyClass();
        
        System.out.println("@first\t=>\t" + first.toString());
        System.out.println("@second\t=>\t" + second.toString());
        
        first.incrementA();
        second.incrementA();
        
        System.out.println("@first\t=>\t" + first.toString());
        System.out.println("@second\t=>\t" + second.toString());*/
    }
    public static void dummyMethod(String[] tests) {
        System.out.println(Integer.toHexString(tests.hashCode()));
        System.out.println(Integer.toHexString(tests[0].hashCode()));
    }
}
