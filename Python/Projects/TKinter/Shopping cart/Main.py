from tkinter import *

totalCost = 0
anzProd = 0
products = []
root = Tk()
root.title("Shopping cart")


def add():
    userInput = e1.get()
    if userInput == "":
        pass
    if "/" not in userInput:
        pass
    if len(userInput) < 3:
        pass
    else:
        priceInt = int
        global anzProd
        splitInput = userInput.split("/")
        product = Label(prodList, width=50, text=splitInput[0])
        product.grid(row=anzProd, column=0)
        price = Label(prodList, width=50, text=splitInput[1]+"$")
        price.grid(row=anzProd, column=1)
        anzProd += 1
        priceInt=int(splitInput[1])

        global totalCost
        totalCost= totalCost+priceInt


frame = Frame(root, width=100, height=100, bg="blueviolet")
e1 = Entry(frame, width=100, borderwidth=5)
instruction = Label(frame, width=100, bg="blueviolet", fg="white", text="Format: Product/Price")
total = Label(frame, width=100, bg="blueviolet", fg="white", text=totalCost)
prodList = Frame(frame, width=100, bg="white")
submit = Button(frame, width=100, text="Add", bg="teal", fg="white", command=add)

categories = Frame(frame, width=100)
categoryProduct = Label(categories, width=50, text="Name")
categoryPrice = Label(categories, width=50, text="Preis")

frame.pack()
instruction.grid()
e1.grid()
categories.grid()
categoryProduct.grid(row=0, column=0)
categoryPrice.grid(row=0, column=1)
prodList.grid()
total.grid()
submit.grid()

mainloop()
