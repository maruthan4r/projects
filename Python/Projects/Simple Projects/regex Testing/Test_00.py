import re

if re.search(r"[0-2][0-9][:][0-5][0-9]",'099:52'): #testet ob string dem zeitformat HH:MM entspricht
    print("Es geht")
else:print('geht nicht')