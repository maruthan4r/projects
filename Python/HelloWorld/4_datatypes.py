"""
Built-In Datatypes
Text: str
Numeric: int,float,complex
sequence:list,tuple,range
mapping:dict
set:set,frozenset
boolean:bool
binary:bytes,bytearray,memoryview
"""

#get datatype
x=31232.432
print(type(x))

#float can also be scientific numbers

x=35e3
print (type(x))

#converting numbers 

x=1 #int
y=2.8 #float
z=1j #complex

a=float(x)
b=int(y)
c=complex(x)

print(a,b,c,x,y,z)

#random numbers

import random
print(random.randrange(1,10))


