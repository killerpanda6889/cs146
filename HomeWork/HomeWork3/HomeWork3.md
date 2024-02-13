1. Insertion Sort
Best Case O(n) array is already sorted
Worst Case O(n^2)
Average Case O(n^2)

2.  
MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): 
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A 
  cols_A ← number of columns in A 
  cols_B ← number of columns in B 
  result ← matrix of size rows_A x cols_B filled with zeros 

  for i from 1 to rows_A do: (n+1)
    for j from 1 to cols_B do: n(N+1)
      sum ← 0 (n*n)
      for k from 1 to cols_A do: n*n*(n+1)
        sum ← sum + A[i][k] * B[k][j]  n*n*n

      result[i][j] ← sum return result n*n

1. Best case
2. 