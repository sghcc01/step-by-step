package com.wzk;

public class Main {

    public static void main(String[] args) {
//        TestPrintNumber.print();
        TestPrintNumber num = new TestPrintNumber();
        num.printTeShuShuZi();
    }

//    public static void kindOf(Animals a) {
//        a.kind();
//    }

    public static void printShuZi(){
        for (int i = 1;i <= 5; i++){
            for(int j = 1;j + i <= 5;j++){
                printKongGe();
            }
            for (int k = 1;k <= i;k++){
                printKongGe();
            }
            printHuanHang();
        }
    }

    public static void printKongGe(){
        System.out.print(" ");
    }
    public static void printXingHao(){
        System.out.print("*");
    }
    public static void printHuanHang(){
        System.out.print("\n");
    }

    public static int ShuZi(int i,int j) {
        if (i<=2 || j==1 || j==i){
            return 1;
        }else {
            return 0;

        }
    }

//    public static void getUsers() {
//        getUsers(0);
//    }
//
//    public static void getUsers(int companyId) {
//        if (companyId == 0) {
//            System.out.println("all users");
//        } else {
//            System.out.println("users in company " + companyId);
//        }
//    }

}
