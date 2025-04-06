fun main() {
    val nomes = mutableListOf<String>()
    val regex = Regex("^[a-zA-ZáéíóúãõâêîôûçÁÉÍÓÚÃÕÂÊÎÔÛÇ ]+$") // Aceita letras, acentos e espaços

    println("Digite os nomes (apenas letras). Digite 'fim' para encerrar:")

    while (true) {
        print("Nome: ")
        val entrada = readLine()?.trim()

        if (entrada.equals("fim", ignoreCase = true)) {
            break
        }

        if (entrada != null && regex.matches(entrada)) {
            nomes.add(entrada)
        } else {
            println("Nome inválido. Digite apenas letras.")
        }
    }

    println("\nNomes em ordem alfabética:")
    nomes.sort()
    for (nome in nomes) {
        println(nome)
    }
}
