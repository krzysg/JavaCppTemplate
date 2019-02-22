package pl.krzysg;

import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

//@Platform(include="MyCppLib.h")
//@Namespace("MyCppLib")
//public class MyCppLib {
//    static public class MyCppClass extends Pointer {
//        static { Loader.load(); }
//        public MyCppClass() { allocate(); }
//        private native void allocate();
//
//        // to access the member variable directly
//        public native void foo();
//    }
//}

@Properties(
        value = @Platform(include="MyCppLib.h"), target = "MyCppTarget"
)
public class MyCppLibConfig implements InfoMapper {
        public void map(InfoMap infoMap) {
//            infoMap.put(new Info("MyCppClass").pointerTypes("MyCppClass").define());
        }
}
