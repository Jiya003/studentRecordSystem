with open('sample.txt') as f:
    lines = f.read()
    print(lines)

count=0
#To print the number of characters in the text file.
for i in lines:
    if(i==" " or i=="\n"):
        pass
    else:
        count=count+1
print("The no of characters in Text File", count)
f.close()


with open('sample.txt') as f1:
    lines1 = f1.read()
count1=0
#To print the number of words in the Text File:
for i in lines1:
    if(i==" " or i=="\n"):
        count1=count1+1
    else:
        pass
print("Number of words in the text file:",count1+1)
f1.close()

#To print the number of lines in the Text File:
with open('sample.txt') as f2:
    lines2 = f2.read()
count2=0
for i in lines2:
    if(i=="\n"):
        count2=count2+1
    else:
        pass
print("Number of lines in the text file:",count2)
f2.close()

#To print the number of spaces in the Text File:
with open('sample.txt') as f3:
    lines3 = f3.read()
count3=0
for i in lines3:
    if(i==" "):
        count3=count3+1
    else:
        pass
print("Number of spaces in the text file:",count3)
f3.close()

#To find the specific character in the file-line number.

with open('sample.txt') as f4:
    lines4 = f4.read()

word=input("Enter a character:")
for i,line in enumerate(lines4,1):
    if word in line:
        print("Word \"{}\" found in line {}".format(word, i+1))
    else:
        print("The word",word,"is not found")
f4.close()
