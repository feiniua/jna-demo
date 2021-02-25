package cn.weezoo.jnademo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

import java.io.File;

/**
 * @author wenei
 * @date 2021-02-24 20:10
 */
public class Test {

    interface CLibrary extends Library {

        CLibrary INSTANCE = (CLibrary) Native.synchronizedLibrary(
                (CLibrary) Native.loadLibrary(CLibrary.class.getResource("libhello.dll").getPath(), CLibrary.class)
        );

        void hello();
    }

    public static void main(String[] args) {

        if (Platform.isWindows()) {
            System.out.println("windows platform");
            System.load(Thread.currentThread().getContextClassLoader().getResource("libhello.dll").getPath());
            NativeCpp nativeCpp = new NativeCpp();
            nativeCpp.hello();
        } else if (Platform.isLinux()) {
            System.out.println("linux platform");
            System.load(Thread.currentThread().getContextClassLoader().getResource("libhello.so").getPath());
            NativeCpp nativeCpp = new NativeCpp();
            nativeCpp.hello();
        }

//        System.loadLibrary("libhello.so");
//        Native.loadLibrary(CLibrary.class.getResource("/libhello.so").getPath(), CLibrary.class);
    }
}
