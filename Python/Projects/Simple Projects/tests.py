def timeInput():
    name = input('name eingeben')
    if name!='richtig':
        timeInput()

timeInput()