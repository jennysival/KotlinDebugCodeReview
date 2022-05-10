import src.compras.Estoque
import src.compras.Menu

fun main() {
    println("Boas vindas ao Seu Estoque em dia!")
    val estoque: Estoque = Estoque()
    Menu().menuPrincipal(estoque)
}

