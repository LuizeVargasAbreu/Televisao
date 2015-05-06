package televisao;

public class Novela {

    private String titulo;
    private String dtprimeiro_cap;
    private String dtultimo_cap;
    private String hora_exibicao;
    private String autor_novela;
    private String emissora_transmite;
    private Double pontmedia_ibope;
    private String cenas_violencia;
    private String cenas_sexo;
    private String cenas_drogas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDtprimeiro_cap() {
        return dtprimeiro_cap;
    }

    public void setDtprimeiro_cap(String dtprimeiro_cap) {
        this.dtprimeiro_cap = dtprimeiro_cap;
    }

    public String getDtultimo_cap() {
        return dtultimo_cap;
    }

    public void setDtultimo_cap(String dtultimo_cap) {
        this.dtultimo_cap = dtultimo_cap;
    }

    public String getHora_exibicao() {
        return hora_exibicao;
    }

    public void setHora_exibicao(String hora_exibicao) {
        this.hora_exibicao = hora_exibicao;
    }

    public String getAutor_novela() {
        return autor_novela;
    }

    public void setAutor_novela(String autor_novela) {
        this.autor_novela = autor_novela;
    }

    public String getEmissora_transmite() {
        return emissora_transmite;
    }

    public void setEmissora_transmite(String emissora_transmite) {
        this.emissora_transmite = emissora_transmite;
    }

    public Double getPontmedia_ibope() {
        return pontmedia_ibope;
    }

    public void setPontmedia_ibope(Double pontmedia_ibope) {
        this.pontmedia_ibope = pontmedia_ibope;
    }

    public String getCenas_violencia() {
        return cenas_violencia;
    }

    public void setCenas_violencia(String cenas_violencia) {
        this.cenas_violencia = cenas_violencia;
    }

    public String getCenas_sexo() {
        return cenas_sexo;
    }

    public void setCenas_sexo(String cenas_sexo) {
        this.cenas_sexo = cenas_sexo;
    }

    public String getCenas_drogas() {
        return cenas_drogas;
    }

    public void setCenas_drogas(String cenas_drogas) {
        this.cenas_drogas = cenas_drogas;
    }

   public Novela () {
        this.titulo = null;
        this.dtprimeiro_cap = null;
        this.dtultimo_cap = null;
        this.hora_exibicao = null;
        this.autor_novela = null;
        this.emissora_transmite = null;
        this.pontmedia_ibope = 0.0;
        this.cenas_violencia = null;
        this.cenas_sexo = null;
        this.cenas_drogas = null;
    }
    public Integer obterClassificacao (){
        Integer classificacao = 0; 
        
        if ("Não".equals(cenas_violencia) && "Não".equals(cenas_sexo) && "Não".equals(cenas_drogas))
        {
           classificacao = 0;
        }
        else if ("Sim".equals(cenas_violencia) && "Não".equals(cenas_sexo) && "Não".equals(cenas_drogas))
        {
          classificacao = 14;
        }
        else if ("Sim".equals(cenas_violencia) && "Sim".equals(cenas_sexo) && "Não".equals(cenas_drogas))
        {
            classificacao = 16;
        }
        else if ("Sim".equals(cenas_violencia) && "Sim".equals(cenas_sexo) && "Sim".equals(cenas_drogas))
        {
            classificacao = 18;
        }
        return classificacao;
    }
    public Double obterAudiencia (){
        Double audiencia;
        
        audiencia = pontmedia_ibope * 10000;
        return audiencia;
   }
    
    
    
    
}
