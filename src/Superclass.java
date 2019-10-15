public class Superclass {
    Superclass(){
        System.out.println("Super class Contructor");
    }
    public void display(){
        System.out.println("Display Super");
    }
    public void display(int a){
        System.out.println("Display Super with integer" + a);
    }
    public final void message(){
        System.out.println(" Final methods can not be overridden");
    }

}
