package televisao;

public class Ator {

    private String nome;
    private String data_nasc;
    private String email;
    private String nm_artistico;
    private Integer novelas;
    private Double sal_mensal;
    private Double cache_evento;
    private String endereco;
    private String cidade;
    private String estado;
    private String bairro;
    private Integer numeroEventos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNm_artistico() {
        return nm_artistico;
    }

    public void setNm_artistico(String nm_artistico) {
        this.nm_artistico = nm_artistico;
    }

    public Integer getNovelas() {
        return novelas;
    }

    public void setNovelas(Integer novelas) {
        this.novelas = novelas;
    }

    public Double getSal_mensal() {
        return sal_mensal;
    }

    public void setSal_mensal(Double sal_mensal) {
        this.sal_mensal = sal_mensal;
    }

    public Double getCache_evento() {
        return cache_evento;
    }

    public void setCache_evento(Double cache_evento) {
        this.cache_evento = cache_evento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Integer getNumeroEventos() {
        return numeroEventos;
    }
    public void setNumeroEventos(Integer numeroEventos) {
        this.numeroEventos = numeroEventos;
    }

    public Ator() {
        this.nome = null;
        this.data_nasc = null;
        this.email = null;
        this.nm_artistico = null;
        this.novelas = 0;
        this.sal_mensal = 0.0;
        this.cache_evento = 0.0;
        this.endereco = null;
        this.cidade = null;
        this.estado = null;
        this.bairro = null;
        this.numeroEventos = 0;
    }
    
    public String obterStatus (Integer novelas, Double sal_mensal){
        String status;
        
        if (novelas <= 3 && sal_mensal <= 5000)
        {
           status = "Calouro";
        }
        else if (novelas > 3 && novelas <= 6)
        {
           status = "Revelação";
        }
        else if (novelas <= 6 && sal_mensal >= 30000)
        {
           status = "Joia";
        }
        else if (novelas >= 9 && sal_mensal <= 30000)
        {
           status = "Elenco de Apoio";
        }
        else if (sal_mensal >= 30000 && sal_mensal <= 100000)
        {
           status = "Elenco Principal";
        }
        else if (sal_mensal > 100000)
        {
            status = "Estrela";
        }
        else 
        {
            status = "Elenco Regular"; 
        }
        return status;
        
    }
    public Double calcularGanhos (Integer numeroEventos){
        Double ganhos_mensais = 0.0;
        if (numeroEventos == 3)
        {
          ganhos_mensais = (numeroEventos * cache_evento) + sal_mensal;
        }
        else if (numeroEventos > 3 && numeroEventos <= 6)
        {
          ganhos_mensais = (numeroEventos * cache_evento) + sal_mensal;
        }
        else if (numeroEventos >= 9)
        {
          ganhos_mensais = (numeroEventos * cache_evento) + sal_mensal;
        }

        return ganhos_mensais; 
                
    }
    
}
