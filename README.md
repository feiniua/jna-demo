需要用到的指令:

Linux环境下构建动态库
`gcc -fPIC -shared -o libhello.so hello.c`

Linux环境下运行java(同时把jna.jar放置target目录下)
`java -Djava.ext.dirs=. cn.weezoo.jnademo.Test run`
