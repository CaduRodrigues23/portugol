package edu.uezo.portugol.interprete.ast;

public class Print implements ASTNode {
	private ASTNode data;
	
	public Print(ASTNode data) {
		super();
		this.data = data;
	}

	@Override
	public Object execute() {
		System.out.println(data.execute());
		return null;
	}

}
