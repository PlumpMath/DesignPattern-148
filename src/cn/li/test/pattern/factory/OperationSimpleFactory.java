package cn.li.test.pattern.factory;


public class OperationSimpleFactory {
	
	public static Operation createOperation(String operate){
		Operation oper = null;
		switch (operate){
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
		}
		return oper;
	}
}
