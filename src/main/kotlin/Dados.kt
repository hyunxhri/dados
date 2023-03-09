import java.lang.IllegalArgumentException

class Dados(val caras: Int) {
    init{
        val dadosPosibles = listOf(4,6,8,10,12,20)
        if(caras !in dadosPosibles){throw IllegalArgumentException("ERROR: Ese dado no está contemplado.")}
    }

    fun tiraDado(): Int {
        return (1..caras).random()
    }

}
