
def longestPalindrome(s):
    count = 0
    odd = True
    chars = {}
    for i in range(0,len(s)):
        if(s[i] in chars):
            chars[s[i]] = chars[s[i]] + 1
        else:
            chars[s[i]] = 1
    for c in chars.values():
        if(odd and c % 2 == 1):
            count+=c
            odd = False
        elif(c % 2 == 0):
            count += c
        else:
            c-=1
            count += c
    return count;

if __name__ == "__main__":
    print(longestPalindrome("abccccdd"))
