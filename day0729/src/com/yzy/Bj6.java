package com.yzy;



/**
 * ����ת��
 *  
 * @author  ������
 * @version  [V1.00, 2020��7��29��]
 * @see  [�����/����]
 * @since V1.00
 */
public class Bj6
{
    public static void main(String[]arg)
    {
        
    
    //���ı���0x4e00-0x9fa5
    //0 48  A 65  a 94
    //�Զ�ת��
    char c ='һ';
    int a=c;    
    System.out.println(a);//19968
    
    //ǿ��ת��
    int x=10;
    short y=(short)x;
    short z=10;
    z=(short)(y+10);//����������������int 
    System.out.println("z="+z);
    
    long t=2147483658l;
    int n=(int)t;
    System.out.println(n);//-2147483638
    }
}