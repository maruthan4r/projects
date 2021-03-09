from tkinter import *

root = Tk()

e = Entry(root, width=50, borderwidth=5)
e.pack()


def onButtonClick():
    myLabel = Label(root, text="Your name is " + e.get())
    myLabel.pack()


myButton = Button(root, text="Submit", command=onButtonClick)
myButton.pack()

root.mainloop()
