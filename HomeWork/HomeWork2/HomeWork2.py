def main():
   print(firstBadVersion(10))
    
def firstBadVersion(n):
    low = 1
    high = n
    while True:
        mid = low + (high - low) // 2
        if isBadVersion(mid) and not isBadVersion(mid - 1):
            return mid
        elif not isBadVersion(mid):
            low = mid + 1
        else:
            high = mid
            
def isBadVersion(s):
    return s >= 6

if __name__ == "__main__":
    main()