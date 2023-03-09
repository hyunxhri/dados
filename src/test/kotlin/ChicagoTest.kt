import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ChicagoTest : DescribeSpec( {
    describe("Puntuación") {
        val d6 = Dados(6)
        val juego = Chicago(d6)
        it("jugador suma puntos") {
            val jugadores = listOf(Jugador("Juan", 0))
            val tirada = 2
            juego.puntuacionObjetivo = 2
            if (juego.puntuacionObjetivo == tirada) {
                jugadores[0].puntos = jugadores[0].puntos + juego.puntuacionObjetivo
            }
            jugadores[0].puntos.shouldBe(2)
        }
    }
    describe("Recibe dado:"){
        it("Lanza excepción por recibir dados erróneos."){
            val d10 = Dados(10)
            shouldThrow<IllegalArgumentException>{
                Chicago(d10)
            }
        }
    }

})