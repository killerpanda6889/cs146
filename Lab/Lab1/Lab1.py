def main():
    nums = [0,4,6,9,7]
    print(twoSum(nums,11))
    
def twoSum(nums, target):
    found = dict()
    for i in range(len(nums)):
        if((target - nums[i]) in found):
            return[found.get(target-nums[i]),i]
        else:
            found[nums[i]] = i

if __name__ == "__main__":
    main()