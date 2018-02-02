# SICP Using CCL (Clozure CL REPL)

Session 1A
  - Learnt basics of LISP on Clozure CCL
  - key heighlights: 
  1. Creating Abstraction: Now square-root function is a abstraction created for the world to use. No one need to know the internals of it.
  2. Lexical scoping: You can define function inside function. Inner function gets the scope of the outer function. Hence while calling the inner function, parent function doesn't need to pass it's function parameters.
  3. Case statements in LISP 
  ```swift
  (defun abs_number(x)
      (COND ((< x 0) (- x)) // COND ((predicate value) (predicate value))
            ((= x 0) 0)
            ((> x 0) x)))
   ```
     

