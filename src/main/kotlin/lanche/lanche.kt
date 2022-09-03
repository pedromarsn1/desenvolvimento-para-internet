package lanche

fun main(){
    var codigo = 3
    var quantidade = 2
    var preco = 5.0

    pedido(codigo,quantidade,preco)

}

fun pedido(codigo : Int, quantidade : Int, preco : Double ) {

    if(codigo === 1){
        var total = quantidade * (preco)
       println("Total: R$ ${total}")
    }else if(codigo === 2){
        var total = quantidade * (preco)
        println("Total: R$ ${total}")
    }else if(codigo === 3){
        var total = quantidade * (preco)
        println("Total: R$ ${total}")
    }else if(codigo === 4){
        var total = quantidade * (preco)
        println("Total: R$ ${total}")
    }else if(codigo === 5){
        var total = quantidade * (preco)
        println("Total: R$ ${total}")
    }else{
        println("Número inválido! Por favor tente novamente!")
    }
}