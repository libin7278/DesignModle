package com.mvp.libin.designmodule.proxy_pattern.sample_demo_dynamic;

import com.mvp.libin.designmodule.proxy_pattern.sample_demo_static.ILawsuit;
import com.mvp.libin.designmodule.proxy_pattern.sample_demo_static.Laywer;
import com.mvp.libin.designmodule.proxy_pattern.sample_demo_static.LiBin;

import java.lang.reflect.Proxy;

/**
 * Created by libin on 16/11/14.
 */

public class Client2 {
    public static void main(String[] args){
        //构造一个对象
        ILawsuit libin = new LiBin();

        //构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(libin);

        //获取被代理类的classLoader
        ClassLoader classLoader = libin.getClass().getClassLoader();

        //动态构造一个代理者律师
        ILawsuit laywer = (ILawsuit) Proxy.newProxyInstance(classLoader,new Class[]{ILawsuit.class},dynamicProxy);

        //律师提交诉讼申请
        laywer.submit();

        //律师举证
        laywer.burden();

        //律师辩护
        laywer.defend();

        //完成诉讼
        laywer.finish();
    }
}
