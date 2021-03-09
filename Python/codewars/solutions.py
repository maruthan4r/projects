#1 remove First and last character
"""
def remove_char(s):
    end=(len(s)-1)
    t=s[1:end]
    return t
    """

#2 Selection return a list of members who are seniors and those who are members @param list of 2 data of member
def open_or_senior(data):
    count=0
    output=[pass]
    
    while count<len(data):
        listTemp=data[count]
        if listTemp[0]>55 and listTemp[1]>7:
            output[count]="Senior"
            count+=1
        else:
            output[count]="Open"
            count+=1
        
    return output

    

aListOfMembers=[[56,8],[54,2]]
print(open_or_senior(aListOfMembers))