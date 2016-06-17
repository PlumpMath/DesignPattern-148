package cn.li.test.pattern.factory;


public class OperationMul extends Operation{
	@Override
	public double getResult() {
		return numberA*numberB;
	}
}
