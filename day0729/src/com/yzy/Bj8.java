package com.yzy;
/**
 * 
 * ���������
 *  
 * @author  ������
 * @version  [V1.00, 2020��7��29��]
 * @see  [�����/����]
 * @since V1.00
 */
public class Bj8
{
    
    public static void main(String[] args)
    {
        int a = 10;
        int b = 4;
        float c = a / b;
        System.out.println("c=" + c);// 2.5 X   2 OK
        c = a * 1.0f / b;//��һ�������� �ı�����
        System.out.println("c=" + c);
//      b=0;
//      int d=a/b;
//      System.out.println("d="+d);//�����쳣��
        float x = 1.0f;
        float y = 0;
        float z = x / y;
        // ������Ϊ������0  ���Ϊû����������NAN      ������Ϊ��������0     ���Ϊ�����Infinity
        System.out.println("z=" + z);// ?
        
    }
    
}