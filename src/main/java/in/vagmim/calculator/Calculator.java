package in.vagmim.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator 
{
	List<String> operands = new ArrayList<String>();
	List<String> functions = Arrays.asList("+","-","*","/");
 	public void push(Object a) {
		operands.add(a.toString());
	}
	public int getResult() {
		int result=0;
		String currentOp = null;
		for(String op : operands) {
			if(functions.contains(op)) {
				currentOp = op;
			} else {
				if(currentOp!=null) {
					if(currentOp.equals("+")) {
						result = result + Integer.parseInt(op);
					}
					if(currentOp.equals("-")) {
						result = result - Integer.parseInt(op);
					}
					if(currentOp.equals("*")) {
						result = result * Integer.parseInt(op);
					}
					if(currentOp.equals("/")) {
						result = (result / Integer.parseInt(op));
					}
				}
				else {
					result = Integer.parseInt(op);
				}
			}
		}
		return result;
	}

}
