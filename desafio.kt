// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, var curso: String, var nivel: Nivel)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel:Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {for(u in usuario){inscritos.add(u)}}
   
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	val formacaoKotlin = Formacao(
        "Formação em Kotlin",
        Nivel.AVANCADO,
        listOf(
            ConteudoEducacional("Introdução ao Kotlin", 10),
            ConteudoEducacional("Programação Orientada a Objetos com Kotlin", 20)
        )
    )
    val formacaoJava = Formacao(
        "Formação em Java",
        Nivel.BASICO,
        listOf(
            ConteudoEducacional("Introdução ao Java", 20),
            ConteudoEducacional("Programação Orientada a Objetos com Java", 30)
        )
    )
  
   println(formacaoKotlin)
   println(formacaoJava)
   formacaoKotlin.matricular(Usuario("Guilherme", formacaoKotlin.nome,Nivel.AVANCADO),Usuario("Pedro",formacaoKotlin.nome, Nivel.BASICO))
   formacaoJava.matricular(Usuario("Jose", formacaoKotlin.nome, Nivel.BASICO),Usuario("maria",formacaoKotlin.nome,Nivel.INTERMEDIARIO))
   
   println("\nFormação em Kotlin:")
    for (aluno in formacaoKotlin.inscritos) {
        println("Nome: ${aluno.nome}, Curso: ${aluno.curso}, Nível: ${aluno.nivel}")
    }
   
    println("\nFormação em Java:")
    for (aluno in formacaoJava.inscritos) {
        println("Nome: ${aluno.nome}, Curso: ${aluno.curso}, Nível: ${aluno.nivel}")
    }
}