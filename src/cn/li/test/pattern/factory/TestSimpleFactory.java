package cn.li.test.pattern.factory;
/**
 * �򵥹��������
 * @author Administrator
 */
public class TestSimpleFactory {
	
	//���Ҫ���������㷨����ƽ��ֵ��ֻ��Ҫ���һ��OptionAvg�����޸�OperationSimpleFactory
	//����Ӱ���������㷨
	public static void main(String[] args) {
		Operation op = OperationSimpleFactory.createOperation("+");
		op.numberA = 1.2;
		op.numberB = 1.6;
		double result = op.getResult();
		System.out.println(result);
	}
}
