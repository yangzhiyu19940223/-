package com.yzy;



/**
 * 类型转换
 *  
 * @author  杨治宇
 * @version  [V1.00, 2020年7月29日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Bj6
{
    public static void main(String[]arg)
    {
        
    
    //中文编码0x4e00-0x9fa5
    //0 48  A 65  a 94
    //自动转换
    char c ='一';
    int a=c;    
    System.out.println(a);//19968
    
    //强制转换
    int x=10;
    short y=(short)x;
    short z=10;
    z=(short)(y+10);//算术运算结果至少是int 
    System.out.println("z="+z);
    
    long t=2147483658l;
    int n=(int)t;
    System.out.println(n);//-2147483638
    }
}