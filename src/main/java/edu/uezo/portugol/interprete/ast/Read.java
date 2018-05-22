package edu.uezo.portugol.interprete.ast;

import java.util.Scanner;

public class Read implements ASTNode {
	private ASTNode id;
	
	public Read(ASTNode id) {
		super();
		this.id = id;
	}

	@Override
	public Object execute() {
		//System.out.println(data.execute());
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		//save value related to id 
		return null;
	}

}
