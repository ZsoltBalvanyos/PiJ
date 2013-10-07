Integer i
List m=[]

while (m.size<3){
i=getNumber("Please enter the first number: ")
m.add(i)
counter++
}

m.sort()
println m


Integer getNumber(String prompt){
print prompt
str=System.console().readLine()
return Integer.parseInt(str)
}