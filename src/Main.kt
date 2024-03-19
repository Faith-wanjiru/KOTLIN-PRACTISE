//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* (QUESTION 1)
/*fun main() {
  var d = 20
  var e = 10
  println(d+e)
  println(d-e)
  println(d*e)
  println(d/e)
  println (d%e)
  println(20%9)
}*/
/* (QUESTION 2)
/*fun main(){
  var width = 10
  var length = 20
  var area = width * length
  println(area)
}*/
/* (QUESTION 3) You are creating an app to capture student records. Some of the data you will
capture includes full name, age, phone number, weight in kg and citizen. For the
citizen field you will track whether a student is a Kenyan or not.
Create variables and assign them some values for each of these fields.

fun main(){
  var fullName ="Faith Wanyoike"
  var age =22
  var phoneNumber ="0111671833"
  var weight = 60
  var citizen = "Kenyan"
  if (citizen=="Kenyan"){
    println("Kenyan")}
  else{println("non-Kenyan")
  }*/

/* (QUESTION 4)Write a Kotlin function that changes the value of Kibaki to ruto in this sentence
“Kibaki was the second president of Kenya”*/

   fun main(){
   println(sentence("Kibaki was the second president of Kenya")
 }
 fun sentence(word:string):string{
 sentence("Kibaki was the second president of Kenya")
 return sentence(word.replace $"Kibaki","ruto")
 }

 /*(QUESTION 5)Write a Kotlin function named isEven that takes an integer as a parameter and returns a Boolean indicating whether the number is even or odd.
 fun isEven(num:Int):Boolean{
var number = num % 2
If(number==0){
println(true)
}
else{
println(false)
}
}

  (QUESTION 6)Given a string "akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string (2 points)
fun main(){
nametext(String:"akirachix")
}

fun nametxt(name:String):String{
println($name[0] $name[3] $name[4]
}

(QUESTION7)Write a function that takes in a String and returns its length (2 points)
fun main(){
wordlength(String:"Hello World")
}
fun wordLength(word:String):String{
var lengthofword = word.length
println(lengthofword)
return lengthofword
}