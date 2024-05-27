// Prof. Ausberto S. Castro Vera
// UENF-CCT-LCMAT-Ciencia da Computacao
// Marcos Bruno
//---------------------------------------

clear; clc;

txt=['Produto'; 'Valor']; 
cadastro=x_mdialog(['Informe os dados: '],txt,['';'1']); 

produto=cadastro(1);   // strings convertidos em numeros
valor=evstr(cadastro(2)); 

if cadastro(1) ~= '' then
    msg = 'O produto foi cadastrado';
    else msg = 'Produto invalido. Insira um nome';
end


messagebox(msg);
