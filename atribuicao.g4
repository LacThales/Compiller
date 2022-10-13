grammar atribuicao;

comece: comando;

comando: comando_atribuicao | comando_print;

read: 'fazer_leitura';


//===================== PRINT =======================//
comando_print: print l_par id | (aspas id aspas) r_par termine comando*;

aspas: '"';
print: 'joga_na_tela';
l_par: '(';
r_par: ')';
//===================== PRINT =======================//

comando_atribuicao: tipo id operador (id|num) termine;

tipo: 'numero_inteiro' | 'numero_quebrado' | 'texto' | 'caracter' | 'booleano';

operador: '=';

termine: ';';

id: ID;
ID: [a-z]+;

num: NUM;
NUM: [0-9]+;

Ws: [ \t\r\n]+ -> skip;
