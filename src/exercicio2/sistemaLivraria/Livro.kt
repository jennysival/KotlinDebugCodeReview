package src.exercicio2.sistemaLivraria

open class Livro {

    var codigo = 0
    set(value) {
        if(value >= 0){
            field = value
        }
        else{
            println("---------------------------------------------")
            println("      * Código não pode ser negativo *       ")
            println("---------------------------------------------")
            inserirCodigo()
        }
    }

    var titulo = "titulo"
    set(value) {
        if(value == "" || value == " "){
            println("---------------------------------------------")
            println("       * Título não pode estar vazio *       ")
            println("---------------------------------------------")
            inserirTitulo()
        }
        else{
            field = value
        }
    }

    var autor = "autor"
        set(value) {
            if(value == "" || value == " "){
                println("---------------------------------------------")
                println("      * Autoria não pode estar vazia *       ")
                println("---------------------------------------------")
                inserirAutor()
            }
            else{
                field = value
            }
        }

    var ano = 0
        set(value) {
            if(value >= 0){
                field = value
            }
            else{
                println("---------------------------------------------")
                println(" * Ano de Lançamento não pode ser negativo * ")
                println("---------------------------------------------")
                inserirAno()
            }
        }

    open var estoque = 0
        set(value) {
            if(value > 0){
                field = value
            }
            else{
                println("---------------------------------------------")
                println("  * Estoque não pode ser negativo ou vazio * ")
                println("---------------------------------------------")
                inserirEstoque()
            }
        }

    var preco = 0.0
        set(value) {
            if(value > 0.0){
                field = value
            }
            else{
                println("---------------------------------------------")
                println("   * Preço não pode ser negativo ou zero *   ")
                println("---------------------------------------------")
                inserirPreco()
            }
        }

    fun inserirCodigo(){
        try {
            print("Digite o código: ")
            codigo = readln().toInt()
        }catch (ex: IllegalArgumentException){
            println("---------------------------------------------")
            println("             * Código Inválido *             ")
            println("  Digite até 9 números sem ponto ou vírgula  ")
            println("---------------------------------------------")
            inserirCodigo()
        }
    }

    fun cadastrarLivro(){
        inserirTitulo()
        inserirAutor()
        inserirAno()
    }

    private fun inserirTitulo(){
        print("Digite o título: ")
        titulo = readln()
    }

    private fun inserirAutor(){
        print("Digite a autoria: ")
        autor = readln()
    }

    private fun inserirAno(){
        try {
            print("Digite o ano de lançamento: ")
            ano = readln().toInt()
        }catch (ex: IllegalArgumentException){
            println("---------------------------------------------")
            println("              * Ano Inválido *               ")
            println("---------------------------------------------")
            inserirAno()
        }

    }

    fun inserirPreco(){
        try {
            print("Digite o preço: ")
            preco = readln().toDouble()
        }catch (ex: IllegalArgumentException){
            println("---------------------------------------------")
            println("             * Preço Inválido *              ")
            println("---------------------------------------------")
            inserirPreco()
        }

    }

    fun inserirEstoque(){
        try {
            print("Digite a quantidade a ser estocada: ")
            estoque = readln().toInt()

            println("---------------------------------------------")
            println("        Livro cadastrado com sucesso!        ")
        }catch (ex: IllegalArgumentException){
            println("---------------------------------------------")
            println("          * Quantidade Inválida *            ")
            println("        Digite apenas números inteiros       ")
            println("---------------------------------------------")
            inserirEstoque()
        }

    }

    open fun exibir(){
        println("---------------------------------------------")
        println("LIVRO | Código: $codigo")
        println("Quantidade em Estoque: $estoque")
        println("$autor, $titulo, $ano")
        println("Preço: R$$preco")

    }
}