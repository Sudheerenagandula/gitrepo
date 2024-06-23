package inheritance;

 
interface Paren1{
    void msg();//by default method is abstract and public
    static void disp() {
        System.out.println("Parent 1 static method");
    }
    default void disp1() {
        System.out.println("Parent 1 default method");
    }
}
interface Paren2{
    void msg1();
}
class Chil implements Paren1,Paren2{
    @Override
    public void msg() {
        System.out.println("Parent 1 method");
        
    }
    @Override
    public void msg1() {
        System.out.println("Parent 2 method");
        
    }
    
}
public class MultipleInterface {
    public static void main(String[] args) {
        Chil c=new Chil();
        c.msg();
        Paren1.disp();
        c.msg1();
        c.disp1();
    }
}








 