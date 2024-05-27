// Prof. Ausberto S. Castro Vera
// UENF-CCT-LCMAT-Ciencia da Computacao
//  Maio, 2024 
//
// Para executar desde o editor SciNotes:   < Ctrl ><Shift>< E >
//
// ======> Assunto: Programacao: GUI - Entrada de Dados ==================

clear; clc;
Aluno = 'Marcos Bruno';

r = messagebox([Aluno+', voce esta com Notas muito baixas...'; ' ';
             'Precisa de outra prova?'], "Prof. Ausberto Castro - UENF", "info",["Não","Sim"], "modal");

if r ==2 then

v = messagebox([Aluno+',voce pode fazer a prova na quinta?'; ' ';
             ''], "Prof. Ausberto Castro - UENF", "info",["Não","Sim"], "modal");
if v == 2 then
   messagebox('Confirmado')
else messagebox('vamos marcar pra semana que vem!')
    end

  else messagebox('Que pena!, '+Aluno+' ... era uma segunda oportunidade!', "Mensagem do Professor");
end;


