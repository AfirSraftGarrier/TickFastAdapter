LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := HelloworldAndroidNDK
LOCAL_SRC_FILES := HelloworldAndroidNDK.cpp

include $(BUILD_SHARED_LIBRARY)
