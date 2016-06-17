package cn.li.test.pattern.strategy;

public class CashContext {
	private CashSuper cs = null;
	
	public CashContext(String type){
		switch(type){
		case "正常收费":
			cs = new CashNormal();
			break;
		case "满300返100":
			cs = new CashReturn(300,100);
			break;
		case "打8折":
			cs = new CashRebate(0.8);
		}
	}
	public double getResult(double money){
		return cs.acceptCash(money);
	}
	
	//用户使用
	public static void main(String[] args) {
		CashContext context = new CashContext("满300返100");
		System.out.println(context.getResult(500));
	}
}
