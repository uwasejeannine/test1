fun main() {
 introduction("Jeannine",19)
    machine(7)
    machine(30)
    machine(50)
    machine(2)
    machine(12)
    println(name(arrayOf("Jeannine","Ines","Gentille","Giselle")))
    numbers(12,13)
    var human=Human("Jeannine",19,45.897878)
    println(human.age)
}
fun introduction(name:String,age:Int){
    println("My is $name $age years old")
}

fun machine(age:Int){
    if (age<6){
        println("Take a glass of milk")
    }
    else if(age>6 && age<=15){
        println("Take a bottle of fanta orange.")
    }
    else{
        println("Take a bottle of coca cola")
    }
}
fun name(names:Array<String>):Int {
    var counter = 0
    for (names in names) {
        if (names.length > 5) {
            counter++
        }
    }
    return counter
}
fun numbers(number:Int,number2: Int){
    var num1=12
    var num2=13
    var divide=num1/num2
    println(divide)
    var module=num1%num2
    println(module)
    var mult=num1*num2
    println(mult)
}

class Human(var name:String,var age:Int, var waight:Double){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kg")
    }

    fun speak(speech: String){
        println("I can't eat mangoes")

    }
     fun birthday(age:Int){
        age+=1
    }
fun comparison(num: Int,age:Int):Int{
    va num3=12

}}




