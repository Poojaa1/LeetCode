class Solution:
    def isPalindrome(self, s: str) -> bool:
        alphanum= re.sub(r'[^a-zA-Z0-9]','',s)
        lower=alphanum.lower()
        rever=reversed(lower)
        # print("amanaplanacanalpanama")
        ans= ''.join(rever)
        return ans==lower
        # return rever