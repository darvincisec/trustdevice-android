package cn.tongdun.mobrisk.core.utils;

/**
 * @description:
 * @author: wuzuchang
 * @date: 2023/4/7
 */
public class JNIHelper {
    public native static Object callNative(int type, Object args);
}