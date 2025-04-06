import kotlin.random.Random

fun main() {
    val palavras = listOf("kotlin", "programacao", "desenvolvedor", "android", "tecnologia")
    val palavraSecreta = palavras.random()
    val letrasCorretas = mutableSetOf<Char>()
    val letrasErradas = mutableSetOf<Char>()
    val tentativasMax = 6

    println("🎮 Bem-vindo ao Jogo da Forca!")

    while (true) {
        mostrarPalavra(palavraSecreta, letrasCorretas)
        println("Letras erradas: ${letrasErradas.joinToString(", ")}")
        println("Tentativas restantes: ${tentativasMax - letrasErradas.size}")
        print("Digite uma letra: ")

        val entrada = readLine()?.lowercase()?.trim()
        if (entrada.isNullOrBlank() || entrada.length != 1 || !entrada[0].isLetter()) {
            println("Entrada inválida. Digite apenas uma letra.\n")
            continue
        }

        val letra = entrada[0]

        if (letra in letrasCorretas || letra in letrasErradas) {
            println("Você já tentou essa letra.\n")
            continue
        }

        if (letra in palavraSecreta) {
            letrasCorretas.add(letra)
            println("✅ Letra correta!\n")
        } else {
            letrasErradas.add(letra)
            println("❌ Letra errada!\n")
        }

        if (palavraSecreta.all { it in letrasCorretas }) {
            println("🎉 Parabéns! Você venceu! A palavra era: $palavraSecreta")
            break
        }

        if (letrasErradas.size >= tentativasMax) {
            println("💀 Você perdeu! A palavra era: $palavraSecreta")
            break
        }
    }
}

fun mostrarPalavra(palavra: String, letrasCorretas: Set<Char>) {
    for (letra in palavra) {
        if (letra in letrasCorretas) {
            print("$letra ")
        } else {
            print("_ ")
        }
    }
    println("\n")
}
