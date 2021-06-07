height = float(input("Ihre Körpergrösse in m"))
weight = float(input("Ihr Gewicht in kg"))
height*=height
bmi =weight/height
message=""
if bmi<18.5:
    message="Sie sind untergewichtig"
if 18.5<=bmi<24.9:
    message="Sie sind normalgewichtig"
if 24.9<=bmi<29.9:
    message="Sie sind leicht übergewichtig"
if 30<=bmi<34.9:
    message="Sie sind übergewichtig"
if 35<=bmi<39.9:
    message="Sie sind sehr übergewichtig"
if bmi>=40:
    message="Sie sollten dringendst abnehmen"


print("ihr BMI beträgt {}".format(bmi))
print(message)
