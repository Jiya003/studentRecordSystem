import random#importing random library for number

no_of_guesses = int(10)
#declaring no of guesses

number = random.randint(0, 100)
#number is sleecting
print("Hello User! Welcome to Number Guessing game.")
print("You have 10 guesses")

print("Enter a number within the range of 0 to 100")
#loop
while (no_of_guesses):
    try:
        n = int(input())
    except ValueError:
        print("Oops!  That was not a valid number.  Try again...")

    if (number == n ):
        print("You have guessed the correct number!!!!")
        break
    elif (number > n):
        print("Number is too small")
    elif (number < n):
        print("Number is too large")
    else:
        print("sorry!!")

    if (number != n):
        print("You haven't guessed the correct number!!!!")
        no_of_guesses = no_of_guesses - 1
        print("No of guesses left: ", no_of_guesses)

if (no_of_guesses == 0):
    print("The number was: ", number)
else:
    print("Congratulations you have guessed the number:", number)

