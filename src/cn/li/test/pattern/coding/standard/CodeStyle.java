package cn.li.test.pattern.coding.standard;

import java.util.Scanner;

//-----------------编码风格-----------------------
class Calculator {
	public static void startCalculator1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字a:");
		Float a = sc.nextFloat();
		System.out.println("请输入运算符号（+、-、*、/）:");
		String b = sc.next();
		System.out.println("请输入数字c:");
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
		System.out.println("计算结果：" + d);
		
		sc.close();
	}
	
	public static void startCalculator2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字a:");
		float numberA = sc.nextFloat();
		System.out.println("请输入运算符号（+、-、*、/）:");
		String strOperate = sc.next();
		System.out.println("请输入数字b:");
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
					System.out.println("除数不能为0");
					break;
				}
				val = numberA / numberB;
		}
		System.out.println("计算结果：" + val);
		
		sc.close();
	}
}
//====================编码风格=========================
public class CodeStyle {
	public static void main(String[] args) {
		Calculator.startCalculator2();
	}
}
