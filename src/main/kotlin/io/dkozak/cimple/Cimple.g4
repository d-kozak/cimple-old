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
    : LPAREN expr=expression RPAREN #bracketExpr
    | expression MULT expression #binExpr
    | expression DIV expression #binExpr
    | expression MOD expression #binExpr
    | expression PLUS expression #binExpr
    | expression MINUS expression #binExpr
    | expression EQUALS expression #logExpr
    | expression NOT_EQUALS expression #logExpr
    | expression LT expression #logExpr
    | expression LE expression #logExpr
    | expression GT expression #logExpr
    | expression GE expression #logExpr
    | INT #intConstant
    | ID #varExpr
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