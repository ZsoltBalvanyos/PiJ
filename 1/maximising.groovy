Integer i
List m=[]

while (true){
i=getNumber("Please enter the first number: ")
if (i== -1) break
m.add(i)
}

m.sort()
println m[m.size()-1]


Integer getNumber(String prompt){
print prompt
str=System.console().readLine()
return Integer.parseInt(str)
}