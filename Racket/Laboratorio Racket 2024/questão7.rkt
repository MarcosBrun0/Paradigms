;; Introdução à Linguagem Scheme-Racket
;; Prof. Ausberto S. Castro Vera       (ascv@uenf.br)
;; UENF-CCT-LCMAT - Curso de Ciencia da Computacao
;; 2024
;; Aluno: Marcos Bruno 

;;;;;;;;;;;;;;;;
;;
     ;; define a linguagem default
; ------------------------------------------------
(define pi 3)

(define (volume-cilindro raio altura)
 (* pi (* raio raio) altura))

(define raio 10)
(define altura 20)

(define (calcular-volume-galao)

      (display "O volume do galão de óleo é: ")
      (display (volume-cilindro raio altura))
      (display " metros cúbicos.")
      (newline))


(calcular-volume-galao)
