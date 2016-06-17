package cn.li.test.pattern.strategy;

public class CashNormal implements CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
