package com.wzk.javaDesign10;

class Province{
    private int pid ;
    private String name ;
    private City city[];
    public Province(){

    }
    public Province(int pid,String name){
        this.pid = pid ;
        this.name = name ;
    }
    public void setProvincePid(int pid){
        this.pid = pid ;
    }
    public void setProvinceName(String name){
        this.name = name ;
    }
    public int getPid(){
        return this.pid ;
    }
    public String getName(){
        return this.name ;
    }
    public String getInfo(){
        return "省份编号：" + this.pid + "，省份名称：" + this.name ;
    }
    public void setCities(City cities[]){
        this.city = cities ;
    }
    public City [] getCities(){
        return this.city ;
    }
}
class City{
    private int cid ;
    private String name ;
    private Province province ;
    public City(){

    }
    public City(int cid,String name){
        this.cid = cid ;
        this.name = name ;
    }
    public void setCityCid(int cid){
        this.cid = cid ;
    }
    public void setCityName(){
        this.name = name ;
    }
    public int getCid(){
        return this.cid;
    }
    public String getName(){
        return this.name;
    }
    public String getInfo(){
        return "城市编号：" + this.cid + "，城市名称：" + this.name ;
    }
    public void setProvince(Province province){
        this.province = province ;
    }
    public Province getProvince(){
        return this.province ;
    }
}
public class TestPC {
    public static void main(String args[]){
        Province pro = new Province(1,"河北省") ;
        City c1 = new City(1001,"唐山市") ;
        City c2 = new City(1002,"衡水市") ;
        City c3 = new City(1003,"保定市") ;
        pro.setCities(new City[]{c1,c2,c3});
        c1.setProvince(pro);
        c2.setProvince(pro);
        c3.setProvince(pro);
        System.out.println(c2.getProvince().getInfo());
        for (int i = 0 ;i < pro.getCities().length ;i ++) {
            System.out.println("\t|- " + pro.getCities()[i].getInfo());
        }
    }
}
