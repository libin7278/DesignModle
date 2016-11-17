package com.mvp.libin.designmodule.proxy_pattern.sample_demo_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by libin on 16/11/14.
 */

public class DynamicProxy implements InvocationHandler {
    private Object object;//被代理的引用类

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法
        Object result = method.invoke(object, args);
        return result;
    }

}
