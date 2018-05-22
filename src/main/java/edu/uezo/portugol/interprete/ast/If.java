package edu.uezo.portugol.interprete.ast;

import java.util.List;

public class If implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> counterBody; 
	
	public If(ASTNode condition, List<ASTNode> body, List<ASTNode> counterBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.counterBody = counterBody;
	}

	@Override
	public Object execute() {
		if ((boolean)condition.execute()) {
			for(ASTNode n : body) {
				n.execute();
			}			
		} else {
			for(ASTNode n : counterBody) {
				n.execute();
			}
		}
		return null;
	}
}
