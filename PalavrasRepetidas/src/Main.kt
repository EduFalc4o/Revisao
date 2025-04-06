fun main() {
    print("Digite um texto: ")
    val texto = readLine()?.lowercase() ?: ""

    print("Digite a palavra que deseja contar: ")
    val palavra = readLine()?.lowercase() ?: ""

    var contador = 0
    var indice = 0

    while (indice <= texto.length - palavra.length) {
        if (texto.substring(indice, indice + palavra.length) == palavra) {
            contador++
            indice += palavra.length
        } else {
            indice++
        }
    }

    println("A palavra \"$palavra\" aparece $contador vezes no texto.")
}
