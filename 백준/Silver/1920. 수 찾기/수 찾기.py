import sys

n = sys.stdin.readline()  # 5
arr = list(map(int, sys.stdin.readline().split()))  # 4 1 5 2 3 주어진 리스트
m = sys.stdin.readline()  # 5
find = list(map(int, sys.stdin.readline().split()))  # 1 3 7 9 5 찾을 숫자들

# 정렬
arr.sort()

# 이분 탐색

for num in find:  # find에 있는 원소 하나씩 꺼내서 num에 담아
    lower = 0
    upper = len(arr) - 1
    isExist = False  # 찾으면 true, 못찾으면 false

    while lower <= upper:  # 작거나 같을때 까지만. 커지면 끝나야 됨
        middle = (lower + upper) // 2
        if arr[middle] == num:
            isExist = True
            print(1)
            break
        elif arr[middle] > num:
            upper = middle - 1
        elif arr[middle] < num:
            lower = middle + 1
    if not isExist:
        print(0)
