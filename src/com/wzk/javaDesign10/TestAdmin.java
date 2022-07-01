package com.wzk.javaDesign10;
class Book{
    static int num = 3 ;
}
class Admin{
    private String aid ;
    private String pwd ;
    private Role role ;
    public Admin(){

    }
    public Admin(String aid,String pwd){
        this.aid = aid ;
        this.pwd = pwd ;
    }
    public void setAid(String aid){
        this.aid = aid ;
    }
    public String getAid(){
        return this.aid ;
    }
    public void setPwd(String pwd){
        this.pwd = pwd ;
    }
    public String getPwd(){
        return this.pwd ;
    }
    public String getInfo(){
        return "用户名：" + this.aid + "，密码：" + this.pwd ;
    }
    public void setRole(Role role){
        this.role = role ;
    }
    public Role getRole(){
        return this.role ;
    }
    public boolean compare(Admin admin){
        if(admin == null){
            return false ;
        }
        if (this == admin){
            return true ;
        }
        if (this.aid.equals(admin.aid) && this.pwd.equals(admin.pwd)){
            return true ;
        }else {
            return false ;
        }
    }
}
class Role{
    private int rid ;
    private String name ;
    private Admin admins [] ;
    private Group groups [] ;
    public Role(){

    }
    public Role(int rid,String name){
        this.rid = rid ;
        this.name = name ;
    }
    public void setRid(int rid){
        this.rid = rid ;
    }
    public int getRid(){
        return this.rid ;
    }
    public void setNmae(String name){
        this.name = name ;
    }
    public String getName(){
        return this.name ;
    }
    public String getInfo(){
        return "角色编号：" + this.rid + "，角色名称：" + this.name ;
    }
    public void setAdmin(Admin admins []){
        this.admins = admins ;
    }
    public Admin [] getAdmins(){
        return this.admins ;
    }
    public void setGroups(Group groups []){
        this.groups = groups ;
    }
    public Group [] getGroups(){
        return this.groups ;
    }

}
class Group{
    private int gid ;
    private String name ;
    private Role roles [] ;
    private Action actions [] ;
    public Group(){

    }
    public Group(int gid,String name){
        this.gid = gid ;
        this.name = name ;
    }
    public void setGid(int gid){
        this.gid = gid ;
    }
    public int getGid(){
        return this.gid ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return this.name ;
    }
    public String getInfo(){
        return "权限组编号：" + this.gid + "，权限组名称：" + this.name ;
    }
    public void setRoles(Role roles []){
        this.roles = roles ;
    }
    public Role [] getRoles(){
        return this.roles ;
    }
    public void setActions(Action actions []){
        this.actions = actions ;
    }
    public Action [] getActions(){
        return this.actions ;
    }
}
class Action{
    private int atid ;
    private String name ;
    private String url ;
    private Group group ;
    public Action(){

    }
    public Action(int atid,String name,String url){
        this.atid = atid ;
        this.name = name ;
        this.url = url ;
    }
    public void setAtid(int atid){
        this.atid = atid ;
    }
    public int getAtid(){
        return this.atid ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return this.name ;
    }
    public void setUrl(String url){
        this.url = url ;
    }
    public String getUrl(){
        return this.url ;
    }
    public String getInfo(){
        return "权限编号："+ this.atid + "，权限名称：" + this.name + "，路径：" + this.url ;
    }
    public void setGroup(Group group){
        this.group = group ;
    }
    public Group getGroup(){
        return this.group ;
    }
}
public class TestAdmin {
    public static void main(String args[]){
        Admin a1 = new Admin("admin","admin") ;
        Admin a2 = new Admin("test","test") ;
        Admin a3 = new Admin("teleyi", "123456") ;
        Admin a4 = new Admin("admin","admin") ;
        Role r1 = new Role(1,"系统管理员") ;
        Role r2 = new Role(2,"信息管理员") ;
        Group g1 = new Group( 10,"信息管理") ;
        Group g2 = new Group( 11,"用户管理") ;
        Group g3 = new Group( 12,"数据管理") ;
        Group g4 = new Group( 13,"接口管理") ;
        Group g5 = new Group( 14,"备份管理") ;
        Action at01 = new Action(1001,"新闻发布","-") ;
        Action at02 = new Action(1001,"新闻列表","-") ;
        Action at03 = new Action(1001,"新闻审核","-") ;
        Action at04 = new Action(1001,"增加用户","-") ;
        Action at05 = new Action(1001,"用户列表","-") ;
        Action at06 = new Action(1001,"登录日志","-") ;
        Action at07 = new Action(1001,"雇员数据","-") ;
        Action at08 = new Action(1001,"部门数据","-") ;
        Action at09 = new Action(1001,"公司数据","-") ;
        Action at10 = new Action(1001,"服务传输","-") ;
        Action at11 = new Action(1001,"短信平台","-") ;
        Action at12 = new Action(1001,"全部备份","-") ;
        Action at13 = new Action(1001,"局部备份","-") ;
        a1.setRole(r1) ;
        a2.setRole(r2) ;
        a3.setRole(r2) ;
        r1.setAdmin(new Admin[]{a1});
        r2.setAdmin(new Admin[]{a2,a3});
        r1.setGroups(new Group[]{g1,g2,g3,g4,g5});
        r2.setGroups(new Group[]{g1,g2});
        g1.setRoles(new Role[]{r1,r2});
        g2.setRoles(new Role[]{r1,r2});
        g3.setRoles(new Role[]{r1});
        g4.setRoles(new Role[]{r1});
        g5.setRoles(new Role[]{r1});
        g1.setActions(new Action[]{at01,at02,at03});
        g2.setActions(new Action[]{at04,at05,at06});
        g3.setActions(new Action[]{at07,at08,at09});
        g4.setActions(new Action[]{at10,at11});
        g5.setActions(new Action[]{at12,at13});
        at01.setGroup(g1);
        at02.setGroup(g1);
        at03.setGroup(g1);
        at04.setGroup(g2);
        at05.setGroup(g2);
        at06.setGroup(g2);
        at07.setGroup(g3);
        at08.setGroup(g3);
        at09.setGroup(g3);
        at10.setGroup(g4);
        at11.setGroup(g4);
        at12.setGroup(g5);
        at13.setGroup(g5);
        System.out.println("---------------------------------------");
        System.out.println(a1.getInfo());
        System.out.println("\t|- " + a1.getRole().getInfo());
        for (int x = 0 ; x < a1.getRole().getGroups().length ; x ++){
            System.out.println("\t\t|- " + a1.getRole().getGroups()[x].getInfo());
            for (int y = 0 ; y < a1.getRole().getGroups()[x].getActions().length; y ++){
                System.out.println("\t\t\t|- " + a1.getRole().getGroups()[x].getActions()[y].getInfo()) ;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println(g2.getInfo());
        for (int x = 0 ; x < g2.getRoles().length ; x ++){
            System.out.println("\t|- " + g2.getRoles()[x].getInfo());
            for (int y = 0 ; y < g2.getRoles()[x].getAdmins().length ; y ++){
                System.out.println("\t\t|- " + g2.getRoles()[x].getAdmins()[y].getInfo());
            }
        }
        System.out.println("---------------------------------------");
        System.out.println(a1.compare(a2)) ;
        System.out.println(a4.compare(a1)) ;
        Book.num = 5 ;
        System.out.println(Book.num ) ;
    }
}
