lexer grammar  Lexer;


ARTICLE : ' '* 'article' ' '*;

ARTICLE_CONTENT: ' '* 'arContent' ' '* ;

ARTICLE_TITLE : ' '* 'arTitle' ' '*;

BODY :' '* 'body' ' '*;

BUTTON :' '*'button'' '*;

CHOICES : ' '* 'choices' ' '*;

CLOSE_BRACKET : ' '* ')' ' '*;

CLOSE_CURLY_BRACKET :' '* '}' ' '*;

CLOSE_SQUARE_BRACKET : ' '* ']' ' '*;

COMMA : ' '* ',' ' '*;

CONTACTINFO: ' '* 'contactInfo' ' '*;

CONTROLS : ' '* 'controls' ' '*;

CONTROLLER : ' '* 'controller' ' '*;

DESCRIPTION : ' '* 'description' ' '*;

EQUAL : ' '* '=' ' '* ;

ELSE : ' '* 'else' ' '*;

FIELD:' '* 'field' ' '*;

FIELD_TYPE
    :' '* 'NAME' ' '*
    |' '* 'PASSWORD' ' '*
    |' '* 'EMAIL' ' '*
    |' '* 'STRING' ' '*
    |' '* 'NUMBER' ' '*
    ;

FOOTER : ' '* 'footer' ' '*;

GOTO : ' '* 'goto' ' '*;

HEADER : ' '* 'header' ' '*;

IF :' '* 'if' ' '*;

IMAGE : ' '* 'image' ' '*;

IS : ' '*'is'' '*;

OPEN_BRACKET : ' '* '(' ' '*;

OPEN_CURLY_BRACKET :' '* '{' ' '*;

OPEN_SQUARE_BRACKET : ' '* '[' ' '*;

OPTIONSLIST : ' '* 'optionsList' ' '*;

PAGE : ' '* 'page' ' '* ;

PHONE_NUMBER : ' '*  '+'[0-9]+ ' '*;

PICKER : ' '* 'picker' ' '*;

PRINT : ' '* 'print' ' '* ;

SEMICOLON : ' '* ';' ' '*;

SINGLE_QOUT :' '* '\'' ' '*;

SITE_NAME : ' '* 'siteName' ' '*;

COMMENT_BEGIN : ' '* '!' ' '* ->pushMode(COMMENT);

WHILE : ' '* 'while' ' '* ;

NUMBER : ' '* [0-9]+ ' '* ;

NAME:' '* [A-Z][a-z]+ ' '*;

EMAIL:  ' '* [0-9a-zA-Z]+ '@' [a-zA-Z]+ '.com' ' '*;

VARIABLE : ' '* [a-z] [a-zA-Z]* [0-9]* ' '*;

PASSWORD:' '* ([0-9a-zA-Z] | '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';'| '#' |'\\' )+ ' '* ;

STRING: ' '*  SINGLE_QOUT  ([0-9a-zA-Z] | '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';'| '#' |'\\' |' '|'%'|'^'|'&'|'*'|'!')+ [a-zA-Z]+ ([0-9a-zA-Z] | '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';'| '#' |'\\' |' '|'%'|'^'|'&'|'*'|'!')+ SINGLE_QOUT ' '*;

Whitespace : (' '|'\t'|'\r'? '\n')+ -> skip;

mode COMMENT ;
COMMENT_CONTENT : (~'!')+;
COMMENT_END : '!' ->popMode ;








