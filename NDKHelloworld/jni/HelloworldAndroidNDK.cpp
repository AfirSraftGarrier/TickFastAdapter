#include <string.h>
#include <jni.h>

jstring
Java_com_blueeagle_example_testNDK_stringTestNdk( JNIEnv* env,
                                                  jobject thiz )
{
    return env ->NewStringUTF( "Hello Test NDK !");
//    		(*env)->NewStringUTF(env, "Hello Test NDK !");
}
