import heapq

def minCostToSupplyWater(n, wells, pipes):

    weighted_graph = {}
    for pipe in pipes:
        if pipe[0] not in weighted_graph:
            weighted_graph[pipe[0]] = []
        if pipe[1] not in weighted_graph:
            weighted_graph[pipe[1]] = []
        weighted_graph[pipe[0]].append([pipe[1], pipe[2]])
        weighted_graph[pipe[1]].append([pipe[0], pipe[2]])

    
    weighted_graph[0] = []
    for h in range(1, n + 1):
        if h not in weighted_graph:
            weighted_graph[h] = []
        weighted_graph[h].append([0, wells[h - 1]])
        weighted_graph[0].append([h, wells[h - 1]])

    # Prim's algorithm
    min_heap = [(0, 0)]  # (w_i, house_i)
    included = [False] * (n + 1)
    count_visited = 0
    min_cost = 0

    while count_visited <= n and min_heap:
        w, h = heapq.heappop(min_heap)
        if not included[h]:
            included[h] = True
            count_visited += 1
            min_cost += w
        else:
            continue

        for neighbor in weighted_graph[h]:
            if not included[neighbor[0]]:
                heapq.heappush(min_heap, (neighbor[1], neighbor[0]))

    return min_cost

# Example usage:
n = 3
wells = [1, 2, 2]
pipes = [[1, 2, 1], [2, 3, 1]]
print(minCostToSupplyWater(n, wells, pipes))  # Output should be 3
