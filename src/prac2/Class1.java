package prac2;


/**
 * Class1 implements {@link Interface1},
 * consists Interface1 and Interface2 objects as fields.
 * Overrides abstract methods {@code meth1()} and {@code meth3()}.
 * @author Kusovkyi Kyrylo.
 */
public class Class1 implements Interface1{

    /**
     *Objects of Interface1 and Interface2 interfaces.
     */
    Interface1 interface1;
    Interface2 interface2;

    /**
     * Implementation of {@code meth1()} from Interface1.
     * Prints a message of indicating it's from Class1.
     */
    @Override
    public void meth1() {
        System.out.println("Method 1 from Class 1");
    }

    /**
     * Implementation of {@code meth3()} from Interface1.
     * Prints a message of indicating it's from Class1.
     */
    @Override
    public void meth3() {
        System.out.println("Method 3 from Class 1");
    }
}
