package cn.weezoo.jnademo.lib;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @author wenei
 * @date 2021-02-24 20:13
 */
public interface CLibrary extends Library {

    CLibrary INSTANCE = (CLibrary) Native.synchronizedLibrary(
            (CLibrary) Native.loadLibrary(CLibrary.class.getResource("libhello.so").getPath(), CLibrary.class)
    );

    void hello();
}
