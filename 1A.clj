(defun avg(x y) (/ (+ x y) 2))

(defun square-root(x)
      (defun try-square-root(guess)
        (defun goodEnough() (< (abs (- x (* guess guess))) 0.0001))
        (defun improveGuess() (avg guess (/ x guess)))
        
        (if (goodEnough) 
            guess
            (try-square-root (improveGuess))))
    (try-square-root 1))

(square-root 5)
