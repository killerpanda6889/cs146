def findTheCity(n, edges, distanceThreshold):
    # Initialize the distance matrix
    dist = [[float('inf')] * n for _ in range(n)]
    for i in range(n):
        dist[i][i] = 0

    # Populate the distance matrix with edge weights
    for edge in edges:
        from_city, to_city, weight = edge
        dist[from_city][to_city] = weight
        dist[to_city][from_city] = weight

    # Floyd-Warshall algorithm to find shortest distances
    for k in range(n):
        for i in range(n):
            for j in range(n):
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    # Find the city with the smallest number of reachable cities within the threshold
    min_reachable = n + 1
    result = -1
    for i in range(n):
        reachable_cities = sum(1 for j in range(n) if dist[i][j] <= distanceThreshold)
        if reachable_cities <= min_reachable:
            min_reachable = reachable_cities
            result = i

    return result

# Example usage
n = 5
edges = [[0, 1, 2], [0, 4, 8], [1, 2, 3], [1, 4, 2], [2, 3, 1], [3, 4, 1]]
distanceThreshold = 2
print(findTheCity(n, edges, distanceThreshold))
