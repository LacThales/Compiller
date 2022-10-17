grammar atribuicao;

comece: comando;

comando: comando_atribuicao | comando_print | comando_op_logico | comando_matematico | comando_input | comando_op_do;

read: 'fazer_leitura';

//===================== PRINT =======================//
comando_print: print l_par (id | texto) r_par termine comando*;

aspas: '"';
print: 'joga_na_tela';
l_par: '(';
r_par: ')';
l_keys: '{';
r_keys: '}';
texto: '"' id+ '"';

//===================== OP MATEMATICA =======================//
comando_matematico: (num | num_decimal) operador_matematico (num | num_decimal) termine comando*;
operador_matematico: '+' | '*' | '/' | '-';

//===================== ATRIBUICAO =======================//
comando_atribuicao: tipo id operador (id|num|num_decimal) termine;

//===================== INPUT =======================//
comando_input: input l_par (id | texto) r_par termine comando*;

input: 'escreva';

//===================== DECISÃO =======================//
comando_op_logico: (repeticao | condicional) l_par (id|num|num_decimal|aspas id aspas) operador (id|num|num_decimal|aspas id aspas) r_par l_keys (comando) r_keys comando*;
comando_op_do: repeticao l_keys comando r_keys 'enquanto' l_par (id|num|num_decimal|aspas id aspas) operador (id|num|num_decimal|aspas id aspas) r_par comando* ;

condicional: 'caso_sim' | 'caso_nao' | 'caso_nao_e';
repeticao: 'enquanto' | 'faça';
//===================== DECISÃO =======================//

tipo: 'numero_inteiro' | 'numero_quebrado' | 'texto' | 'caracter' | 'booleano';

operador: '=' | '<' | '>' | '!=';

termine: ';';

id: ID;
ID: [a-z]+ | [A-Z]+;

num: NUM;
NUM: [0-9]+;

num_decimal: NUM_DECIMAL;
NUM_DECIMAL: [0-9]+.[0-9]+;

Ws: [ \t\r\n]+ -> skip;
