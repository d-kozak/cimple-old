grammar Cimple;

program
    : statement+ EOF
    ;

statement
    : variableAssignment SEMICOLON
    | variableDefinition SEMICOLON
    | inputStatement SEMICOLON
    | printStatement SEMICOLON
    | ifStatement
    | forLoop
    | functionCall SEMICOLON
    | functionDefinition
    | returnStatement SEMICOLON
    ;


expression
    : functionCall #functionCallExpression
    | MINUS? LPAREN expression RPAREN #bracketExpr
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
    | MINUS? DOUBLE #doubleConstant
    | STRING #stringConstant
    ;

functionCall
    : ID LPAREN arguments? RPAREN
    ;

arguments
    : expression (COMMA expression)*
    ;

forLoop
    : FOR LPAREN setup=variableDefinition SEMICOLON expression SEMICOLON increment=variableAssignment RPAREN block
    ;

variableAssignment
    : ID ASSIGN expression
    ;

variableDefinition
    : type=ID name=ID ASSIGN expression
    ;

printStatement
    : PRINT expression
    ;

inputStatement
    : INPUT type=ID name=ID
    ;

ifStatement
    : IF LPAREN expression RPAREN block #if
    |  IF LPAREN expression RPAREN block ELSE block #ifElse
    ;

functionDefinition
    : FN name=ID LPAREN parameters? RPAREN (COLON type=ID)? block
    ;

parameters
    : parameter (COMMA parameter)*
    ;

parameter
    : type=ID name=ID
    ;

returnStatement
    : RETURN expression
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

FN : 'fn';

COLON: ':';

FOR : 'for';
IF : 'if';
ELSE : 'else';

RETURN : 'return';

COMMA : ',';

LPAREN : '(';
RPAREN : ')';
LBRAC : '{';
RBRAC : '}';

STRING : '"'.*?'"';
DOUBLE : [0-9]+'.'[0-9]+ ;
INT : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\n] -> skip;