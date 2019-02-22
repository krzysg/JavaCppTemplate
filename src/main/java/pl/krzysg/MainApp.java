package pl.krzysg;

//import pl.krzysg.cppLib.target.*;
import pl.krzysg.cppLib.CppLibManual;
import pl.krzysg.cppLib.target.MyCppTarget;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello world from Java!");

        // Test of automatically generated wrapper
        MyCppTarget.MyCppClass x = new MyCppTarget.MyCppClass();

        x.foo();
        System.out.println(x.xyz());
        x.xyz(333);
        System.out.println(x.xyz());

        // Test of manually created wrapper
        CppLibManual.MyCppClass cm = new CppLibManual.MyCppClass();
        cm.foo();
    }

}
