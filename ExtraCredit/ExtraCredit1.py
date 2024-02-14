def main():
   print(fibonacci(7))
    
def fibonacci(n):
    x = 0
    j = 1
    if(n < 1):
        return 0
        
    for i in range(0,n-1):
        temp = x + j
        x = j
        j = temp
    return j
            


if __name__ == "__main__":
    main()