package com.mvp.libin.designmodule.proxy_pattern.sample_demo_static;

/**
 * Created by libin on 16/11/14.
 */

public interface ILawsuit {
    //提交申请
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //完成诉讼
    void finish();
}
