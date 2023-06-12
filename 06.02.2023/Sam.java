// Create a class with a static variable of type int and a static method that returns an int.

//write a static block to initialize the static variable by calling the static method.

class chey{
    static int staticVariable;
}

static {
    staticVariable = initilizeStaticVaribale(){
        return 10;
        }
}
        static int getStaticvariable(){
        return staticvariable;
        }
public class Sam {

    static void main(String[] args) {
        int value = MyClass.getStaticVariable();
        System.out.println("Static variable");
    }
}