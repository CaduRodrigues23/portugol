package edu.uezo.portugol.interprete.ast;

public class Subtraction implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Subtraction(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}



	@Override
	public Object execute() {
		return (double)operand1.execute() - (double)operand2.execute();
	}
}
