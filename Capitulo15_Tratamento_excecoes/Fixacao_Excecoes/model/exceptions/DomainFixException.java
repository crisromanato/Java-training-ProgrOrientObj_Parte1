package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.model.exceptions;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.model.entities.AccountFix;

public class DomainFixException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainFixException(String msg) {
        super(msg);
    }
}
