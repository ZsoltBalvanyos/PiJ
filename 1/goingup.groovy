Integer i
Integer counter=1
List m=[]

while (true){
i=getNumber("Please enter the first number: ")
if (i== -1) break
m.add(i)
}

//println m.size()
Boolean flag=true

while(counter<m.size()){
if (m[m.size()- counter] - m[m.size()-counter -1]!=1){
println "No"
flag=!flag
break

}
counter++
}

if (flag)
println "Yes"


Integer getNumber(String prompt){
print prompt
str=System.console().readLine()
return Integer.parseInt(str)
}