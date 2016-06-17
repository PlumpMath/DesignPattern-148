package cn.li.test.pattern.strategy;

public class CashReturn implements CashSuper {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(double moneyCondition,double moneyReturn){
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		double resultMoney = 0.0d;
		if(money>=moneyCondition){
			resultMoney = money-moneyReturn;
		}
		return resultMoney;
	}

}
