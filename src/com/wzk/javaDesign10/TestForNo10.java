package com.wzk.javaDesign10;
//工厂设计模式
interface Fruit {
    public void eat();
}
class Apple implements Fruit {
    public void eat() {
        System.out.println("eat apple");
    }
}
class Orange implements Fruit {
    public void eat() {
        System.out.println("eat orange");
    }
}
class Factory {
    public static Fruit getInstance(String className){
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("orange".equals(className)) {
            return new Orange() ;
        }else {
            return null ;
        }
    }
}

public class TestForNo10 {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("apple") ;
        f.eat();
    }
}
