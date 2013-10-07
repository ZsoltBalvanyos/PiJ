int numberToGuess = Math.abs(100 * Math.random())
println numberToGuess

Integer number
//Integer number = userNumber("Tell me a number: ")

while(number!=numberToGuess){
 number = userNumber("Tell me a number: ")

    if(number<numberToGuess)
    println ("No, number is higher!")
    
    if(number>numberToGuess)
    println ("No, number is lower!")
}

println "CORRECT"

Integer userNumber(String prompt){
print prompt
str= System.console().readLine()
return Integer.parseInt(str)
}
