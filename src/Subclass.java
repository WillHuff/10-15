public class Subclass {
    Subclass(){
        System.out.println("Subclass Constructor"); }
    //@Override
    public void display() { //super.display();
        System.out.println("Display Subclass"); }
    public void display(String s) {
        System.out.println("Display Subclass with String " + s); //Overloading in sub class
    } // @Override
// public void message(){ //Can not be overridden by the sub class
// }
}
}
