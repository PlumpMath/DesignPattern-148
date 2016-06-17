package cn.li.test.pattern.factory;


public class OperationDiv extends Operation{
	@Override
	public double getResult() {
		return numberA/numberB;
	}
}
