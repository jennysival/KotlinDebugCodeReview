package src.exercicio1.compras

import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(estoque: Estoque) {

        try {
            println("----------------------------------------------")
            println("O que deseja fazer?")
            println("[1] Cadastrar novo item")
            println("[2] Ver lista de itens disponíveis para compra")
            println("[3] Dar baixa em um item")
            println("[4] Sair do programa")
            print("Digite o nº da opção escolhida: ")
            when (readln().toInt()) {
                1 -> {
                    estoque.registrarItem()
                    menuPrincipal(estoque)
                }
                2 -> {
                    estoque.listarItens()
                    menuPrincipal(estoque)
                }
                3 -> {
                    estoque.darBaixaItem()
                    menuPrincipal(estoque)
                }
                4 -> exitProcess(10)
                else -> {
                    println("----------------------------------------------")
                    println("      * Opção inválida, tente novamente *     ")
                    menuPrincipal(estoque)
                }
            }
        }catch (ex: IllegalArgumentException){
            println("----------------------------------------------")
            println("      * Opção inválida, tente novamente *     ")
            menuPrincipal(estoque)
        }


    }
}