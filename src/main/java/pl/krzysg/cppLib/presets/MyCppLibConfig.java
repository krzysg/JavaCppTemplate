package pl.krzysg.cppLib.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(
        value = @Platform(include="MyCppLib.h"),
        target = "pl.krzysg.cppLib.target.MyCppTarget"
)
public class MyCppLibConfig implements InfoMapper {
        public void map(InfoMap infoMap) {}
}
