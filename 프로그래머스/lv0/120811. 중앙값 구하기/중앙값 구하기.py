def solution(array):
    array.sort()

    return array.pop(len(array) // 2)