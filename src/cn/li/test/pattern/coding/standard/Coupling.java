package cn.li.test.pattern.coding.standard;

/**
 * ����Ͻ����
 * @author Administrator
 */
public class Coupling {
	
}
//ҵ���װ(����ϣ��޸Ļ�����µ����㣬�������㶼��������)
class Operation_{
	public static double getResult(double numberA,double numberB,String operate){
		//������
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
					System.out.println("��������Ϊ0");
					break;
				}
				result = numberA / numberB;
		}
		System.out.println("��������" + result);
		return result;
	}
}