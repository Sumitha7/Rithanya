lst=[]
num = int(input("enter the number: "))
for n in range(num):
    numbers = int(input("Enter number:"))
    lst.append(numbers)
print("Maximum element in the list is :", max(lst))
