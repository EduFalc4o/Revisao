import java.util.Calendar

fun main() {
    val frases = listOf(
        "Acredite em você!",
        "Você é mais forte do que imagina.",
        "Nunca desista dos seus sonhos.",
        "Cada esforço vale a pena.",
        "Seja a mudança que você quer ver no mundo.",
        "O sucesso é a soma de pequenos esforços diários.",
        "Você está no caminho certo!",
        "Tudo começa com um passo.",
        "Não espere, faça acontecer.",
        "Você é capaz de tudo que quiser!",
        "Coragem para seguir em frente!",
        "A vitória é de quem persiste.",
        "Faça hoje valer a pena.",
        "Grandes conquistas exigem determinação.",
        "Nada é impossível para quem acredita.",
        "A motivação vem da ação.",
        "Você nasceu para vencer.",
        "A persistência leva ao sucesso.",
        "Um dia de cada vez, com foco.",
        "A disciplina constrói o impossível.",
        "Seja o seu maior incentivo.",
        "Desafios te tornam mais forte.",
        "Seu esforço será recompensado.",
        "Acredite: você consegue!"
    )

    val horaAtual = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

    val frase = frases[horaAtual % frases.size]
    println("Mensagem motivacional das $horaAtual horas: $frase")
}
