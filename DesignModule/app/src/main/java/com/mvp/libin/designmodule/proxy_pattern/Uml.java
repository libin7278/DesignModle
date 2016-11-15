package com.mvp.libin.designmodule.proxy_pattern;

/**
 * Created by libin on 16/11/14.
 * 代理模式
 */

public class Uml {
    /**
     * 抽象主题类
     * 主要负责声明主题与代理的共同接口方法,该类既可以是一个抽象类也可以是一个抽象接口
     */
    public abstract class Subject{
        //一个普通的业务方法
        public abstract void visit();
    }

    /**
     * 委托类
     * 执行具体的业务逻辑方法,客户类通过代理类间接调用该类中定义的方法
     */
    public class RealSubject extends Subject{
        @Override
        public void visit() {
            //RealSubject中具体逻辑
            System.out.println("RealSubject");
        }
    }

    /**
     * 代理类
     * 该类持有一个委托类的引用,在其所实现的方法接口中调用真实主题类中相应的接口方法执行,起到代理作用
     */
    public class ProxySubject extends Subject{
        //持有真实主题的引用
        private RealSubject realSubject;

        @Override
        public void visit() {
           //通过真实主题应用的对象调用真实主题中的逻辑方法
            realSubject.visit();
        }
    }

    public class Client{
        public void main(String[] args){
            //创造一个委托类的对象
            RealSubject realSubject = new RealSubject();

            //创造一个代理对象
            ProxySubject proxySubject = new ProxySubject();

            //调用代理的相关方法
            proxySubject.visit();
        }
    }

}

//==========================================>
/**
 *github
 *https://github.com/libin7278/DesignModle/tree/master
 */
