package edu.uezo.portugol.interprete.ast;

import java.util.Map;
import java.util.Scanner;

public class Read implements ASTNode {
	private String id;
	
	public Read(String id) {
		super();
		this.id = id;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		//System.out.println(data.execute());
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		
		symbolTable.put(id,(symbolTable.get(id).getClass().cast(data)));
		//save value related to id 
		return null;
	}

}
