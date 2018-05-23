package edu.uezo.portugol.interprete.ast;

import java.util.Map;

public class Addition implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Addition(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return (double)operand1.execute(symbolTable) + (double)operand2.execute(symbolTable);
	}
}
