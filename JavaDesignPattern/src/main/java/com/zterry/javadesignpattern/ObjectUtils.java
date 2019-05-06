package com.zterry.javadesignpattern;

/**
 * Description:   <br>
 * Author: liu.zhanta <br>
 * Date: 2018/12/17 上午10:43
 * Version: 4.10
 */
public class ObjectUtils {

    private ObjectUtils() {
        //no instance
    }

    /**
     * 判断一组对象是否为空（or条件）
     *
     * @param args
     * @return
     */
    public static boolean isOrNull(Object... args) {
        if (args == null) {
            return true;
        }
        try {
            for (Object arg : args) {
                if (arg == null) {
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * 判断一组对象是否为空（and 条件）
     *
     * @param args
     * @return
     */
    public static boolean isAndNull(Object... args) {
        if (args == null) {
            return true;
        }
        int matchIndex = 0;
        try {
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg == null) {
                    matchIndex++;
                }
            }
        } catch (Exception e) {
        }

        return matchIndex == args.length;
    }

    public static boolean notNull(Object... args) {
        if (args == null) {
            return false;
        }
        int matchIndex = 0;
        try {
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg != null) {
                    matchIndex++;
                }
            }
        } catch (Exception e) {
        }

        return matchIndex == args.length;
    }
}
