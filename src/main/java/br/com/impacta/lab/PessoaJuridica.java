package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa {
    private String documento;
    private String tipo;

    public PessoaJuridica(String documento, String tipo){
        this.documento = documento;
        this.tipo = tipo;
    }

    @Override
    public String falarDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   

    @Override
    public String getTipo() {
        return tipo;
    }
 
    public String getDocumento() {
        return this.documento;
    }


}