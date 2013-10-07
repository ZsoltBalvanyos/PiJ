Integer i

while(true){
i=getNumber("Please enter a number: ")
if (i==0) break
if(i%2>0)
	println "This was an odd number."
else
	println "This was an even number."
}


Integer getNumber(String prompt){
print prompt
str=System.console().readLine()
return i=Integer.parseInt(str)
}