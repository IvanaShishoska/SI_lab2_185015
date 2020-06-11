# Втора лабораториска вежба по Софтверско инжинерство

## Ивана Шишоска индекс 185015
## Група на код:
#### Ја добив групата 1
## Contorl Flow Graph
![Diagram] (./Untitled Diagram.jpg)
## Цикломатска комплексност
#### Цикломатската комплексност на овој код е 7, ја добив со формулата E-N+2 каде Е е бројот на рабови N е бројот на јазли, 18-13+2=7
## Тест случаи според критериумот Every path
* А - К - ЕND // кога user=null
* A - B - K - END // кога username=null
* A - B - C - D - Dcond - I - K - END // кога email=""
* A - B - C - D - Dcond - E - F - G - H - Dmodif - Dcond - I - J - END // returns true сите услови се исполенти
* A - B - C - D - Dcond - E - F - G - Dmodif - Dcond - I - K - END // во email нема .
* A - B - C - D - Dcond - E - G - H - Dmodif - Dcond - I - K - END // во email нема @
* A - B - C - D - Dcond - E - G - Dmodif - Dcond - I - K - END // во email нема ни @ ни .


## Тест случаи според критериумот Multiple Condition
#### ја разгледуваме линијата//  if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername()))
* F && X && X => F username=null, email=null
* T && F && X => F username!=null, email=null 
* T && T && F => F username!=null, email!=null list contains user
* T && T && T => T username!=null, email!=null list doesnt contain user




