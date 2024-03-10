In both of languages the logic used was that according to BST properties
nodes greater than the current node will be to the left and nodes less than will go to the right
so when we are at the lowest common ancestor that means that we are either
1. On one node p or q and the other is below it.
2. We are on a node not p or q and one is to the left and the other is to the right
so if both nodes are less than our current we move to the left
and if both nodes are greater than we move to the right.