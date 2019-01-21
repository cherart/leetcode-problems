import math


class Solution:
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        i = 5
        result = 0
        while i <= n:
            result += n // i
            i *= 5
        return result


print(Solution().trailingZeroes(1))
print(Solution().trailingZeroes(5))
print(Solution().trailingZeroes(10))
print(Solution().trailingZeroes(15))
print(Solution().trailingZeroes(20))
print(Solution().trailingZeroes(25))
print(Solution().trailingZeroes(30))
print(Solution().trailingZeroes(35))
print(Solution().trailingZeroes(40))
print(Solution().trailingZeroes(45))
print(Solution().trailingZeroes(50))
print(Solution().trailingZeroes(55))
print(Solution().trailingZeroes(60))
print(Solution().trailingZeroes(65))
print(Solution().trailingZeroes(70))
print(Solution().trailingZeroes(75))
print(Solution().trailingZeroes(80))
print(Solution().trailingZeroes(85))
print(Solution().trailingZeroes(90))
print(Solution().trailingZeroes(95))
print(Solution().trailingZeroes(100))
print(Solution().trailingZeroes(105))
print(Solution().trailingZeroes(110))
print(Solution().trailingZeroes(115))
print(Solution().trailingZeroes(120))
print(Solution().trailingZeroes(125))
print(Solution().trailingZeroes(130))
print(Solution().trailingZeroes(135))
print(Solution().trailingZeroes(140))
print(Solution().trailingZeroes(145))
print(Solution().trailingZeroes(150))
print(Solution().trailingZeroes(155))
print(Solution().trailingZeroes(160))
print(Solution().trailingZeroes(165))
print(Solution().trailingZeroes(170))
print(Solution().trailingZeroes(175))
print(Solution().trailingZeroes(180))
print(Solution().trailingZeroes(185))
print(Solution().trailingZeroes(190))
print(Solution().trailingZeroes(195))
# print(Solution().trailingZeroes(140))
# print(Solution().trailingZeroes(145))
# print(Solution().trailingZeroes(150))
# print(Solution().trailingZeroes(155))
print(Solution().trailingZeroes(200))
print(Solution().trailingZeroes(205))
print(Solution().trailingZeroes(210))
print(Solution().trailingZeroes(215))
print(Solution().trailingZeroes(220))
print(Solution().trailingZeroes(225))
print(Solution().trailingZeroes(230))
print(Solution().trailingZeroes(235))
print(Solution().trailingZeroes(1000))
print(Solution().trailingZeroes(10000))
print(Solution().trailingZeroes(100000))

# 0
# 1
# 2
# 3
# 4
# 6
# 7
# 8
# 9
# 10
# 12
# 13
# 14
# 15
# 16
# 18
# 19
# 20
# 21
# 22
# 24
# 25
# 26
# 27
# 28
# 31
# 32
# 33
# 34
# 35
# 37
# 38
# 39
# 40
# 41
# 43
# 44
# 45
# 46
# 47
# 49
# 50
# 51
# 52
# 53
# 55
# 56
# 57
# 249
# 2499
# 24999
