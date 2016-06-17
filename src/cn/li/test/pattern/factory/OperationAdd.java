package cn.li.test.pattern.factory;


public class OperationAdd extends Operation{
	@Override
	public double getResult() {
		return numberA+numberB;
	}
}
