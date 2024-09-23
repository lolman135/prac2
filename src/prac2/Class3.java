package prac2;


/**
 * Class1 implements {@link Interface3}.
 * Overrides abstract method {@code meth3()}.
 * @author Kusovkyi Kyrylo.
 */
public class Class3 implements Interface3{

    /**
     * Implementation of {@code meth3()} from Interface3.
     * Prints a message of indicating it's from Class3.
     */
    @Override
    public void meth3() {
        System.out.println("Method 3 from Class 3");
    }
}
