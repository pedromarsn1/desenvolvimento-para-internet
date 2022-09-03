import kotlin.math.absoluteValue

fun main() {
    var a = 6.0
    var b = 4.0
    var c = 2.1

    if((b-c).absoluteValue < a && a < (b+c)){
        var perimetro =  a + b + c
        println("Perímetro: " + perimetro)
    }else if((a-c).absoluteValue < b && b < (a+c)){
        var perimetro =  a + b + c
        println("Perímetro: " + perimetro)
    }else if((a-b).absoluteValue < c && c < (a+b)){
        var perimetro =  a + b + c
        println("Perímetro: " + perimetro)
    }else{
        var areaTrapezio = ((a + b) * c)/2
        println("Area: " + areaTrapezio)
    }
}