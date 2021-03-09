#Strings can be single quote or double quote both are the same
print("Hello")
print('Hello')

#To assign a multiline string use three double quotes

x=""" This is a multi line string.
this one has more than one line.
You will see it in the print statement."""
print(x)

#IMPORTANT: Strings are arrays
a="Hello World"
print(a[1])

#you can return a part of a string using the splice syntax
b="Hello World"
print(b[2:5])

#negative indexing from Pos. 5 to pos.1
b="Hello, World"
print(b[-5:-2])

#get length of a string
print(len(b))

#check string

txt="He has number five."
x="has" in txt #überprüft ob "has" im string txt enthalten is, falls es enthalten ist gibt es true zurück sonst false
x="has" not in txt #überprüft ob "has" nicht im string txt enthalten is, falls es enthalten ist gibt es false zurück sonst true

#String Methods

#Strip() removes whitespace from begin or the end
txt=" Hello World "
a=txt.strip() #: "Hello, World"

#lower() returns string in lower case (Kleingeschrieben)
b=txt.lower() #: "hello World"

#upper() returns string in upper case (grossgeschrieben)
c=txt.upper() #: "HELLO WORLD"

#replace() replaces a char from string
d=txt.replace("H","M") #: "MELLO WORLD" ; @param: oldString,newString

#split splits a string into substring
e=txt.split("," ) #: ['Hello', 'World'] @param: seperator[str]

#concat strings



