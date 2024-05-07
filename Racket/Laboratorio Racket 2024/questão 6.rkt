;; Introdução à Linguagem Scheme-Racket
;; Prof. Ausberto S. Castro Vera       (ascv@uenf.br)
;; UENF-CCT-LCMAT - Curso de Ciencia da Computacao
;; 2024
;; Aluno: Marcos Bruno 

;;;;;;;;;;;;;;;;
;;
     ;; define a linguagem default
; ------------------------------------------------

(define (area-quadrado lado)
 (* lado lado))

(define (area-trapézio base-maior base-menor altura)
 (/ (+ base-maior base-menor) 2))


(define (area-poligono-regular numero-de-lados lado altura)
 (let* ((perimetro (* numero-de-lados lado))
         (apotema (* altura (sqrt (- 1 (expt (/ numero-de-lados 2) 2))))))
    (/ (* perimetro apotema) 2)))


(define lado-quadrado 10)
(define base-maior-trapézio 20)
(define base-menor-trapézio 10)
(define altura-trapézio 40)
(define numero-de-lados-poligono 6)
(define lado-poligono 5)
(define altura-poligono 10)


(display "Área do quadrado: ")
(display (area-quadrado lado-quadrado))
(newline)

(display "Área do trapézio: ")
(display (area-trapézio base-maior-trapézio base-menor-trapézio altura-trapézio))
(newline)

(display "Área do polígono: ")
(display (area-poligono-regular numero-de-lados-poligono lado-poligono altura-poligono))
(newline)

