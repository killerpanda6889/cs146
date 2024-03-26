In both languages the strategy was to make an adjacency matrix and 
queue the courses/elements with 0 size, then to preserve the matrix shape we add an
invalid course to the matrix and update processed
once we proccessed all the courses we can return true
if we dont we can return false because a cycle represents a course that has a prereq for itself.