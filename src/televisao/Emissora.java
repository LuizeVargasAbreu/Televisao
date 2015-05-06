package televisao;

public class Emissora {

    private String nome_emissora;
    private String endereco_emissora;
    private Boolean tvaberta_fechada;

    public String getNome_emissora() {
        return nome_emissora;
    }

    public void setNome_emissora(String nome_emissora) {
        this.nome_emissora = nome_emissora;
    }

    public String getEndereco_emissora() {
        return endereco_emissora;
    }

    public void setEndereco_emissora(String endereco_emissora) {
        this.endereco_emissora = endereco_emissora;
    }

    public Boolean getTvaberta_fechada() {
        return tvaberta_fechada;
    }

    public void setTvaberta_fechada(Boolean tvaberta_fechada) {
        this.tvaberta_fechada = tvaberta_fechada;
    }
    
   public Emissora (){
        this.nome_emissora = null;
        this.endereco_emissora = null;
        this.tvaberta_fechada = false;
    }

    
    
    
}
