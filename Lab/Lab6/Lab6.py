from collections import deque

def canFinish(num_courses, prerequisites):
    graph = [[] for _ in range(num_courses)]
    
    for prerequisite in prerequisites:
        if prerequisite[0] == prerequisite[1]:
            return False  # A course that points to itself
        graph[prerequisite[0]].append(prerequisite[1])
    
    q = deque()
    processed = 0
    
    while processed != num_courses:
        for i in range(len(graph)):
            if not graph[i]:
                q.append(i)
        
        if not q:
            return False  # Cycle detected
        
        while q:
            curr = q.popleft()
            graph[curr].append(num_courses + 1)
            processed += 1
            print(curr, processed)
            for i in range(len(graph)):
                if curr in graph[i]:
                    graph[i].remove(curr)
    
    return True

# Test
array = [
    [0, 1],
    [1, 0]
]

print(canFinish(3, array))
