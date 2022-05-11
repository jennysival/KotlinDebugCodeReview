package src.exercicio2.sistemaLivraria

import kotlin.system.exitProcess

class Menu {

    private val novoEstoque = EstoqueLivraria()

    init {
        novoEstoque.livrosEmEstoque()
        novoEstoque.colecoesEmEstoque()
    }

    fun menuPrincipal(){

        try {
            println("---------------------------------------------")
            println("O que deseja fazer?")
            println("[1] Cadastrar Livro")
            println("[2] Cadastrar Coleção")
            println("[3] Consultar por código")
            println("[4] Efetuar Venda")
            println("[5] Sair")
            print("Digite o nº da opção escolhida: ")
            when(readln().toInt()){
                1 -> {
                    novoEstoque.adicionarLivro()
                    menuPrincipal()
                }
                2 -> {
                    novoEstoque.adicionarColecao()
                    menuPrincipal()
                }
                3 -> {
                    novoEstoque.consultarPorCodigo()
                    menuPrincipal()
                }
                4 -> {
                    novoEstoque.efetuarVenda()
                    menuPrincipal()
                }
                5 -> exitProcess(0)
                else -> {
                    println("---------------------------------------------")
                    println("            * Comando Inválido *             ")
                    menuPrincipal()
                }
            }
        }catch (ex: IllegalArgumentException){
            println("---------------------------------------------")
            println("            * Comando Inválido *             ")
            menuPrincipal()
        }
    }

}