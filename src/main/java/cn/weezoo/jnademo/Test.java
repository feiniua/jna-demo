package cn.weezoo.jnademo;

import cn.weezoo.jnademo.lib.CLibrary;
import com.sun.jna.Library;
import com.sun.jna.Native;

import java.io.File;

/**
 * @author wenei
 * @date 2021-02-24 20:10
 */
public class Test {

    public static void main(String[] args) {
//        CLibrary library = CLibrary.INSTANCE;
//        library.hello();

        System.loadLibrary("libhello.so");
        Native.loadLibrary(CLibrary.class.getResource("/libhello.so").getPath(), CLibrary.class);
    }
}
