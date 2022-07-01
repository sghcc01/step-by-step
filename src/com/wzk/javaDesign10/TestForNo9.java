package com.wzk.javaDesign10;

class Dept {
    private int deptno ;
    private String dname ;
    private String loc ;
    private Emp [] emps ;
    public Dept(int deptno,String dname, String loc){
        this.deptno = deptno ;
        this.dname = dname ;
        this.loc = loc ;
    }
    public String getInfo (){
        return "部门编号：" + this.deptno + "，名称：" + this.dname + "，位置：" + this.loc;
    }
    public void setEmps(Emp [] emps){
        this.emps = emps ;
    }
    public Emp [] getEmps(){
        return this.emps ;
    }
}
class Emp {
    private int empno ;
    private String ename ;
    private String job ;
    private double sal;
    private double comm ;
    private Emp lead;
    private Dept dept ;
    public Emp(int empno,String ename,String job,double sal,double comm){
        this.empno = empno ;
        this.ename = ename ;
        this.job = job ;
        this.sal = sal ;
        this.comm = comm ;
    }
    public void setLead(Emp lead){
        this.lead = lead ;
    }
    public Emp getLead(){
        return this.lead ;
    }
    public void setDept(Dept dept){
        this.dept = dept ;
    }
    public Dept getDept(){
        return this.dept ;
    }
    public String getInfo(){
        return "雇员编号：" + this.empno + "，雇员姓名：" + this.ename + "，职位：" + this.job + "，工资：" + this.sal + "，佣金：" + this.comm;
    }
}
public class TestForNo9 {
    public static void main(String args[]){
        //第一步：设置数据
        Dept dept = new Dept(10,"ACCOUNTING","New York");
        Emp ea = new Emp(7369,"SMITH,","CLERK",800.0,0.0);
        Emp eb = new Emp(7902,"FORD,","MANAGER",2450.0,0.0);
        Emp ec = new Emp(7839,"KING,","PRESIDENT",5000.0,0.0);
        ea.setLead(eb);
        eb.setLead(ec);
        ea.setDept(dept);
        eb.setDept(dept);
        ec.setDept(dept);
        dept.setEmps(new Emp[]{ea,eb,ec});
        //第二部：取出数据
        System.out.println(ea.getInfo());
        System.out.println("\t|- " + ea.getLead().getInfo());
        System.out.println("\t|- " + ea.getDept().getInfo());
        System.out.println("----------------------------------------");
        System.out.println(dept.getInfo());
        for (int i = 0 ;i < dept.getEmps().length ;i ++){
            System.out.println("\t|- " + dept.getEmps()[i].getInfo());
            if (dept.getEmps()[i].getLead() != null){
                System.out.println("\t\t|- " + dept.getEmps()[i].getLead().getInfo());
            }
        }
    }
}
