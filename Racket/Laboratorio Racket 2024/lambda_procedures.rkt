;; Introdução à Linguagem Scheme-Racket
;; Prof. Ausberto S. Castro Vera       (ascv@uenf.br)
;; UENF-CCT-LCMAT - Curso de Ciencia da Computacao
;; 2024
;; Aluno: Marcos Bruno P. Campos   

;;;;;;;;;;;;;;;;   Escolha a linguagem R5RS
;;
      ;; define a linguagem default
; ------------------------------------------------

(define (calcular-prestacao-atraso valor taxa tempo)
  (+ valor (* valor (/ taxa 100) tempo)))


(display "Exemplos de cálculo de prestação em atraso:")
(newline)
(display "Valor inicial: 100, Taxa (%): 10, Tempo (meses): 2")
(newline)
(display (calcular-prestacao-atraso 100 10 2)) ; Exemplo 1
(newline)
(display "Valor inicial: 500, Taxa (%): 5, Tempo (meses): 3")
(newline)
(display (calcular-prestacao-atraso 500 5 3))  ; Exemplo 2


