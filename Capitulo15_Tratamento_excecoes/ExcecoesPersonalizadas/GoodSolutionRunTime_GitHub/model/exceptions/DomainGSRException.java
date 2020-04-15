package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.GoodSolutionRunTime_GitHub.model.exceptions;

/*
Se voce colocar a sua excecao personalizada sendo uma
subclasse (via extends) de Exception o compilador obriga a tratar.
RuntimeExepction o compilador não obriga tratamento.
    Se vc nao colocar um tryCatch o compilador nao reclama.

Nota: classe serializable os obj podem ser convertidos em bytes e assim
trafegar em redes, ser gravados em arquivos etc.
No caso o exception é serializable.

No caso ele precisa de uma versao. VAmos usar o valor padrao.
Abaixo a declaracao de uma versao serializable.
 */
public class DomainGSRException extends RuntimeException{

private static final long serialVersionUID = 1l;
/*
add construtor para permitir que eu possa instanciar a excecao
 personalizada passando a msg para ela.

o construtor recebe uma String msg e repassar para o construtor
da super classe.
 */

    public DomainGSRException(String message) {

        super(message);
    }
}
