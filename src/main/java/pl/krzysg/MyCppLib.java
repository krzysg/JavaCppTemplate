package pl.krzysg;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include="MyCppLib.h")
@Namespace("MyCppLib")
public class MyCppLib {
    static public class MyCppClass extends Pointer {
        static { Loader.load(); }
        public MyCppClass() { allocate(); }
        private native void allocate();

        // to access the member variable directly
        public native void foo();
    }
}
