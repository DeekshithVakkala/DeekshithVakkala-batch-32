class Parent {
    public int parentVariable;   //v1 = parent variable

    public Parent(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}

class Child extends Parent {
    private int childVariable;   //v2 = child variable

    public Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super(0); // Default value for v1
        this.childVariable = childVariable;
    }
}

public class Ram {
    public static void main(String[] args) {
        Parent parent = new Parent(5, 10);
        Child child1 = new Child(1, 2);
        Child child2 = new Child(20, 3);

        System.out.println("parentVariable: " + parent.parentVariable);
        System.out.println("childVariable 1: " + child1.parentVariable);
        System.out.println("childVariable 2: " + child2.parentVariable);
    }
}
