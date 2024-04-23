Create Greedy Subproblems
For every index in coins we call our helper function with an index specified 
and we want to use coins that are just at our current index and the ones to the left of it
Now we can be greedy
if we dont find a solution return -1