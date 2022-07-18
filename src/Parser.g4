parser grammar Parser;

options { tokenVocab=Lexer; }

program
    :comment* page comment* controller (page|controller|comment)*
    ;

controller
    :CONTROLLER VARIABLE CONTROLS VARIABLE OPEN_CURLY_BRACKET ( if_statement| while_statement | controller_content SEMICOLON| comment)+ CLOSE_CURLY_BRACKET
    ;

controller_content
    : goto
    |print
    ;

if_statement
    :IF OPEN_BRACKET condition CLOSE_BRACKET  ( goto SEMICOLON |print SEMICOLON |comment|OPEN_CURLY_BRACKET (controller_content SEMICOLON |if_statement |while_statement|comment)* CLOSE_CURLY_BRACKET) (  ELSE controller_content SEMICOLON)?
    ;

condition
    :VARIABLE IS (VARIABLE | NUMBER | STRING)
    ;

while_statement
    :WHILE OPEN_BRACKET condition CLOSE_BRACKET OPEN_CURLY_BRACKET  (controller_content SEMICOLON |if_statement |while_statement|comment)* CLOSE_CURLY_BRACKET
    ;

goto
    :GOTO VARIABLE
    ;

print
    :PRINT (STRING|VARIABLE)
    ;


page
    :PAGE VARIABLE OPEN_CURLY_BRACKET page_content CLOSE_CURLY_BRACKET
    ;

page_content
    :comment* header comment* body comment* footer comment*
    ;

header
    :HEADER OPEN_CURLY_BRACKET header_content+ CLOSE_CURLY_BRACKET
    ;

header_content
    : SITE_NAME VARIABLE IS STRING SEMICOLON (optionsList SEMICOLON|button SEMICOLON |comment )*
    ;

footer
    :FOOTER OPEN_CURLY_BRACKET footer_content CLOSE_CURLY_BRACKET
    ;

footer_content
    :(( CONTACTINFO VARIABLE IS ( SINGLE_QOUT (PHONE_NUMBER|EMAIL) SINGLE_QOUT | STRING ) SEMICOLON) |description SEMICOLON |comment )*
    ;

body
    :BODY OPEN_CURLY_BRACKET ( article |body_content SEMICOLON | comment)* CLOSE_CURLY_BRACKET
    ;

body_content
    :optionsList
    |description
    |picker
    |choices
    |image
    |field
    |button
    ;

optionsList
    :OPTIONSLIST VARIABLE IS OPEN_SQUARE_BRACKET (STRING| OPEN_BRACKET image CLOSE_BRACKET) ( COMMA (STRING| OPEN_BRACKET image CLOSE_BRACKET))*  CLOSE_SQUARE_BRACKET
    ;

description
    :DESCRIPTION  IS STRING
    ;

picker
    :PICKER VARIABLE IS OPEN_SQUARE_BRACKET STRING (COMMA STRING)*  CLOSE_SQUARE_BRACKET
    ;

choices
    :CHOICES VARIABLE IS OPEN_SQUARE_BRACKET STRING (COMMA STRING)*  CLOSE_SQUARE_BRACKET
    ;

image
    :IMAGE VARIABLE IS STRING
    ;

field
    :FIELD VARIABLE OPEN_BRACKET VARIABLE CLOSE_BRACKET IS FIELD_TYPE
    ;

button
    :BUTTON VARIABLE IS STRING
    ;

article
    :ARTICLE VARIABLE OPEN_CURLY_BRACKET comment* article_title comment* ( article_content|comment  )+ CLOSE_CURLY_BRACKET
    ;

article_title
    :ARTICLE_TITLE VARIABLE IS STRING SEMICOLON
    ;

article_content
    : ARTICLE_CONTENT VARIABLE IS (STRING SEMICOLON|OPEN_SQUARE_BRACKET  (image | description |optionsList ) ( COMMA  (image | description |optionsList)  )* CLOSE_SQUARE_BRACKET SEMICOLON  )
    ;

comment : COMMENT_BEGIN COMMENT_CONTENT COMMENT_END ;



















