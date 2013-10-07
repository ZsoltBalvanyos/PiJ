String one=textGuess("First guy:")
String two=textGuess("Second guy:")

String round = one+two
println round




String textGuess(String prompt){
print prompt
return System.console().readLine()
}