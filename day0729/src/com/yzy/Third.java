package com.yzy;

import java.util.Scanner;

/**
 * 
 * ��ϰ3
 * 
 * @author ������
 * @version [V1.00, 2020��7��29��]
 * @see [�����/����]
 * @since V1.00
 */
public class Third
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������������");
        int basePay = scanner.nextInt();
        float priceAllowance = basePay * 0.4f;
        float rentAllowance = basePay * .25f;
        float practicalPay = basePay + priceAllowance + rentAllowance;
        
        System.out.println("��Ա���Ĺ���ϸĿΪ��");
        System.out.println("��������Ϊ��" + basePay);
        System.out.println("��۽���Ϊ��" + priceAllowance);
        System.out.println("�������Ϊ��" + rentAllowance);
        System.out.println("Ա��нˮ�ǣ�" + practicalPay);
        
        scanner.close();
        
    }
}
