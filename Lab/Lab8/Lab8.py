def coinChange(coins, amount):
    dp = [0] + [float('inf')] * amount

    for target in range(1, amount + 1):
        for c in coins:
            if target - c >= 0 and dp[target - c] != float('inf'):
                dp[target] = min(dp[target], 1 + dp[target - c])

    return dp[amount] if dp[amount] != float('inf') else -1

# Test the function
coins = [1, 2, 5]
amount = 11
print(coinChange(coins, amount))
