package cn.li.test.pattern.factory;
/**
 * 简单工厂类测试
 * @author Administrator
 */
public class TestSimpleFactory {
	
	//如果要增加其他算法，如平均值，只需要添加一个OptionAvg，和修改OperationSimpleFactory
	//而不影响其他的算法
	public static void main(String[] args) {
		Operation op = OperationSimpleFactory.createOperation("+");
		op.numberA = 1.2;
		op.numberB = 1.6;
		double result = op.getResult();
		System.out.println(result);
	}
}
