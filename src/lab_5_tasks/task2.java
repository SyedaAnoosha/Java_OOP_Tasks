package lab_5_tasks;//Demonstrate the use of the following:
//Constructor, Accessors and mutators, static class members.

class Demo{
    private int i;
    private char ch;
    private String str;
    static String str2="Hello World"; //static members

    Demo(String str, char ch){  //Constructors
        this.str=str;
        this.ch=ch;
    }

    public void setI(int i) { // Mutator
        this.i = i;
    }

    public int getI() {   // Accessor
        return i;
    }

    public char getCh() { //Accessor
        return ch;
    }

    public String getStr() { //Accessor
        return str;
    }
    public static void sample(){
        System.out.println("This is static class member"); //static members
    }
}
public class task2 {
    public static void main(String[] args) {
        Demo demo=new Demo("Anoosha", '9');
        demo.setI(4);
        System.out.println(demo.getCh());
        System.out.println(demo.getStr());
        System.out.println(demo.getI());
        Demo.sample();

    }
}
