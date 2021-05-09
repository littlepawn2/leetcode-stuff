

def maxArea(height) -> int:
    num = len(height)
    maxArea = 0
    for i in range(num-1):
        for j in range(i+1, num):
            if height[i] > height[j]:
                bigHeight = height[j]
            else:
                bigHeight = height[i]
                