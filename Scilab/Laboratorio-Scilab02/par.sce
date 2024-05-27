clc;
mprintf("UENF - Ciencia da Computacao\n");
mprintf("Aluno: Marcos Bruno - Campos %s\n", date());

disp("Digite um valor")
n = input("");

if modulo(n, 2) == 0 then
    printf("\nO número %d é par.\n", n);
else
    printf("\nO número %d é ímpar.\n", n);
end
