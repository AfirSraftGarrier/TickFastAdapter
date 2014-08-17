#include <jni.h>

#ifndef _Included_com_blueeagle_example_testNDK
#define _Included_com_blueeagle_example_testNDK
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_blueeagle_example_testNDK
 * Method:    stringTestNdk
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_ com_blueeagle_example_testNDK_stringTestNdk
  (JNIEnv *, jobject);

/*
 * Class:     com_blueeagle_example_testNDK
 * Method:    stringTestNdk2
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_ com_blueeagle_example_testNDK_stringTestNdk2
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
