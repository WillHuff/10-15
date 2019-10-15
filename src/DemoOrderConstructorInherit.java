public class DemoOrderConstructorInherit {
    public static void main(String[] a) {
        Subclass ss = new Subclass();
        int a = 10;
        ss.display(); // overridden method is being invoked
        ss.display("Hello"); //Sub class’s display is invoked
        ss.display(a); // base class’s display is invoked
        ss.message(); //final method is invoked
    }
}