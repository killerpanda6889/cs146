def three_sum(nums):
    nums.sort()
    ret = []
    for i in range(len(nums)):
        search_add(nums, -nums[i], i, ret)
        while i + 1 < len(nums) and nums[i] == nums[i + 1]:
            i += 1
    return ret

def search_add(nums, target, x, sub_list):
    left = x + 1
    right = len(nums) - 1
    while left < right:
        if nums[left] + nums[right] == target:
            ans = [nums[left], nums[right], -target]
            sub_list.append(ans)
            while left < right and nums[left] == nums[left + 1]:
                left += 1
            while left < right and nums[right] == nums[right - 1]:
                right -= 1
            left += 1
            right -= 1
        elif nums[left] + nums[right] > target:
            right -= 1
        elif nums[left] + nums[right] < target:
            left += 1

def main():
    nums = [-5, 0, 5, 10, -10, 0]
    result = three_sum(nums)
    print(result)
    
if __name__ == "__main__":
    main()
