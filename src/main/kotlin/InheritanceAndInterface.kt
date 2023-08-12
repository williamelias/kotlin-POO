
package InheritanceAndInterface

// Example of Hinheritance
open class Animal{
    constructor(name:String, sex:String, age:Int, weight:Float, color:String)
    open fun makeSound(){
        println("making sound")
    }
}

data class Cat(val name: String,val sex: String,val age: Int,val weight: Float,val color: String):Animal(name,sex,age, weight,color){
    override fun makeSound() {
        println("meauuu")
    }
}

//Example of Interface

interface FlyingTransport{
    fun fly(origin:String,destination:String,passengers:Int)
}

class Helicopter :FlyingTransport{
    override fun fly(origin:String,destination:String,passengers:Int){
        println("flying inside Helicopter class")
    }
}

class Airplane :FlyingTransport{
    override fun fly(origin:String,destination:String,passengers:Int){
        println("flying inside Airplane class")
    }
}

class AirPort(vehicle:FlyingTransport){
    val vehicle = vehicle
}

fun makeInheritanceAndInterface(){
    val firstAnimal:Animal = Animal(
        name = "onça", sex = "male",age= 10, weight = 10.toFloat(), color = "rouge"
    )
    firstAnimal.makeSound()

    //cat inheritance from Animal
    val cat = Cat(
        name = "zara",
        sex = "female",
        age= 2,
        weight = 4.toFloat(),
        color = "black"
    )
    cat.makeSound()

    // example of use of interface overriding fly method
    val heli1 = Helicopter()
    val aiport1 = AirPort(vehicle = heli1)
    aiport1.vehicle.fly(origin = "sao-paulo",destination="brasilia",passengers = 10)

}