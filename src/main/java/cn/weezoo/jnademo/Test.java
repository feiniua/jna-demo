package cn.weezoo.jnademo;

import com.sun.jna.Library;
import com.sun.jna.Native;

import java.io.File;

/**
 * @author wenei
 * @date 2021-02-24 20:10
 */
public class Test {

    interface CLibrary extends Library {

        CLibrary INSTANCE = (CLibrary) Native.synchronizedLibrary(
                (CLibrary) Native.loadLibrary(CLibrary.class.getResource("/libhello.so").getPath(), CLibrary.class)
        );

        void hello();
    }

    public static void main(String[] args) {

        CLibrary library = CLibrary.INSTANCE;
        library.hello();

//        System.loadLibrary("libhello.so");
//        Native.loadLibrary(CLibrary.class.getResource("/libhello.so").getPath(), CLibrary.class);
    }
}
