# imports
import re

# 00 Variablen deklarieren
wochentage = ['MONTAG', 'DIENSTAG', 'MITTWOCH', 'DONNERSTAG', 'FREITAG', 'SAMSTAG', 'SONNTAG']
woche = {
    'MONTAG': {
        'BEGINNINGS': [],
        'ENDINGS': []
    },
    'DIENSTAG': {'BEGINNINGS': [],
                 'ENDINGS': []},
    'MITTWOCH': {'BEGINNINGS': [],
                 'ENDINGS': []},
    'DONNERSTAG': {'BEGINNINGS': [],
                   'ENDINGS': []},
    'FREITAG': {'BEGINNINGS': [],
                'ENDINGS': []},
    'SAMSTAG': {'BEGINNINGS': [],
                'ENDINGS': []},
    'SONNTAG': {'BEGINNINGS': [],
                'ENDINGS': []}
}


# 1. Wochentag eingeben
def dayInput():
    day = input("Geben sie den Tag ein>>").upper()
    while day not in wochentage:
        day = input("Tag eingeben>>").upper()

    return day.upper()


# 2.Zeitraum eingeben
def timeInput(wochentag):
    begin = input('anfang eingeben(HH:MM)')
    end = input('ende eingeben(HH:MM)')

    timePattern = r"[0-2][0-9][:][0-5][0-9]"

    if re.search(r"[0-2][0-9][:][0-5][0-9]",) and re.search(r"[0-2][0-9][:][0-5][0-9]",end):
        print("Gültiges Format!")
        print([begin,end])
        print("ueberprüfen ob Platz verfügbar ist...")
        return [begin,end]
    else:
        print("Bitte im Format HH:MM eingeben")
        timeInput(wochentag)


def timeTableInput(day, timearea):
    activity = input("Geben sie den Namen der Aktivität an>>>")
    woche[day].update({timearea: activity})


# x. Stundenplan anzeigen
def showTimeTable():
    print(woche['MONTAG']['BEGINNINGS'])
    for i in range(len(wochentage)):
        print(wochentage[i] + ": {}".format(woche[wochentage[i]]))


# run
print('Willkommen zu Ihrem Stundenplan')


tag = dayInput()
zeitraum = str(timeInput(tag))
print(tag+zeitraum)

timeTableInput(tag, zeitraum)

showTimeTable()
