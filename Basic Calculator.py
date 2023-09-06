#Building a Simple Basic Calculator 

print("Welcome to my first python program , please Select the Operation number to be performed:")

print("1.ADD")
print("2.SUBTRACT")
print("3.MULTIPLY")
print("4.DIVIDE")

operation = input()

if operation == "1":
    num1 = input("Enter First Number:")
    num2 = input("Enter Second Number:")
    print("The Answer is "+ str(int(num1) + int(num2)))
elif operation == "2":
    num1 = input("Enter First Number:")
    num2 = input("Enter Second Number:")
    print("The Answer is " + str(int(num1) - int(num2)))
elif operation == "3":
    num1 = input("Enter First Number:")
    num2 = input("Enter Second Number:")
    print("The Answer is " + str(int(num1) * int(num2)))
elif operation == "4":
    num1 = input("Enter First Number:")
    num2 = input("Enter Second Number:")
    print("The Answer is " + str(int(num1) / int(num2)))
else:
    print("Invalid Input")             

