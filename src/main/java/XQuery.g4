grammar XQuery;
import XPath;

xq : VAR                #xq_var
    | STRING_CONST      #xq_string
    | abs_path          #xq_abs_path
    | '(' xq ')'        #xq_expr
    | xq ',' xq         #xq_concatenate
    | xq '/' re_path    #xq_slash
    | xq '//' re_path   #xq_db_slash
    | '<' TAGNAME '>' '{' xq '}' '<' '/' TAGNAME '>'        #xq_tag
    | for_clause let_clause? where_clause? return_clause    #xq_flwr
    | let_clause xq     #xq_let
    | join_clause       #xq_join
    ;

for_clause : 'for' VAR 'in' xq (',' VAR 'in' xq)*       #for
    ;

let_clause : 'let' VAR ':=' xq (',' VAR ':=' xq)*       #let
    ;

where_clause : 'where' cond     #where
    ;

return_clause : 'return' xq     #return
    ;

cond : xq '=' xq            #cond_eq
    | xq 'eq' xq            #cond_eq
    | xq '==' xq            #cond_is
    | xq'is' xq             #cond_is
    | 'empty' '(' xq ')'    #cond_empty
    | 'some' VAR 'in' xq (',' VAR 'in' xq)* 'satisfies' cond    #cond_some
    | '(' cond ')'           #cond_expr
    | cond 'and' cond       #cond_and
    | cond 'or' cond        #cond_or
    | 'not' cond            #cond_not
    ;

join_clause : 'join' '(' xq ',' xq ',' attr ',' attr ')'
    ;

attr : '[' (TAGNAME)? (',' TAGNAME)* ']'
    ;

VAR : '$' NAME;
STRING_CONST : '"' [a-zA-Z0-9_,.;:?!'" \t\r\n-]* '"';
