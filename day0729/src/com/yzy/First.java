package com.yzy;

import java.util.Scanner;

/**
 * ��ϰ1
 * 
 * @author ������
 * @version [V1.00, 2020��7��29��]
 * @see [�����/����]
 * @since V1.00
 */
public class First
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����뱾��");
        int money = scanner.nextInt();
        
        System.out.println("������������");
        int year = scanner.nextInt();
        
        System.out.println("����������");
        float rate = scanner.nextFloat();
        
        System.out.println("������Ϣ�ۺ�=" + money * (1 + rate * year));
        scanner.close();
    }
}
