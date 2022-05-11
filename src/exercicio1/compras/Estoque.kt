package src.exercicio1.compras

class Estoque {
    private val listaItem: ArrayList<Item> = ArrayList()

    fun registrarItem() {
            val novoItem = Item()
            novoItem.cadastrarCodigo()
            novoItem.cadastrarNome()
            novoItem.cadastrarPreco()

            verificarItemRepetido(novoItem.codigo, novoItem)
    }

    private fun adicionarItemNaLista(item: Item){
        listaItem.add(item)
        println("----------------------------------------------")
        println("          Item registrado com sucesso         ")
    }

    private fun verificarItemRepetido(codigo: Int, item: Item) {
        var verificarCodigo = false

        for(i: Int in listaItem.indices){
            when(codigo){
                listaItem[i].codigo -> {
                    verificarCodigo = true
                }
            }
        }

        if(verificarCodigo){
            println("----------------------------------------------")
            println("   Este produto já está cadastrado na lista   ")
            println("        Cadastre apenas produtos únicos       ")
            registrarItem()
        }
        else{
            adicionarItemNaLista(item)
        }
    }

    fun listarItens() {
        if (listaItem.isEmpty()) {
            println("----------------------------------------------")
            println("* Não temos nenhum item cadastrado no momento *")
        } else {
            println("----------------------------------------------")
            println("Atualmente temos os seguintes itens: ")
            listaItem.forEach {
                println(it.exibirItem())
            }
        }
    }

    fun darBaixaItem() {
        try {
            println("----------------------------------------------")
            print("Qual o código do item a dar baixa? ")
            val codigoItemADarBaixa = readln().toInt()
            var verificarCodigo = false

            for(i: Int in listaItem.indices){
                when(codigoItemADarBaixa){
                    listaItem[i].codigo -> {
                        verificarCodigo = true
                        listaItem.removeAt(i)
                        println("----------------------------------------------")
                        println("           Item removido com sucesso          ")
                        break
                    }
                }
            }

            if(!verificarCodigo){
                println("----------------------------------------------")
                println("Código não encontrado na lista. Tente novamente")
                darBaixaItem()
            }
        }catch (ex: IllegalArgumentException){
            println("----------------------------------------------")
            println("        * Inválido! Tente novamente *         ")
            darBaixaItem()
        }


    }
}