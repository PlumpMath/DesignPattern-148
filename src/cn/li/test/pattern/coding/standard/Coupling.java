package cn.li.test.pattern.coding.standard;

/**
 * 松耦合紧耦合
 * @author Administrator
 */
public class Coupling {
	
}
//业务封装(紧耦合，修改或添加新的运算，所有运算都会参与进来)
class Operation_{
	public static double getResult(double numberA,double numberB,String operate){
		//运算结果
		double result = 0d;
		
		switch (operate){
			case "+":
				result = numberA + numberB;
				break;
			case "-":
				result = numberA - numberB;
				break;
			case "*":
				result = numberA * numberB;
				break;
			case "/":
				if(numberB == 0){
					System.out.println("除数不能为0");
					break;
				}
				result = numberA / numberB;
		}
		System.out.println("计算结果：" + result);
		return result;
	}
}