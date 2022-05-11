package src.exercicio2.sistemaLivraria

class EstoqueLivraria {
    private val listaDeLivrosAndColecoes = mutableMapOf<Int, Livro>()

    fun livrosEmEstoque(){
        val livro1 = Livro()
        livro1.codigo = 123456789
        livro1.titulo = "Alice no País das Maravilhas"
        livro1.autor = "Lewis Carroll"
        livro1.ano = 1820
        livro1.preco = 45.50
        livro1.estoque = 50
        listaDeLivrosAndColecoes[livro1.codigo] = livro1

        val livro2 = Livro()
        livro2.codigo = 987456321
        livro2.titulo = "A Pequena Sereia"
        livro2.autor = "Hans Christian Andersen"
        livro2.ano = 1837
        livro2.preco = 20.90
        livro2.estoque = 10
        listaDeLivrosAndColecoes[livro2.codigo] = livro2

        val livro3 = Livro()
        livro3.codigo = 456123987
        livro3.titulo = "Quando as Sereias Choram"
        livro3.autor = "Mirella Ferraz"
        livro3.ano = 2014
        livro3.preco = 32.60
        livro3.estoque = 3
        listaDeLivrosAndColecoes[livro3.codigo] = livro3
    }

    fun colecoesEmEstoque(){
        val colecao1 = Colecao()
        colecao1.codigoColecao = 55668811
        colecao1.descricaoColecao = "Trilogia Literária de LOST"
        colecao1.precoColecao = 252.0

        val livro1 = Livro()
        livro1.codigo = 99887744
        livro1.titulo = "Risco de Extinção"
        livro1.autor = "Cathy Hapka"
        livro1.ano = 2005
        livro1.preco = 84.0
        livro1.estoque = 5
        colecao1.listaColecaoDeLivros.add(livro1)

        val livro2 = Livro()
        livro2.codigo = 99887744
        livro2.titulo = "Identidade Secreta"
        livro2.autor = "Cathy Hapka"
        livro2.ano = 2005
        livro2.preco = 84.0
        livro2.estoque = 5
        colecao1.listaColecaoDeLivros.add(livro2)

        val livro3 = Livro()
        livro3.codigo = 99887744
        livro3.titulo = "Sinais de Vida"
        livro3.autor = "Frank Thompson"
        livro3.ano = 2006
        livro3.preco = 84.0
        livro3.estoque = 5
        colecao1.listaColecaoDeLivros.add(livro3)

        listaDeLivrosAndColecoes[colecao1.codigoColecao] = colecao1
    }

    fun adicionarLivro(){
        println("---------------------------------------------")
        val novoLivro = Livro()
        novoLivro.inserirCodigo()
        novoLivro.cadastrarLivro()
        novoLivro.inserirPreco()
        novoLivro.inserirEstoque()
        listaDeLivrosAndColecoes[novoLivro.codigo] = novoLivro
    }

    fun adicionarColecao(){
        println("---------------------------------------------")
        val novaColecao = Colecao()
        novaColecao.cadastrarColecao()
        listaDeLivrosAndColecoes[novaColecao.codigoColecao] = novaColecao
    }

    fun consultarPorCodigo(){
        println("---------------------------------------------")
        print("Digite o código que deseja consultar: ")
        val codigoConsulta = readln().toInt()

        if(codigoConsulta in listaDeLivrosAndColecoes){
            exibirEstoque(codigoConsulta)
        }
        else{
            println("---------------------------------------------")
            println("          * Livro não encontrado *           ")
        }

    }

    fun efetuarVenda(){
        println("---------------------------------------------")
        print("Digite o código do produto: ")
        val codigoVenda = readln().toInt()

        if(codigoVenda in listaDeLivrosAndColecoes){
            println("---------------------------------------------")
            println("Confira as informações do código selecionado:")
            listaDeLivrosAndColecoes[codigoVenda]?.exibir()
            println("---------------------------------------------")
            print("Digite a quantidade da compra: ")
            val qtdCompra = readln().toInt()
            if(qtdCompra > listaDeLivrosAndColecoes[codigoVenda]!!.estoque){
                println("---------------------------------------------")
                println("          * Estoque insuficiente *           ")
            }
            else{
                listaDeLivrosAndColecoes[codigoVenda]!!.estoque -= qtdCompra
            }
        }
        else{
            println("---------------------------------------------")
            println("          * Livro não encontrado *           ")
        }
    }

    private fun exibirEstoque(codigo: Int){
        listaDeLivrosAndColecoes[codigo]?.exibir()
        }
    }
