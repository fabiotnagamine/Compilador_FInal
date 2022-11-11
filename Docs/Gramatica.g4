grammar Gramatica;

//Regras de Produção
prog                    : 'prog' cod 'fimProg'
                        ;
cod                     : (blocoCod)+
                        ;
blocoCod                : blocoCodLeitura 
                        | blocoCodEscrita
                        | blocoCodAtrib
                        ;
blocoCodLeitura         : 'ler' AP ID FP SC
                        ;
blocoCodEscrita         : 'escreva' AP ID FP SC 
                        ;
blocoCodAtrib           : ID ATTR expr SC
                        ;
expr                    : term (OP term )*
                        ;
term                    : ID 
                        | NUMBER
                        ;
//tokens 
AP      : '(' //AP (Abre Parenteses)
        ;
FP      : ')' //FP (Fecha Parenteses)
        ;
SC      : ';'
        ;
OP      : '+'
        | '-'
        | '*'
        | '/'
        ;
ID      : 