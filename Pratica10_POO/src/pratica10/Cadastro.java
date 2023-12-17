package pratica10;

/** Classe que representa uma pessoa */
class Pessoa { 
    private String nome;/** Atributo privado que armazena o nome da pessoa */

    public void setNome(String nome) {   /**Método para definir o nome da pessoa * @param nome O nome da pessoa*/
        this.nome = nome;
    }

    public String getNome() { /**Método para obter o nome da pessoa * @return O nome da pessoa*/
        return nome;
    }
}

/** Classe que representa uma pessoa física, estendendo a classe Pessoa */
class PessoaFisica extends Pessoa {
    private String CPF; /** Atributo privado que armazena o CPF da pessoa física */

    public void setCPF(String CPF) { /**Método para definir o CPF da pessoa física * @param CPF O CPF da pessoa física*/

        this.CPF = CPF;
    }

    public String getCPF() { /**Método para obter o CPF da pessoa física * @return O CPF da pessoa física*/
        return CPF;
    }
}

/** Classe que representa uma pessoa jurídica, estendendo a classe Pessoa */
class PessoaJuridica extends Pessoa {
    private String CNPJ; /** Atributo privado que armazena o CNPJ da pessoa jurídica */

    /**Método para definir o CNPJ da pessoa jurídica * @param CNPJ O CNPJ da pessoa jurídica*/
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**Método para obter o CNPJ da pessoa jurídica * @return O CNPJ da pessoa jurídica*/
    public String getCNPJ() {
        return CNPJ;
    }
}

/** Classe que representa um cadastro de pessoas */
class Cadastro {
    private Pessoa[] cadastro;/** Atributo privado que armazena um vetor de pessoas */

    /**Construtor da classe Cadastro que inicializa o vetor de pessoas * @param tamanho O tamanho do vetor de pessoas*/
    public Cadastro(int tamanho) {
        cadastro = new Pessoa[tamanho];
    }

    /**Método para cadastrar uma pessoa no vetor * @param indice O índice no vetor onde a pessoa será cadastrada * @param pessoa A pessoa a ser cadastrada*/
    public void cadastrarPessoa(int indice, Pessoa pessoa) {
        cadastro[indice] = pessoa;
    }

    /**Método para imprimir o vetor de cadastro*/
    public void imprimirCadastro() {
        for (Pessoa pessoa : cadastro) {
            if (pessoa != null) {
                System.out.println("Nome: " + pessoa.getNome());
            }
        }
    }
}



