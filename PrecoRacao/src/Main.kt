open class Racao(var preco: Double, var peso: Double, var sabor: String) {
    open fun desconto() {
        preco -= preco * 0.10
    }

    fun mostrarInfo() {
        println("Preço: R$ %.2f | Peso: %.2f kg | Sabor: %s".format(preco, peso, sabor))
    }
}

class RacaoDeGato(
    preco: Double,
    peso: Double,
    sabor: String,
    var paraCastrado: Boolean,
    var ricaEmFerro: Boolean
) : Racao(preco, peso, sabor) {

    override fun desconto() {
        preco -= if (paraCastrado) preco * 0.15 else preco * 0.20
    }
}

class RacaoDeCachorro(
    preco: Double,
    peso: Double,
    sabor: String,
    var fortalecimentoDePelos: Boolean,
    var pedacosComCarne: Boolean
) : Racao(preco, peso, sabor) {

    override fun desconto() {
        preco -= if (pedacosComCarne) preco * 0.05 else preco * 0.25
    }
}

fun main() {
    val racaoGato = RacaoDeGato(80.0, 2.0, "Salmão", paraCastrado = true, ricaEmFerro = true)
    val racaoCachorro = RacaoDeCachorro(120.0, 5.0, "Carne", fortalecimentoDePelos = true, pedacosComCarne = false)

    println("Ração de Gato antes do desconto:")
    racaoGato.mostrarInfo()
    racaoGato.desconto()
    println("Ração de Gato após o desconto:")
    racaoGato.mostrarInfo()

    println("\nRação de Cachorro antes do desconto:")
    racaoCachorro.mostrarInfo()
    racaoCachorro.desconto()
    println("Ração de Cachorro após o desconto:")
    racaoCachorro.mostrarInfo()
}
