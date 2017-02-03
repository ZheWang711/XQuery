grammar XPath;

abs_path : 'doc("' FILENAME '")' SLASH  re_path  #abs_slash
         | 'doc("' FILENAME '")' DOUBLESLASH re_path #abs_db_slash
         ;

re_path : TAGNAME   #tag
        | '*'  #wildcard
        | '.'       #dot
        | '..' #double_dot
        | 'text()'      #text
        | '@' ATTNAME  #att_name
        | '(' re_path ')' #re_expr
        | re_path SLASH re_path #re_slash
        | re_path DOUBLESLASH re_path #re_db_slash
        | re_path '[' filter ']' #re_filter
        | re_path ',' re_path   #concatenate
        ;

filter  : re_path # filter_re
        | re_path '=' re_path #value_eq
        | re_path 'eq' re_path #value_eq
        | re_path 'is' re_path #id_eq
        | re_path '==' re_path #id_eq
        | '(' filter ')' #filter_eq
        | filter 'and' filter #filter_and
        | filter 'or' filter # filter_or
        | 'not' filter #filter_not
        ;

SLASH :  '/';
DOUBLESLASH : '//';
TAGNAME : NAME;
ATTNAME :  NAME;
FILENAME : NAME '.xml';

fragment
NAME : NAMSSTART NAMEMIDDLE*;

fragment
NAMSSTART : [a-zA-Z_];

fragment
NAMEMIDDLE : [a-zA-Z_0-9-];


