fun main(args: Array<String>) {
   var num: Int = 30
   var num2: Long = 2982
   var num1: Double = 10.2
   var num3: Float = 10.32f
   var door: Boolean = true
   door = false
   var name: String = "Walaa Alshaikh"
   println(name)

   val trafficLight = "yellow"

   if (trafficLight == "green") {
      println("You can go!")
   } else if (trafficLight == "red") {
      println("You may stop!")
   } else {
      println("Be ready")
   }

   println("Enter your name")

   var yourName = readLine()!!.toString()
   println("your name is $yourName")

   var studentName = "walaa"
   println( "Enter your grade")
   var grade = readLine()!!.toInt()
   if (grade == 100) {
      println("Excellent")
   } else if (grade >= 90) {
      println("very good")
   }else if (grade >=80){
      println ("good")
   }else{
      println("did not pass")
   }

}