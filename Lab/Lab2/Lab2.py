def main():
   print(isAnagram("hello" , "olehl"))
    
def isAnagram(s , t):
    counts = {}
    if(len(s) != len(t)):
       return False
    for i in range(len(s)):
       counts[s[i]] = 1 + counts.get(s[i],0)
       counts[t[i]] = -1 + counts.get(t[i], 0);
    for x in counts:
        if (counts[x] != 0):
            return False
    return True

if __name__ == "__main__":
    main()