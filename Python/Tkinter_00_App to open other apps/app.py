import os
import tkinter as tk
from tkinter import filedialog

root = tk.Tk()
apps = []

def addApp():
    filename = filedialog.askopenfilename(initialdir="/", title="Select File",
                                          filetypes=(("excecutables", "*.exe"), ("all files", "*.*")))

    apps.append(filename)
    print(filename)

    label = tk.Label(frame, text=filename, bg="gray")
    label.pack()

def deleteList():
    for widget in frame.winfo_children():
        widget.destroy()

def startapps():
    for app in apps:
        os.startfile(app)


canvas = tk.Canvas(root, height=700, width=700, bg="#263D42")
canvas.pack()

frame = tk.Frame(root, bg="white")
frame.place(relheight=0.8, relwidth=0.8, relx=0.1, rely=0.1)

openfile = tk.Button(root, text="add", padx=10, pady=5, fg="white", bg="#263D42", command=addApp)
openfile.pack()

runApps = tk.Button(root, text="Start", padx=10, pady=5, fg="white", bg="#263D42", command=startapps)
runApps.pack()

delete = tk.Button(root, text="delete List", padx=10, pady=5, fg="white", bg="#ff0000", command=deleteList)
delete.pack()

root.mainloop()
