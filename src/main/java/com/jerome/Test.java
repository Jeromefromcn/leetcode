package com.jerome;

public class Test {
    private static volatile Test singleton;

    private Test() {
    }

    public static Test getSingleton() {
        if (singleton == null) {
            synchronized (Test.class) {
                if (singleton == null) {
                     new Test();
                }
            }
        }
        return singleton;

    }
}
/*
分配内存
初始化对象
singleton = 对象
 */