package com.wzk;

public class Link {
    private class Node {
        private Object data ;
        private Node next ;
        public Node(Object data) {
            this.data = data;
        }
        public void setData(Object data){
            this.data = data;
        }
        public Object getData() {
            return this.data ;
        }
        public void addNode(Node newNode){
            if (this.next == null){
                this.next = newNode ;
            }else {
                this.next.addNode(newNode);
            }
        }
        public boolean containsNode(Object data) {
            if (data.equals(this.data)) {
                return true ;
            }else {
                if (this.next == null) {
                    return false ;
                }
                return this.next.containsNode(data) ;
            }
        }
        public Object getNode(int index) {
            if (index == Link.this.foot ++) {
                return this.data ;
            }else {
                return this.next.getNode(index) ;
            }
        }
        public void setNode(int index,Object data){
            if (index == Link.this.foot ++) {
                this.data = data ;
            }else {
                this.next.setNode(index,data);
            }
        }
        public void removeNode(Node pervious,Object data) {
            if (data.equals(this.data)){
                pervious.next = this.next ;
            }else {
                if (this.next != null) {
                    this.next.removeNode(this,data);
                }
            }
        }
        public void toArrayNode() {
            Link.this.array[Link.this.foot ++] = this.data ;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

    }
    private Node root;
    private int count = 0 ;
    private int foot = 0 ;
    private Object [] array ;
    public void add(Object data) {
        if (data == null) {
            return ;
        }
        Node newNode = new Node(data);
        if (this.root == null){
            this.root = newNode ;
        }else {
            this.root.addNode(newNode) ;
        }
        this.count ++ ;
    }
    public int size() {
        return this.count ;
    }
    public boolean isEmpty(){
        return this.count == 0 ;
    }
    public boolean contains(Object data){
        if (data == null || this.root == null) {
            return false ;
        }
        return this.root.containsNode(data) ;
    }
    public Object get(int index) {
        if (index > this.count) {
            return null ;
        }
        this.foot = 0 ;
        return this.root.getNode(index);
    }
    public void set(int index,Object data) {
        if (index > this.count) {
            return;
        }
        this.foot = 0 ;
        this.root.setNode(index,data);
    }
    public void remove(Object data){
        if (this.contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next ;
            }
            this.root.next.removeNode(this.root,data);
            this.count -- ;
        }
    }
    public Object [] toArray() {
        this.array = new Object[this.count] ;
        this.foot = 0 ;
        if (this.isEmpty()){
            return null ;
        }
        this.root.toArrayNode() ;
        return this.array;
    }

}