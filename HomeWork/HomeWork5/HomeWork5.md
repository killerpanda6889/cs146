T(N) = 2T(N-1) + 1
a= 2
b = 1
f(n) = 1
k = 0
Case 3: a > 1
all conditions pass for master theorem decreasing
so for master theorem --> O(n^0  * 2^(1/1))

solved recurrece relation T(n)= O((2^n) -1)

T(N) = 3T(N-1) + n
a= 3
b = 1
f(n) = n
k = 1

all conditions pass
Case 3: a > 1
T(n) = O(n^1 * 3^(n/1)) 
solved reccurence relation algebra T(n) = n^3


T(N) = 9T(N/2) + n2
a=9
b=2
f(n) = n^2
master theorem for divide/conquer applies
f(n) = O(n^log2(9)-e ) where e>0 then T(n) = Θ(n^log2(9) )
f(n) = Θ(n^log2(9) log^k(n) where k>=0 then T(n) = Θ(n log2(9) log^k+1(n))
f(n) = Ω(n log2(9)+e ) where e>0 then T(n) = Θ(n^2)
solved reccurence relation matches


T(N) = 100T(N/2) + nlog2cn + 1  (c is a constant)

a= 100
b =2
f(n) = n*log2(cn+1)
master theorem for divide/conquer applies
f(n) = O(n^log2(100)-e ) where e>0 then T(n) = Θ(n^log2(100) )
f(n) = Θ(n^log2(100) log^k(n) where k>=0 then T(n) = Θ(n log2(100) log^k+1(n))
f(n) = Ω(n log2(100)+e ) where e>0 then T(n) = Θ(nlog2cn + 1)
solved reccurence relation matches

T(N) = 4T(N/2) + n2logn

a= 4
b = 2
f(n)  + n^2log(n)
f(n) = O(n^2-e ) where e>0 then T(n) = Θ(n^2 )
f(n) = Θ(n^2 log^k(n) where k>=0 then T(n) = Θ(n 2 log^k+1(n))
f(n) = Ω(n^(2+e)) where e>0 then T(n) = Θ(n2logn)
solved reccurence relation matches


T(N) = 5T(N/2) + n2/logn
a = 5
b = 2
f(n) = n2/logn
f(n) = O(n^log2(5)-e ) where e>0 then T(n) = Θ(n^log2(5) )
f(n) = Θ(n^log2(5) log^k(n) where k>=0 then T(n) = Θ(n log2(5) log^k+1(n))
f(n) = Ω(n log2(5)+e ) where e>0 then T(n) = Θ(n2/logn)
solved reccurence relation matches