    package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Fixacao.entities;

    public class Account1 {
        /*
        Atributos
         */
        private int number;
        private String holder; // titular da conta
        private double balance; // saldo

    /*
    Contrutores (2 tipos)
    Pois posso instanciar um construtor com todas opçoes e uma somente com parte
     */

        public Account1(int number, String holder) {
            this.number = number;
            this.holder = holder;
        }

        /*
        Situacao relacionada a encapsulamento
        Neste construtor na verdade a conta nao tem saldo inicial 500, ela tem saldo 0
        recebeu um deposito de 500.
        Por isso mudamos o parametro balance para initialDeposit
        Para proteger o contrutor caso haja futura alteracao na regra de negocio do banco
        por exemplo para deposito, com isso nao precisaremos mudar o contrutor e no deposito, mas somente
        o metodo deposito, ou seja um ponto de alteracao somente.

        Falamos que a mudança é relativa a encapsulamento, pois estamos usando o metodo deposito,
        dentro do construtor e deixando a regra de deposito dentro dela.
        Desta forma eu encapsulo somente um ponto de alteracao caso essa regra mude no futuro.

         */
        public Account1(int number, String holder, double initialDeposit) {  // trocado balance pelo valor atual
            this.number = number;
            this.holder = holder;
            //this.balance = balance;
            deposit(initialDeposit); // chamar a operacao deposito, passando o initialDeposit como argumento
        }

        /*
       getters and setters porque meus atributos sao privados.
       Obs importante - mudanças de saldo e saque via metodos - entao teremos somente get
       outro ponto é o numero da conta - ele nao pode ser mudado, entao podemos ter somente get
       holder - titular da conta é o unico que poderemos ter os dois tipos
        */


        public int getNumber() {
                return number;
            }

            public String getHolder() {
                return holder;
        }

        public void setHolder(String holder) {
                this.holder = holder;
        }

        public double getBalance() {
            return balance;
        }
        /*
        Metodos complementares
        1. deposito
        2. saque
        3. modificar a variavel account para o formato desejado
         */
            public void deposit(double amount) {
                balance += amount;
            }

            public void withdraw(double amount) {
                balance -= amount + 5.0;
            }

            public String toString() {
                return "Account "
                        + number
                        + ", Holder: "
                        + holder
                        + ", Balance: $ "
                        + String.format("%.2f", balance);
            }
    }
