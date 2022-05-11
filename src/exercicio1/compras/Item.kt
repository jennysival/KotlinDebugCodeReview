package src.exercicio1.compras

class Item {

    var codigo: Int = 0
    set(value) {
        if (value >= 0){
            field = value
        }
        else{
            println("----------------------------------------------")
            println("       * Código não pode ser negativo *       ")
            cadastrarCodigo()
        }
    }

    private var nome: String = "Digite seu nome corretamente"
    set(value) {
        if (value == "" || value == " "){
            println("----------------------------------------------")
            println("  * Não é possível inserir nome em branco *   ")
            println("----------------------------------------------")
            cadastrarNome()
        }
        else{
            field = value
        }
    }

    private var preco: Double = 0.0
        set(value) {
            if (value >= 0.0){
                field = value
            }
            else{
                println("----------------------------------------------")
                println("        * Preço não pode ser negativo *       ")
                println("----------------------------------------------")
                cadastrarPreco()
            }
        }

    fun cadastrarCodigo(): Int{
        try {
            println("----------------------------------------------")
            print("Digite o código do produto: ")
            codigo = readln().toInt()
        }catch (ex: IllegalArgumentException){
            println("----------------------------------------------")
            println("        * Inválido! Tente novamente *         ")
            cadastrarCodigo()
        }

        return codigo

    }

    fun cadastrarNome(){
        print("Digite o nome do produto: ")
        nome = readln()
    }

    fun cadastrarPreco(){
        try {
            print("Digite o preço do produto: ")
            preco = readln().toDouble()
        }catch (ex: IllegalArgumentException){
            println("----------------------------------------------")
            println("        * Inválido! Tente novamente *         ")
            println("----------------------------------------------")
            cadastrarPreco()
        }

    }

    fun exibirItem(): String {
        return "código: $codigo | nome: $nome | preço(R$) $preco"
    }
}