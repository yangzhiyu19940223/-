package com.yzy;

import java.util.Scanner;

/**
 * 
 * ��ϰ2
 * 
 * @author ������
 * @version [V1.00, 2020��7��29��]
 * @see [�����/����]
 * @since V1.00
 */
public class Second
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������Ա����");
        int cardNumber = scanner.nextInt();
        int numb1 = cardNumber % 10;
        int numb2 = cardNumber / 10 % 10;
        int numb3 = cardNumber / 100 % 10;
        int numb4 = cardNumber / 1000 % 10;
        System.out.println("���ź���λ����֮��=" + (numb1 + numb2 + numb3 + numb4));
        
        scanner.close();
        
    }
}
