 class Animal{
public void makesound(){
    System.out.println("Animal making sound");
}
class cat extends Animal {
    public void makesound() {
        System.out.println("Mew");
    }
}
    class Dog extends animal{
        public void makesound(){
       System.out.println("bow");
        }
    }
    public class main {
        public static void main(string[] args) {
            Animal.animal1 = cat();
            Animal.animal1 = Dog();


        }

    }
}