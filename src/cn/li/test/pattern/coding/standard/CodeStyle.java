package cn.li.test.pattern.coding.standard;

import java.util.Scanner;

//-----------------������-----------------------
class Calculator {
	public static void startCalculator1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������a:");
		Float a = sc.nextFloat();
		System.out.println("������������ţ�+��-��*��/��:");
		String b = sc.next();
		System.out.println("����������c:");
		float c = sc.nextFloat();
		
		float d = 0f;
		
		if(b.equals("+")){
			d = a + c;
		}
		if(b.equals("-")){
			d = a - c;
		}
		if(b.equals("*")){
			d = a * c;
		}
		if(b.equals("/")){
			d = a / c;
		}
		System.out.println("��������" + d);
		
		sc.close();
	}
	
	public static void startCalculator2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������a:");
		float numberA = sc.nextFloat();
		System.out.println("������������ţ�+��-��*��/��:");
		String strOperate = sc.next();
		System.out.println("����������b:");
		float numberB = sc.nextFloat();
		
		float val = 0f;
		
		switch (strOperate){
			case "+":
				val = numberA + numberB;
				break;
			case "-":
				val = numberA - numberB;
				break;
			case "*":
				val = numberA * numberB;
				break;
			case "/":
				if(numberB == 0){
					System.out.println("��������Ϊ0");
					break;
				}
				val = numberA / numberB;
		}
		System.out.println("��������" + val);
		
		sc.close();
	}
}
//====================������=========================
public class CodeStyle {
	public static void main(String[] args) {
		Calculator.startCalculator2();
	}
}
