class Notas {
    private val listaNotas = mutableListOf<Double>()

    fun adicionarNota(nota: Double) {
        if (nota in 0.0..10.0) {
            listaNotas.add(nota)
        }
    }

    fun calcularMedia(): Double {
        return if (listaNotas.isNotEmpty()) listaNotas.sum() / listaNotas.size else 0.0
    }

    override fun toString(): String {
        return "Média: %.2f".format(calcularMedia())
    }
}

class Restaurante(
    val nome: String,
    val endereco: String,
    val especialidade: String,
    val nota: Notas
) {
    fun mostrarInfo() {
        println("Restaurante: $nome")
        println("Endereço: $endereco")
        println("Especialidade: $especialidade")
        println("Nota: ${nota}")
    }
}

class Cliente(val nome: String) {
    fun avaliar(restaurante: Restaurante, nota: Double) {
        restaurante.nota.adicionarNota(nota)
        println("$nome avaliou o restaurante ${restaurante.nome} com nota $nota")
    }
}

fun main() {
    val notasDoRestaurante = Notas()
    val restaurante = Restaurante("Sabor Caseiro", "Rua das Flores, 123", "Comida Brasileira", notasDoRestaurante)

    val cliente1 = Cliente("Maria")
    val cliente2 = Cliente("João")
    val cliente3 = Cliente("Ana")

    cliente1.avaliar(restaurante, 9.0)
    cliente2.avaliar(restaurante, 8.5)
    cliente3.avaliar(restaurante, 10.0)

    println("\nInformações do Restaurante:")
    restaurante.mostrarInfo()
}
