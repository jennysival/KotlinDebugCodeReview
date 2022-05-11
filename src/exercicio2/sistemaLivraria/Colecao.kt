package src.exercicio2.sistemaLivraria

class Colecao: Livro() {
    val listaColecaoDeLivros = ArrayList<Livro>()
    var codigoColecao = 0
    var precoColecao = 0.0
    var descricaoColecao = ""
    override var estoque = 0

    fun cadastrarColecao(){
        print("Digite o código da coleção: ")
        codigoColecao = readln().toInt()

        print("Digite o preço da coleção: ")
        precoColecao = readln().toDouble()

        print("Digite a quantidade a ser estocada: ")
        estoque = readln().toInt()

        println("Digite uma breve descrição sobre a coleção: ")
        descricaoColecao = readln()

        print("Digite a quantidade de livros da coleção: ")
        val qtd = readln().toInt()

        for(i in 1..qtd){
            println("Cadastro do ${i}º livro da coleção: ")
            val novoLivro = Livro()
            novoLivro.cadastrarLivro()
            listaColecaoDeLivros.add(novoLivro)
        }

        println("---------------------------------------------")
        println("       Coleção Cadastrada com Sucesso!       ")
        println("---------------------------------------------")
    }

    override fun exibir() {
        println("---------------------------------------------")
        println("COLEÇÃO | Código: $codigoColecao")
        println("Quantidade em Estoque: $estoque")
        println("Descrição: $descricaoColecao")
        println("Preço: R$$precoColecao")
        listaColecaoDeLivros.forEachIndexed { index, livro ->
            println("Livro ${index+1}: ${livro.autor}, ${livro.titulo}, ${livro.ano}")
        }
    }
}