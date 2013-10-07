Integer i
Integer counter=1
List m=[]

while (true){
i=getNumber("Please enter the first number: ")
if (i== -1) break
m.add(i)
}

Boolean flag=true

while(counter<m.size()){
if (m[m.size()- counter] - m[m.size()-counter -1]!=1){
flag=!flag
break
}
}

if(flag){
println "Yes"
}else{
println "No"
}

Integer getNumber(String prompt){
print prompt
str=System.console().readLine()
return Integer.parseInt(str)
}