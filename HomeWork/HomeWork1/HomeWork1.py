def main():
   print(isPalindrome("racecar"))
    
def isPalindrome(s):
        s = s.lower()
        s ="".join(c for c in s if c.isalnum())
        t = s[::-1]
        return s == t

if __name__ == "__main__":
    main()