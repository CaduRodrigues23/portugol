
package edu.uezo.portugol.interprete;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "ptg";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		PortugolLexer lexer = new PortugolLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PortugolParser parser = new PortugolParser(tokens);

		PortugolParser.AlgoritmoContext tree = parser.algoritmo();

		PortugolCustomVisitor visitor = new PortugolCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
