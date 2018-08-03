grammar Cimple;

program
    : statement+ EOF
    ;

statement
    : variableAssignment
    | inputStatement
    | printStatement
    | ifStatement
    ;


expression
    : MINUS? LPAREN expression RPAREN #bracketExpr
    | expression MULT expression #binExpr
    | expression DIV expression #binExpr
    | expression MOD expression #binExpr
    | expression PLUS expression #binExpr
    | expression MINUS expression #binExpr
    | expression EQUALS expression #binExpr
    | expression NOT_EQUALS expression #binExpr
    | expression LT expression #binExpr
    | expression LE expression #binExpr
    | expression GT expression #binExpr
    | expression GE expression #binExpr
    | NOT expression #notExpr
    | expression AND expression #binExpr
    | expression OR expression #binExpr
    | MINUS? INT #intConstant
    | MINUS? ID #varExpr
    ;


variableAssignment
    : ID ASSIGN expression SEMICOLON
    ;

printStatement
    : PRINT expression SEMICOLON
    ;

inputStatement
    : INPUT ID SEMICOLON
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

AND : 'and';
OR : 'or';
NOT : 'not';

ASSIGN : '=';
SEMICOLON : ';';
PRINT : 'print';
INPUT : 'input';

IF : 'if';
ELSE : 'else';

LPAREN : '(';
RPAREN : ')';
LBRAC : '{';
RBRAC : '}';

INT : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\n] -> skip;