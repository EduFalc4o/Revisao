import kotlin.random.Random

fun main() {
    var opcao: String?

    do {
        println("\n===== MENU PRINCIPAL =====")
        println("a. Somar vários números reais")
        println("b. Gerar número aleatório entre X e Y")
        println("c. Ler números inteiros e separar positivos e negativos")
        println("d. Sair")
        print("Escolha uma opção: ")
        opcao = readLine()?.lowercase()

        when (opcao) {
            "a" -> somarNumeros()
            "b" -> gerarNumeroAleatorio()
            "c" -> separarNumeros()
            "d" -> println("Encerrando o programa...")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != "d")
}

fun somarNumeros() {
    print("Quantos números você deseja somar? ")
    val qtd = readLine()?.toIntOrNull()

    if (qtd == null || qtd <= 0) {
        println("Quantidade inválida.")
        return
    }

    var soma = 0.0
    for (i in 1..qtd) {
        print("Digite o número $i: ")
        val num = readLine()?.toDoubleOrNull()
        if (num != null) {
            soma += num
        } else {
            println("Entrada inválida, pulando este número.")
        }
    }

    println("A soma total é: $soma")
}

fun gerarNumeroAleatorio() {
    print("Digite o valor de X (início do intervalo): ")
    val x = readLine()?.toIntOrNull()
    print("Digite o valor de Y (fim do intervalo): ")
    val y = readLine()?.toIntOrNull()

    if (x == null || y == null || x > y) {
        println("Intervalo inválido.")
        return
    }

    val numeroAleatorio = Random.nextInt(x, y + 1)
    println("Número aleatório gerado entre $x e $y: $numeroAleatorio")
}

fun separarNumeros() {
    val positivos = mutableListOf<Int>()
    val negativos = mutableListOf<Int>()

    println("Digite números inteiros (0 para encerrar):")
    while (true) {
        val entrada = readLine()?.toIntOrNull()
        if (entrada == null) {
            println("Entrada inválida.")
            continue
        }
        if (entrada == 0) break

        if (entrada > 0) {
            positivos.add(entrada)
        } else {
            negativos.add(entrada)
        }
    }

    positivos.sort()
    negativos.sort()

    println("Números positivos ordenados: $positivos")
    println("Números negativos ordenados: $negativos")
}
