fun main() {
    var x = 999

    for(i in 1..x){
        if( x >= 1 && x <= 1000){
            var resto = i%2
            if(resto != 0){
                println(i)
            }
    }else{
        println("Impossível de ler seu número!")
        }
}
}