package com.yzy;

import java.util.Scanner;

/**
 * 
 * 练习2
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年7月29日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class Second
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入会员卡号");
        int cardNumber = scanner.nextInt();
        int numb1 = cardNumber % 10;
        int numb2 = cardNumber / 10 % 10;
        int numb3 = cardNumber / 100 % 10;
        int numb4 = cardNumber / 1000 % 10;
        System.out.println("卡号后四位数字之和=" + (numb1 + numb2 + numb3 + numb4));
        
        scanner.close();
        
    }
}
