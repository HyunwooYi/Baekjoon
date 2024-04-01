def big(n):
    for i in range (0, n, 1):
        if i == 0:
            Big = num[i]
        else:
            if num[i] >= Big :
                Big = num[i]
    return Big

def small(n):
    for i in range (0, n, 1):
        if i == 0:
            Small = num[i]
        else:
            if num[i] <= Small :
                Small = num[i]
    return (Small)
# 주 프로그램 작성
N = int(input())
num = []
num = list(map(int, input().split()))
S = small(len(num))
B = big(len(num))

print(S,B)
