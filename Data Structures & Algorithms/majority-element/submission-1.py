class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        countGroup = defaultdict(int)

        res = maxCount = 0

        for num in nums:
            countGroup[num] += 1
            if maxCount < countGroup[num]:
                res = num
                maxCount = countGroup[num]
        return res