package com.koala.java;

/**
 * day02：隐藏类的理解
 *    测试（查看字节码）：
 *      1、打开idea 中的settings --> plugins 搜索 jclasslib 插件 进行安装 重启生效
 *      2、重启后点击view  --> 选择show bytecode with jclasslib
 * Create by koala on 2021-08-16
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("hello");
        };
    }
}
