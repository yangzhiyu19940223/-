package com.yzy;

import java.util.Scanner;

/**
 * 练习1
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年7月29日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class First
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        int money = scanner.nextInt();
        
        System.out.println("请输入存款年限");
        int year = scanner.nextInt();
        
        System.out.println("请输入利率");
        float rate = scanner.nextFloat();
        
        System.out.println("本金利息综合=" + money * (1 + rate * year));
        scanner.close();
    }
}
