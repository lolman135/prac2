package prac2;

/**
 * Main class of Practice 2
 * @author Kusovskyi Kyrylo
 */
public class Main {

    /**
     * Main method of project. Calls method from all classes
     * made for this practice work.
     * @param args parameters from command line
     */
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();

        class1.meth1();
        class1.meth3();

        class2.meth2();
        class2.meth3();

        class3.meth3();
    }
}
