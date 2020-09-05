package com.yzy;


import java.util.Scanner;

public class Bj4
{
 public static void main(String[]args) {
     
     //创建一个标准输入（键盘）的扫描器
     Scanner scanner =new Scanner(System .in);
     System.out.println("请输入年龄");
     //读取一个int数据类型
     int age=scanner.nextInt(); 
     System.out.println("请输入姓名");
     //读取一个String数据
     String name=scanner.next();
     System.out.println("age="+age );
     System.out.println("name="+name );
     //关闭扫描器
     scanner.close();
}
}