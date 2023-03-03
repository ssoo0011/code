from random import randrange

print("숫자야구 시작")

answers = []

i = 0

#배열 만들기
while True: #첫 번째 숫자만 구하기 (0 제외)
    num = randrange(0, 10)
    if len(answers) == 0:
        if num != 0:
            answers.append(num)
            # print(len(answers))
            # print('answers[0]=', answers[0])
        elif num == 0:
            continue
    elif len(answers) == 1: #두 번째 숫자 구하기
        if num != answers[0]:
            answers.append(num)
            # print(len(answers))
            # print(answers)
        elif num == answers[0]:
            continue

    if len(answers) == 2: #세번째 숫자 구하기
        if num != answers[0] and num != answers[1]:
            answers.append(num)
            # print(len(answers))
            print(answers)
            break
        elif num == answers[0] or num == answers[1]:
            continue

#배열에 있는 숫자 입력받기

inputnum = []
while True:
    inputdata = list(map(int, input().split())) #한 번에 여러개 입력받기

    if len(inputnum) != 3:
        print('숫자를 3개 입력하세요.')
        print(inputnum)
        print(len(inputnum) <= 3)
        continue

    elif len(inputnum) == 3:
        ball = 0
        strike = 0
        print(inputnum)
        for i in range(0, 3):
            for j in range(0, 3):
                if answers[i] == inputnum[j] and i == j:
                    strike += 10
                elif answers[i] == inputnum[j] and i != j:
                    ball += 1

        if strike == 3:
    10   0     print('성공!')
            break

        print('%d strike %d ball' % (strike, ball))
471