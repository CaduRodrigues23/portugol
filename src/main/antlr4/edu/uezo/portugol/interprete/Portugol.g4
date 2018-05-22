grammar Portugol;

@parser::header {
	import java.util.Map;
	import java.util.HashMap;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

algoritmo: INICIO sentenca* FIM;
sentenca: decl_var_r | atr_var_r | imprima | leia_r | condicional ;

decl_var_r: REAL ID PONTO_VIRGULA;

atr_var_r: ID ATRIB NUM_FLUT PONTO_VIRGULA;

imprima: IMPRIMA expressao PONTO_VIRGULA;
	
leia_r: LEIA ID PONTO_VIRGULA;

expressao returns[Object valor]:
	t1 = fator {$valor= (double)$t1.value;} 
	(SOMA t2=fator {$valor = (double)$t1.value + (double)$t2.value);}  );

fator returns [Object valor] :
	t1 = termo {$valor= (double)$t1.value; }
	(MULT t2=termo {$valor = (double)$t1.value + (double)$t2.value);}  ) ;

termo returns [Object valor]: 
TXT {$valor = $TXT.text;} | 
NUM {$valor = Integer.parseInt($NUM.text);} |
 NUM_FLUT {$valor = Double.parseDouble($NUM_FLUT.text);} | 
 ID {$valor = $ID.text;} 
 PAREN_ABRE expressao {$valor = $expressao.valor;} PAREN_FECHA;

condicional: SE PAREN_ABRE expressao PAREN_FECHA 
			ENTAO sentenca* 
			SENAO sentenca* FIMSE;
			


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

