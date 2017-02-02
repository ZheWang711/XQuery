grammar Binaryexpression;
expression : (exp LN)* ;
exp :   exp ('*'|'/') exp
    |   exp('+'|'-') exp
    |   INT
    |   '(' exp ')'
    ;
INT :   [0-9]+;
LN  :   [\r\n]+;