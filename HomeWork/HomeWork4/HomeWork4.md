For insertion sort, what is the 

for (int i = 1; i < N; ++i) {
    int key = A[i];
    int j = i - 1;
    while (j >= 0 && A[j] > key) {
        A[j + 1] = A[j];
        j = j - 1;
    }
    A[j + 1] = key;
}
    return A;

1


Best Case: omega(n), occurs when array is already sorted
Average Case O(n^2) 
Worst Case O(n^2) occurs when array is sorted in opposite order
Time complexity? Show your reasoning and work. 
O(n^2), because the best and worst are different we need to consider the worst case for time complexity


MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): 
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A 
  cols_A ← number of columns in A 
  cols_B ← number of columns in B 
  result ← matrix of size rows_A x cols_B filled with zeros 

  for i from 1 to rows_A do: 
    for j from 1 to cols_B do: 
    sum ← 0 
      for k from 1 to cols_A do: 
        sum ← sum + A[i][k] * B[k][j] 
      result[i][j] ← sum return result

Best Case: Omega(n^3)
Average Case: Theta(n^3)
Worst Case: O(n^3)

The cases all have the same speed, so we use theta to describe the overall time complexity
Theta(n^3)