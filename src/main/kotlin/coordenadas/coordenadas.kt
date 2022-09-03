fun main(){
    var y = 0.1
    var x = 0.1

    if(y > 0 && x >0){
        println("Q1")
    }else if(y < 0 && x > 0){
      println("Q4")
    }else if(y < 0 && x < 0){
        println("Q3")
    }else if(y > 0 && x < 0){
        println("Q2")
    }else if ( y == 0.0 && x == 0.0 ){
        println("Origem")
    }
}