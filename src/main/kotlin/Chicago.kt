class Chicago(private val dados: Dados) {
    var puntuacionObjetivo = 2
    init{
        if (dados.caras != 6) {
            throw IllegalArgumentException("El dado debe tener 6 caras")
        }
    }

    fun jugar(listaJugadores : List<Jugador>) {
        do {
            for (jugador in listaJugadores) {
                val tirada = dados.tiraDado() + dados.tiraDado()
                if (tirada == puntuacionObjetivo) {
                    jugador.puntos += puntuacionObjetivo
                    println("El jugador ${jugador.nombre} ha sumado $puntuacionObjetivo puntos. ¡Ahora tiene ${jugador.puntos}!")
                }
            }
            puntuacionObjetivo += 1
        } while (puntuacionObjetivo in 2..12)
        val ganador = esGanador(listaJugadores)
        println("ENHORABUENA, EL GANADOR ES ${ganador.nombre.uppercase()} CON ${ganador.puntos} PUNTOS.")
    }
}

    private fun esGanador(listaJugadores : List<Jugador>) : Jugador {
        lateinit var ganador : Jugador
        var maximaPuntuacion = 0
        for(jugador in listaJugadores){
            if(jugador.puntos > maximaPuntuacion){
                maximaPuntuacion = jugador.puntos
                ganador = jugador
            }
        }
        return ganador
    }
