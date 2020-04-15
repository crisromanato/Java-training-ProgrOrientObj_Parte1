package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Heranca.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Upcasting_Downcasting.entities.AccountUpDownCasting;

/*
para receber a heranca da classe Account_Heranca fazemos
um extends.
Isso define que minha classe businessAccount tera todos
os comportamentos da classe Account_Heranca

Definiçoes:
Heranca
1. é uma relacao é um
Se estamos definindo que a businessAccount tem tudo que a Account
tem. Entao a BusinessAccount é uma conta com algo mais.

2. Generalizacao / especializacao
Account é generica e a business é especifica

3. Superclasse(classe base) / Subclasse (Classe Derivada)
Account                         BusinessAccount

4. Heranca / extensao
A classe Buiness esta extendendo a classe Account

5. Heranca é uma associacao entre classes nao entre objetos
Quando temos composicao entre classes, quando instanciamos objetos
temos dois objetos.
Na herancaç tenho um objeto só e este objeto tem todos os objetos
das duas classes.
 */
public class BusinessAccount_UpDownCasting extends AccountUpDownCasting {
    /*
    atributos
     */

    private Double loanLimit;

    /*
    Construtor padrao
         */

    public BusinessAccount_UpDownCasting() {
        super();
    }

    /*
    Construtor com argumentos
     */

    public BusinessAccount_UpDownCasting(Integer number, String holder, Double balance, Double loanLimit) {
        /*
        o contrutor com argumentos chama os argumentos da super
        classe com a palavra super
         */
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    /*
    getters and setters
         */

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    /*
    metodos adicionais
     */

    public void loan(double amount) {
        if (amount <= loanLimit) {
            /*
            ajustado a visibilidade do balance de private
            para protected para poder ser usado dentro da
            subclasse.
             */
            balance += amount - 10.0;
        }
    }
}