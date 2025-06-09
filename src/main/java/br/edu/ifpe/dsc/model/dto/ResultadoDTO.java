package br.edu.ifpe.dsc.model.dto;

public class ResultadoDTO {

    private String operacao;
    private double resultado;

    public ResultadoDTO() {
    }

    public ResultadoDTO(String operacao, double resultado) {
        this.operacao = operacao;
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "ResultadoDTO [operacao=" + operacao + ", resultado=" + resultado + "]";
    }

}
