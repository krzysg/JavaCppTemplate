# JavaCppTemplate


Simple template/example showing how to configure java project with [javacpp](https://github.com/bytedeco/javacpp).

Our 'library' is in [MyCppLib.h](https://github.com/krzysg/JavaCppTemplate/blob/master/src/main/cpp/pl/krzysg/MyCppLib.h).
In [CppLibManual.java](https://github.com/krzysg/JavaCppTemplate/blob/master/src/main/java/pl/krzysg/cppLib/CppLibManual.java) there is manual definition of simple interface and in [MyCppLibConfig.java](https://github.com/krzysg/JavaCppTemplate/blob/master/src/main/java/pl/krzysg/cppLib/presets/MyCppLibConfig.java) we are going to use automatic parser of javacpp. Automatically generated target will be put in pl.krzysg.cppLib.target package.
