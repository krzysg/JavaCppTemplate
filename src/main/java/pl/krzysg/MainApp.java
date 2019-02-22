package pl.krzysg;

//import pl.krzysg.cppLib.target.*;

import pl.krzysg.cppLib.target.MyCppTarget;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello world from Java!");
        MyCppTarget.MyCppClass x = new MyCppTarget.MyCppClass();

        x.foo();
        System.out.println(x.xyz());
        x.xyz(333);
        System.out.println(x.xyz());
    }

}
