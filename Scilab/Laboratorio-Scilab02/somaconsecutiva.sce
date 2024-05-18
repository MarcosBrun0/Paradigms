// Prof. Ausberto S. Castro Vera 
// UENF-CCT-LCMAT-Ciencia da Computacao
//  Maio, 2024
//
// Para executar desde o editor SciNotes:   < Ctrl ><Shift>< E >
clear
clc;    
mprintf("UENF - Ciencia da Computacao\n");
printf(" Aluno: Marcos Bruno P. Campos - Campos %s\n", date());

//----------------------------------------------------------------------------

x=input("Qual é o valor de X?")
n=input("Qual é o valor de N?")
soma = 0
for a= 0:1:n
    soma = soma  + (x+a)
    printf("laço[%d]_soma = %d ",a,soma)
end

