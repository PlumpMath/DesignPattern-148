package cn.li.test.pattern.strategy;

import java.util.Scanner;
/**
 * �շ�
 * @author Administrator
 */
public class Cashier {
	public static void main(String args[]){
		System.out.println("��������Ʒ���ۣ�");
		Scanner sc = new Scanner(System.in);
		float price = sc.nextFloat();
		System.out.println("��������Ʒ������");
		int num = sc.nextInt();
		double total = price*num;
		System.out.println("Ӧ���"+total);
		sc.close();
	}
}
