package cn.li.test.pattern.strategy;

public class CashContext {
	private CashSuper cs = null;
	
	public CashContext(String type){
		switch(type){
		case "�����շ�":
			cs = new CashNormal();
			break;
		case "��300��100":
			cs = new CashReturn(300,100);
			break;
		case "��8��":
			cs = new CashRebate(0.8);
		}
	}
	public double getResult(double money){
		return cs.acceptCash(money);
	}
	
	//�û�ʹ��
	public static void main(String[] args) {
		CashContext context = new CashContext("��300��100");
		System.out.println(context.getResult(500));
	}
}
