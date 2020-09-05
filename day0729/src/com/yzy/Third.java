package com.yzy;

import java.util.Scanner;

/**
 * 
 * 练习3
 * 
 * @author 杨治宇
 * @version [V1.00, 2020年7月29日]
 * @see [相关类/方法]
 * @since V1.00
 */
public class Third
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入基本工资");
        int basePay = scanner.nextInt();
        float priceAllowance = basePay * 0.4f;
        float rentAllowance = basePay * .25f;
        float practicalPay = basePay + priceAllowance + rentAllowance;
        
        System.out.println("该员工的工资细目为：");
        System.out.println("基本工资为：" + basePay);
        System.out.println("物价津贴为：" + priceAllowance);
        System.out.println("房租津贴为：" + rentAllowance);
        System.out.println("员工薪水是：" + practicalPay);
        
        scanner.close();
        
    }
}
