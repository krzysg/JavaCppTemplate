package pl.krzysg.cppLib;


import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

@Platform(include="MyCppLib.h")
@Namespace("MyCppLib")
public class CppLibManual {
    static public class MyCppClass extends Pointer {
        static { Loader.load(); }
        public MyCppClass() { allocate(); }
        private native void allocate();

        public native void foo();
    }
}
