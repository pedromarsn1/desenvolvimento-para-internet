fun main() {
    var vertebras = "invertebrado"
    var tipo = "anelideo"
    var alimentacao = "onivoro"

    if( vertebras == "vertebrado" && tipo == "ave" && alimentacao == "carnivoro"){
        println("águia")
    }else if( vertebras == "vertebrado" && tipo == "ave" && alimentacao == "onivoro"){
        println("pomba")
    }else if( vertebras == "vertebrado" && tipo == "mamifero" && alimentacao == "onivoro"){
        println("homem")
    }else if( vertebras == "vertebrado" && tipo == "mamifero" && alimentacao == "herbivoro"){
        println("vaca")
    }else if( vertebras == "invertebrado" && tipo == "inseto" && alimentacao == "hematofago"){
        println("pulga")
    }else if( vertebras == "invertebrado" && tipo == "inseto" && alimentacao == "herbivoro"){
        println("lagarta")
    }else if( vertebras == "invertebrado" && tipo == "anelideo" && alimentacao == "hematofago"){
        println("sanguessuga")
    }else if( vertebras == "invertebrado" && tipo == "anelideo" && alimentacao == "onivoro"){
        println("minhoca")
    }else{
        println("Animal inválido!")
    }
}