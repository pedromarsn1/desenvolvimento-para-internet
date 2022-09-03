fun main() {
    var salario = 2000.00f

    if( salario > 0.00 && salario <= 400.00){
        var porcentagem = salario * 0.15
        var ajuste = salario + porcentagem
        println("Novo salário $ajuste")
        var reajuste = ajuste - salario
        println("Reajuste ganho: $reajuste")
        println("Em percentual: 15%")
    }else if( salario >= 400.01 && salario <= 800.00){
        var porcentagem = salario * 0.12
        var ajuste = salario + porcentagem
        println("Novo salário $ajuste")
        var reajuste = ajuste - salario
        println("Reajuste ganho: $reajuste")
        println("Em percentual: 12%")
    }else if( salario >= 800.01 && salario <= 1200.00){
        var porcentagem = salario * 0.10
        var ajuste = salario + porcentagem
        println("Novo salário $ajuste")
        var reajuste = ajuste - salario
        println("Reajuste ganho: $reajuste")
        println("Em percentual: 10%")
    }else if( salario >= 1200.01 && salario <= 2000.00){
        var porcentagem = salario * 0.07
        var ajuste = salario + porcentagem
        println("Novo salário $ajuste")
        var reajuste = ajuste - salario
        println("Reajuste ganho: $reajuste")
        println("Em percentual: 7%")
    }else{
        var porcentagem = salario * 0.04
        var ajuste = salario + porcentagem
        println("Novo salário $ajuste")
        var reajuste = ajuste - salario
        println("Reajuste ganho: $reajuste")
        println("Em percentual: 4%")
    }
}