word1 = input()
word2 = input()


def sameword(list1, list2):
    if len(list1) == len(list2):

        for elem1, elem2 in zip(list1, list2):
            if elem1 != elem2:
                return False
        return True
    else:
        return False


list_word1 = list(word1)
list_word2 = list(word2)

list_word1.sort()
list_word2.sort()


if sameword(list_word1,list_word2):
    print("Yes")
else:
    print("No")
