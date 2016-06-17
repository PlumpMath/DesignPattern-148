package cn.li.test.pattern.strategy;

public class CashFactory {
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
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
		return cs;
	}
	//����ģʽ
	public static void main(String[] args) {
		CashSuper cs = CashFactory.createCashAccept("��8��");
		cs.acceptCash(300);
	}
}
