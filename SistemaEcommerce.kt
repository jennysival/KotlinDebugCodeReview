import src.exercicio1.compras.Estoque
import src.exercicio1.compras.Menu

fun main() {
    println("Boas vindas ao Seu Estoque em dia!")
    val estoque: Estoque = Estoque()
    Menu().menuPrincipal(estoque)
}

