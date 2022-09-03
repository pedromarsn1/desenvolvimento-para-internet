fun main(){
    var nota1 = 2.0
    var nota2 = 4.0
    var nota3 = 7.5
    var nota4 = 8.0
    var notaFinal = 6.4

    val peso1 = 1
    val peso2 = 2
    val peso3 = 3
    val peso4 = 4

    var notaComPesos = (nota1 * peso2) + (nota2 * peso3) + (nota3 * peso4) + (nota4 * peso1)
    var numerador = peso1 + peso2+ peso3 + peso4
    var media = notaComPesos/numerador
    println("Media: $media")

    if(media >= 7.0){
        println("Aluno aprovado!")
    }else if(media < 5.0){
        println("Aluno reprovado!")
    }else if(media >= 5.0 && media <= 6.9){
        println("Aluno em exame!")
        println("Nota do exame: $notaFinal")
        var mediaFinal = (media + notaFinal)/2
        if(mediaFinal >= 5.0){
            println("Aluno aprovado!")
            println("Media final: $mediaFinal")
        }else{
            println("Aluno reprovado!")
            println("Media final: $mediaFinal")
        }

    }


}