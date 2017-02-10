grammar XQuery;
import XPath;

xq : VAR
    | STRING_CONST
    | abs_path
    | '(' xq ')'
    | xq ',' xq
    | xq '/' re_path
    | xq '//' re_path
    | '<' TAGNAME '>' '{' xq '}' '<' '/' TAGNAME '>'
    | for_clause let_clause? where_clause? return_clause
    | let_clause xq
    ;

for_clause : 'for' VAR 'in' xq (',' VAR 'in' xq)* ;

let_clause : 'let' VAR ':=' xq (',' VAR ':=' xq)* ;

where_clause : 'where' cond;

return_clause : 'return' xq;

cond : xq '=' xq
    | xq 'eq' xq
    | xq '==' xq
    | xq'is' xq
    | 'empty' '(' xq ')'
    | 'some' VAR 'in' xq (',' VAR 'in' xq)* 'satisfies' cond
    | '(' cond ')'
    | cond 'and' cond
    | cond 'or' cond
    | 'not' cond
    ;

VAR : '$' NAME;
STRING_CONST : '"' [a-zA-Z0-9_,.;:?!'" \t\r\n-]* '"';
