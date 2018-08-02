grammar Cimple;

program
    : statement+ EOF
    ;

statement
    : variableAssignment
    | printStatement
    | ifStatement
    ;


expression
    : LPAREN expression RPAREN
    | expression MULT expression
    | expression DIV expression
    | expression MOD expression
    | expression PLUS expression
    | expression MINUS expression
    | expression EQUALS expression
    | expression NOT_EQUALS expression
    | expression LT expression
    | expression LE expression
    | expression GT expression
    | expression GE expression
    | INT
    | ID
    ;


variableAssignment
    : ID ASSIGN expression SEMICOLON
    ;

printStatement
    : PRINT expression SEMICOLON
    ;

ifStatement
    : IF LPAREN expression RPAREN block #if
    |  IF LPAREN expression RPAREN block ELSE block #ifElse
    ;

block : LBRAC statement* RBRAC;


EQUALS : '==';
NOT_EQUALS : '!=';
LT : '<' ;
LE : '<=' ;
GT : '>';
GE : '>=';

MULT : '*';
DIV : '/' ;
PLUS : '+';
MINUS: '-';
MOD : '%' ;

ASSIGN : '=';
SEMICOLON : ';';
PRINT : 'print';

IF : 'if';
ELSE : 'else';

LPAREN : '(';
RPAREN : ')';
LBRAC : '{';
RBRAC : '}';

INT : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\n] -> skip;