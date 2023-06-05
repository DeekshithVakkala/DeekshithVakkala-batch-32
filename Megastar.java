interface Ramcharan{
 void method1();
}
interface pawankalyan{
void method2();
}

class Mega implements Ramcharan, pawankalyan{
public void method1(){
System.out.println("Megapowerstar");
}
public void method2(){
System.out.println("Powerstar");
}
}
public class Megastar{
 public static void main(String[] args){
Mega megastar = new Mega();
megastar.method1();
megastar.method2();
}
}
