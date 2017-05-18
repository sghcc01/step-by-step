package com.wzk;

/**
 * Created by admin on 2017/5/6.
 */
public class TestPrintNumber {
    public static int feibonaqi(int i,int j){
        if (j==1 || j==i){
            return 1;
        }else {
            return feibonaqi(i-1,j-1)+feibonaqi(i-1,j);
        }
    }

    public static void printTeShuShuZi(){
        for (int i =1;i<=7;i++){
            for (int k =1;k+i <=7;k++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                    System.out.print(feibonaqi(i,j));
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print(){
        for (int i =1;i<=10;i++){
            for (int k =1;k+i <=10;k++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                if (i!=10){
                    System.out.print(" "+i+" ");
                    System.out.print("");
                }else {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
