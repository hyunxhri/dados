import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeBetween

class DadosTest : DescribeSpec( {

    describe("Dados para jugar:"){
        val d6 = Dados(6)
        it("Tira un dado de 6 caras"){
            d6.tiraDado().shouldBeBetween(1,6)
        }
        it("Error por un número de caras no existente"){
            shouldThrow<IllegalArgumentException>{
                Dados(16)
            }
        }
        it("No da error creando un dado existente"){
            shouldNotThrowAny {
                Dados(6)
            }
        }
    }
})