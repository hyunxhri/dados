import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class JugadorTest : DescribeSpec({
    describe("Comprueba que jugador sea correcto."){
        val jugador1 = Jugador("Pepe", 0)
        it("Comprueba valores:"){
            jugador1.nombre.shouldBe("Pepe")
            jugador1.puntos.shouldBe(0)
        }
    }
})