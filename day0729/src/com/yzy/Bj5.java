package com.yzy;

import java.util.Scanner;


public class Bj5
{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        float score;
        String name;
        String gender;
        System.out.println("��������߷ֳɼ�");
        score=scanner.nextFloat();
        
        System.out.println("��������߷�����");
        name=scanner.next();
        
        System.out.println("��������߷��Ա�");
        gender=scanner.next();
        
        System.out.println("score="+score);
        System.out.println("name="+name);
        System.out.println("gender="+gender);
        scanner.close();
    }
    }

