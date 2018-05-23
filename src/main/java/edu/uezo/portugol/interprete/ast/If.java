package edu.uezo.portugol.interprete.ast;

import java.util.List;
import java.util.Map;

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
	public Object execute(Map<String, Object> symbolTable) {
		if ((boolean)condition.execute(symbolTable)) {
			for(ASTNode n : body) {
				n.execute(symbolTable);
			}			
		} else {
			for(ASTNode n : counterBody) {
				n.execute(symbolTable);
			}
		}
		return null;
	}
}
