package com.yzy;

/**
 * 
 * 赋值
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年7月29日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class Bj7
{
    public static void main(String[] args){
        int num1=8;
        int num2=9;
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
    
}
