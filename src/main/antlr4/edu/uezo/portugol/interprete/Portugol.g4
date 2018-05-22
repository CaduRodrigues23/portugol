grammar Portugol;

@parser::header {
	import java.util.Map;
	import java.util.HashMap;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

algoritmo: INICIO 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	(sentenca {body.add($sentenca.node);})* 
	{
		/*for (ASTNode n : body) {
			n.execute();
		}*/
	}
	FIM;

sentenca returns [ASTNode node]: decl_var_r | atr_var | imprima {node = $imprima.node;} | leia | condicional {node = condicional.node;} ;

decl_var_r returns [ASTNode node]: REAL ID PONTO_VIRGULA;
decl_var_i returns [ASTNode node]: INTEIRO ID PONTO_VIRGULA;
decl_var_c returns [ASTNode node]: CARACTER ID PONTO_VIRGULA;
decl_var_b returns [ASTNode node]: BOOLEANO ID PONTO_VIRGULA;

atr_var returns [ASTNode node]: ID ATRIB termo PONTO_VIRGULA;

imprima returns [ASTNode node]: IMPRIMA expressao PONTO_VIRGULA
	{$node = new Print($expressao.node);}
;
	
leia returns [ASTNode node]: LEIA ID PONTO_VIRGULA
	{node = new Read($ID.text);}
;

condicional returns [ASTNode node]: SE PAREN_ABRE expressao PAREN_FECHA 
			{
				List<ASTNode> body = new ArrayList<ASTNode>();
			}
			ENTAO ( s1 = sentenca {body.add($s1.node);})* 
			SENAO
			{
				List<ASTNode> counterBody = new ArrayList<ASTNode>();
			}
			 (s2 = sentenca {counterBody.add($s2.node);})* 
			{
				$node = new If($expressao.node, body, counterBody);
			}
			FIMSE;

expressao returns [ASTNode node]:
	 f1 = fator {$node = $f1.node;} 
	(SOMA f2=fator {$node = new Addition($node, $f2.node);} |
	SUB f2=fator {$node = new Subtraction($node, $f2.node);})*;

fator returns [ASTNode node]:
	 t1 = termo {$node = $t1.node;}
	(MULT  t2=termo {$node = new Multiplication($node, $t2.node);} |
	DIV t2=termo {$node = new Division($node, $t2.node);})* ;

termo returns [ASTNode node]: 
NUM {$node = new Constant(Integer.parseInt($NUM.text));} |
 NUM_FLUT {$node = new Constant(Double.parseDouble($NUM_FLUT.text));} | 
 TXT {$node = new Constant($TXT.text);} | 
 BOOL {$node = new Constant($BOOL.text);}
 | PAREN_ABRE expressao {$node = $expressao.node;} PAREN_FECHA;




INICIO: 'inicio';
REAL: 'real';
INTEIRO: 'inteiro';
CARACTER: 'caracter';
BOOLEANO: 'booleano';
IMPRIMA: 'imprima';
LEIA: 'leia';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
FIMSE: 'fimse';
FIM: 'fim.';

SOMA: '+';
SUB: '-';
MULT: '*';
DIV: '/';

E: 'E';
OU: 'OU';
NAO: 'NAO';

MAIOR: '>';
MENOR: '<';
MAIORIGUAL: '>=';
MENORIGUAL: '<=';
IGUAL: '==';
DIFERENTE: '!=';
ATRIB: ':=';

//CHAVES_ABRE: '{';
//CHAVES_FECHA: '}';
PAREN_ABRE: '(';
PAREN_FECHA: ')';
ASPAS: '"';
PONTO_VIRGULA: ';';

BOOL: 'verdadeiro' | 'falso';


ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM_FLUT: [0-9]+ '.' [0-9]*;
NUM: [0-9]+;
TXT: '"' [ a-zA-Z0-9_]* '"';
ESPACO:	[ \t\r\n]+ -> skip;

