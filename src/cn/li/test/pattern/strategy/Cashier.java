package cn.li.test.pattern.strategy;

import java.util.Scanner;
/**
 * 收费
 * @author Administrator
 */
public class Cashier {
	public static void main(String args[]){
		System.out.println("请输入商品单价：");
		Scanner sc = new Scanner(System.in);
		float price = sc.nextFloat();
		System.out.println("请输入商品数量：");
		int num = sc.nextInt();
		double total = price*num;
		System.out.println("应付款："+total);
		sc.close();
	}
}
