full = [1, 1, 2, 2, 2, 8]
find = list(map(int, input().split()))

for i in range(6):
    print(full[i] - find[i], end=' ')