#include "stdafx.h"
#include "cn_weezoo_jnademo_NativeCpp.h"
#include "stdio.h"

JNIEXPORT void JNICALL Java_cn_weezoo_jnademo_NativeCpp_hello(JNIEnv * env, jobject jobject)
{
	printf("hello world\n");
}