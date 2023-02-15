import javax.lang.model.element.Name

fun main() {
    println(schools())
    println(decription("Bridgit" ,22))
    println(length("character"))
    statement("Bridgit")

}
fun schools(){
    var school = "akirachix"
    println(school[0])
    println(school[2])
    println(school[3])

}
fun decription(name: String,age:Int):String{
    return "Hi my name is $name and i am $age years old"


}
fun length(name: String):Int{
    return name.length

}
fun statement(name: String){
    var name = "Joy"
    if(name == "Bridgit"){
        println("Thats me!")}
    else if(name != "Bridgit")
        println("I dont know who that is")


}



