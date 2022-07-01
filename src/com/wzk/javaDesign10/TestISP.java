package com.wzk.javaDesign10;

class Item{
    private int iid ;
    private String name ;
    private String note ;
    private SubItem subItems [] ;
    private Product products [] ;
    public Item(){

    }
    public Item(int iid,String name,String note){
        this.iid = iid ;
        this.name = name ;
        this.note = note ;
    }
    public void setIid(int iid){
        this.iid = iid ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setNote(String note){
        this.note = note ;
    }
    public int getIid(){
        return this.iid ;
    }
    public String getName(){
        return this.name ;
    }
    public String getNote(){
        return this.note ;
    }
    public String getInfo(){
        return "栏目编号：" + this.iid + "，栏目名称：" + this.name +"，描述：" + this.note ;
    }
    public void setSubItems(SubItem [] subItems){
        this.subItems = subItems ;
    }
    public SubItem [] getSubItems(){
        return this.subItems ;
    }
    public void setProducts(Product [] products){
        this.products = products ;
    }
    public Product [] getProducts(){
        return this.products ;
    }
}
class SubItem{
    private int sid ;
    private String name ;
    private String note ;
    private Item item ;
    private Product [] products ;
    public SubItem(){

    }
    public SubItem(int sid,String name,String note){
        this.sid = sid ;
        this.name = name ;
        this.note = note ;
    }
    public void setSid(int sid){
        this.sid = sid ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setNote(){
        this.note = note ;
    }
    public int getSid(){
        return this.sid ;
    }
    public String getName(){
        return this.name ;
    }
    public String getNote(){
        return this.note ;
    }
    public String getInfo(){
        return "子栏目编号：" + this.sid + "，子栏目名称：" + this.name + "，描述：" + this.note ;
    }
    public void setItem(Item item){
        this.item = item ;
    }
    public Item getItem(){
        return this.item ;
    }
    public void setProducts(Product [] products){
        this.products = products ;
    }
    public Product [] getProducts(){
        return this.products;
    }
}
class Product{
    private int pid ;
    private String name ;
    private double price ;
    private Item item ;
    private SubItem subItem ;
    public Product(){

    }
    public Product(int pid,String name,double price){
        this.pid = pid ;
        this.name = name ;
        this.price = price ;
    }
    public void setPid(int pid){
        this.pid = pid ;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price ;
    }
    public int getPid(){
        return this.pid ;
    }
    public String getName(){
        return this.name ;
    }
    public double getPrice(){
        return this.price ;
    }
    public String getInfo(){
        return "商品编号：" + this.pid + "，商品名称：" + this.name + "，价格：" + this.price ;
    }
    public void setItem(Item item){
        this.item = item ;
    }
    public Item getItem(){
        return this.item ;
    }
    public void setSubItem(SubItem subItem){
        this.subItem = subItem ;
    }
    public SubItem getSubItem(){
        return this.subItem ;
    }
}
public class TestISP {
    public static void main(String[] args) {
        Item item = new Item(1,"家具","巴拉巴拉巴拉");
        SubItem s1 = new SubItem(1001,"床上用品","-");
        SubItem s2 = new SubItem(1002,"客厅用品","-");
        SubItem s3 = new SubItem(1003,"卫生间用品","-");
        SubItem s4 = new SubItem(1004,"餐具","-");
        Product p1 = new Product(11001,"四件套",800);
        Product p2 = new Product(11002,"蚊帐",50);
        Product p3 = new Product(12001,"桌子",100);
        Product p4 = new Product(12002,"茶几",100);
        Product p5 = new Product(13001,"马桶",100);
        Product p6 = new Product(13002,"热水器",100);
        Product p7 = new Product(14001,"炒锅",100);
        item.setSubItems(new SubItem[]{s1,s2,s3,s4});
        item.setProducts(new Product[]{p1,p2,p3,p4,p5,p6,p7});
        s1.setItem(item);
        s2.setItem(item);
        s3.setItem(item);
        s4.setItem(item);
        s1.setProducts(new Product[]{p1,p2});
        s2.setProducts(new Product[]{p3,p4});
        s3.setProducts(new Product[]{p5,p6});
        s4.setProducts(new Product[]{p7});
        p1.setItem(item);
        p2.setItem(item);
        p3.setItem(item);
        p4.setItem(item);
        p5.setItem(item);
        p6.setItem(item);
        p7.setItem(item);
        p1.setSubItem(s1);
        p2.setSubItem(s1);
        p3.setSubItem(s2);
        p4.setSubItem(s2);
        p5.setSubItem(s3);
        p6.setSubItem(s3);
        p7.setSubItem(s4);
        System.out.println(item.getInfo());
        for (int x = 0 ;x < item.getSubItems().length ; x ++){
            System.out.println("\t|-" + item.getSubItems()[x].getInfo());
        }
        System.out.println("------------------------------------------------");
        System.out.println(item.getInfo());
        for(int x = 0 ;x < item.getProducts().length ; x ++) {
            System.out.println("\t|-" + item.getProducts()[x].getInfo());
            System.out.println("\t\t|-" + item.getProducts()[x].getSubItem().getInfo());
        }
        System.out.println("------------------------------------------------");
        System.out.println(s3.getInfo());
        for (int x = 0 ; x < s3.getProducts().length ; x ++){
            System.out.println("\t|-" + s3.getProducts()[x].getInfo());
        }
    }
}
