from tkinter import *

root =Tk()

#creating
myLabel = Label(root,text="Hello world")
myLabel2 = Label(root,text="My Name is Maruthan Thanabalasingam")

#Attaching Labels by a grid(Gitter) system
myLabel.grid(row=0,column=0)
myLabel2.grid(row=1,column=0)

root.mainloop()