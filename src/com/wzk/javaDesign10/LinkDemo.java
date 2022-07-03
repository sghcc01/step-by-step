package com.wzk.javaDesign10;

import com.wzk.Link;

public class LinkDemo {
    public static void main(String [] args){
        Link link = new Link() ;
        link.add("火车头") ;
        link.add("a") ;
        link.add("b") ;
        link.add("c") ;
        System.out.println(link.size()) ;
        System.out.println(link.contains("d")) ;
        System.out.println(link.get(0)) ;
        link.set(0,"balabala") ;
        link.remove("c");
        System.out.println(link.get(0)) ;
        Object [] tmp = link.toArray() ;
        for (Object i : tmp) {
            System.out.println(i);
        }
    }
}
