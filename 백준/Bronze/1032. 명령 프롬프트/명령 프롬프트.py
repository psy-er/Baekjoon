num = int(input())
data1 = list(input())

charnum = len(data1) # 입력받은 문자열의 개수를 세서 대입하기
for i in range(num-1): # 0부터 마지막 길이 개수까지
    data2 = list(input())
    for j in range(charnum):
        if (data1[j] != data2[j]): # 만약 다른 값을 가지고 있으면 ?저장
            data1[j] = "?"
print(''.join(data1))
