Integer i
Integer j
Integer counter=0
Integer result=0

i=getNumber("Please enter the first number: ")
j=getNumber("Please enter the second number: ")

while (j>counter){
result += i
counter++

println result
}

Integer getNumber(String prompt){
print prompt
str=System.console().readLine()
return Integer.parseInt(str)
}