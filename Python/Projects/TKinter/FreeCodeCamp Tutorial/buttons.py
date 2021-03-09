from tkinter import *

root =Tk()

def onButtonClick():
	myLabel = Label(root,text="You've clicked on this Button mf!")
	myLabel.pack()

myButton = Button(root,text="Click me!",command=onButtonClick)
myButton.pack()

root.mainloop() 