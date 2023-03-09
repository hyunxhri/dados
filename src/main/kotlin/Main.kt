fun main() {
    val d6 = Dados(6)
    val juego = Chicago(d6)
    val jugadores = listOf(Jugador("Joka", 0), Jugador("Erik", 0), Jugador("Carlos", 0), Jugador("Sara", 0))
    juego.jugar(jugadores)
}

/*
* GRADLE > DOKAHTML > CLICKAR Y EN BUILD CARPETA HTML MOVER A SRC.
* */