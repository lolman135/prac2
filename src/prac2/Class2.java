package prac2;

/**
 * Class1 implements {@link Interface1} and extends {@link Class3},
 * consists Class3 object as field.
 * Overrides abstract methods {@code meth2()} and {@code meth3()}.
 * @author Kusovkyi Kyrylo.
 */

public class Class2 extends Class3 implements Interface2{

    /**
     * Object of Class3 class.
     */
    Class3 class3;

    /**
     * Implementation of {@code meth2()} from Interface2.
     * Prints a message of indicating it's from Class2.
     */
    @Override
    public void meth2() {
        System.out.println("Method 2 from Class 2");
    }

    /**
     * Implementation of {@code meth3()} from Interface2.
     * Prints a message of indicating it's from Class2.
     */
    @Override
    public void meth3() {
        System.out.println("Method 3 from Class 2");
    }
}
