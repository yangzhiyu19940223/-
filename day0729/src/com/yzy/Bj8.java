package com.yzy;
/**
 * 
 * 算数运算符
 *  
 * @author  杨治宇
 * @version  [V1.00, 2020年7月29日]
 * @see  [相关类/方法]
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
        c = a * 1.0f / b;//加一个浮点数 改变类型
        System.out.println("c=" + c);
//      b=0;
//      int d=a/b;
//      System.out.println("d="+d);//报错（异常）
        float x = 1.0f;
        float y = 0;
        float z = x / y;
        // 被除数为浮点数0  结果为没有这样的数NAN      被除数为浮点数非0     结果为无穷大Infinity
        System.out.println("z=" + z);// ?
        
    }
    
}