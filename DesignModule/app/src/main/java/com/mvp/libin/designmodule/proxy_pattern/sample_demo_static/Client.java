package com.mvp.libin.designmodule.proxy_pattern.sample_demo_static;

/**
 * Created by libin on 16/11/14.
 */

public class Client {
    public static void main(String[] args){
        //构造一个对象
        ILawsuit libin = new LiBin();

        //构造一个律师
        ILawsuit lawsuit = new Laywer(libin);

        //律师提交诉讼申请
        lawsuit.submit();

        //律师举证
        lawsuit.burden();

        //律师辩护
        lawsuit.defend();

        //完成诉讼
        lawsuit.finish();
    }
}
