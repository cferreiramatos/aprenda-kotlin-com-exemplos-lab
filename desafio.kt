// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO } // antes: { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String) // transformado em data class.

data class ConteudoEducacional(val nome: String) // removida a propriedade 'duracao'.

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios.toList())
    }
}

fun main() {
    // Criando alguns objetos e simulando cenários de teste.
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução à Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")

    val formacaoKotlin = Formacao("Formação em Kotlin", listOf(conteudo1, conteudo2))

    formacaoKotlin.matricular(usuario1, usuario2)

    println("Inscritos na formação ${formacaoKotlin.nome}:")
    formacaoKotlin.inscritos.forEach { println(it.nome) }
}