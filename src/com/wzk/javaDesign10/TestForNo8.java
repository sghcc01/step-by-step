package com.wzk.javaDesign10;

class Member {
    private int mid;
    private String name;
    private Car car;
    private Member childen [];
   public Member(int mid,String name) {
       this.mid = mid;
       this.name = name;
   }
   public String getInfo(){
       return "人员编号：" + this.mid + "， 姓名：" + this.name;
   }
   public void setCar(Car car){
       this.car = car;
   }
   public Car getCar(){
       return this.car;
   }
   public void setChilden(Member [] childen ){
       this.childen = childen;
   }
   public Member []  getChilden(){
       return this.childen;
   }
}
class Car {
    private String pname;
    private Member member;
    public Car(String pname){
        this.pname = pname;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public Member getMember(){
        return this.member;
    }

    public String getInfo() {
        return this.pname;
    }
}
public class TestForNo8 {
    public static void main(String args[]){
        Member m = new Member(1,"王治琨");
        Member child = new Member(2,"王铭晗");
        Car c = new Car("红旗110");
        Car c2 = new Car("凯迪拉克320");
        m.setCar(c);
        child.setCar(c2);
        c2.setMember(child);
        c.setMember(m);
        m.setChilden(new Member[]{child});
//        System.out.println(m.getCar().getInfo());
//        System.out.println(c.getMember().getInfo());
//        System.out.println(child.getCar().getInfo());
//        System.out.println(m.getChild().getCar().getInfo());
        for (int i = 0 ;i < m.getChilden().length ;i ++){
            System.out.println(m.getChilden()[i].getInfo());
            System.out.println("\t|-" + m.getChilden()[i].getCar().getInfo());
        }
    }
}
