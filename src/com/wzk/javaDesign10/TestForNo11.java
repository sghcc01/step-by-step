package com.wzk.javaDesign10;
//代理设计模式
interface Subject {
    public void make() ;
}
class RealSubject implements Subject {
    public void make(){
        System.out.println("Real");
    }
}
class ProxySubject implements Subject {
    private Subject subject ;
    public ProxySubject(Subject subject) {
        this.subject = subject ;
    }
    public void prepare(){
        System.out.println("qian");
    }
    public void destory(){
        System.out.println("hou");
    }
    public void make(){
        this.prepare();
        this.subject.make();
        this.destory();
    }
}

public class TestForNo11 {
    public static void main(String[] args) {
        Subject sub = new ProxySubject(new RealSubject()) ;
        sub.make();
    }
}
