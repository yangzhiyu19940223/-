package com.yzy;


import java.util.Scanner;

public class Bj4
{
 public static void main(String[]args) {
     
     //����һ����׼���루���̣���ɨ����
     Scanner scanner =new Scanner(System .in);
     System.out.println("����������");
     //��ȡһ��int��������
     int age=scanner.nextInt(); 
     System.out.println("����������");
     //��ȡһ��String����
     String name=scanner.next();
     System.out.println("age="+age );
     System.out.println("name="+name );
     //�ر�ɨ����
     scanner.close();
}
}