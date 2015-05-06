package televisao;

public class Apresentador {

  private String nome_apresentador;
  private String data_nasc;
  private String prog_apresentado;
  private String e_mail;
  private String nome_artistico;
  private Double salario_mensal;
  private Double cache_por_evento;
  private Double vl_merchandising;
  private String cidade;
  private String endereco;
  private String bairro;
  private String estado;
  private Integer numeroEvento;

    public String getNome_apresentador() {
        return nome_apresentador;
    }

    public void setNome_apresentador(String nome_apresentador) {
        this.nome_apresentador = nome_apresentador;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getProg_apresentado() {
        return prog_apresentado;
    }

    public void setProg_apresentado(String prog_apresentado) {
        this.prog_apresentado = prog_apresentado;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getNome_artistico() {
        return nome_artistico;
    }

    public void setNome_artistico(String nome_artistico) {
        this.nome_artistico = nome_artistico;
    }

    public Double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(Double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public Double getCache_por_evento() {
        return cache_por_evento;
    }

    public void setCache_por_evento(Double cache_por_evento) {
        this.cache_por_evento = cache_por_evento;
    }

    public Double getVl_merchandising() {
        return vl_merchandising;
    }

    public void setVl_merchandising(Double vl_merchandising) {
        this.vl_merchandising = vl_merchandising;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Integer getNumeroEvento() {
        return numeroEvento;
    }
    
    public void setNumeroEvento(Integer numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public Apresentador () {
        this.nome_apresentador = null;
        this.data_nasc = null;
        this.prog_apresentado = null;
        this.e_mail = null;
        this.nome_artistico = null;
        this.salario_mensal = 0.0;
        this.cache_por_evento = 0.0;
        this.vl_merchandising = 0.0;
        this.cidade = null;
        this.endereco = null;
        this.bairro = null;
        this.estado = null;
        this.numeroEvento = 0;
    }
    
  public Double calcularGanhos (Integer numeroEvento){
      Double ganho_mensal;
      
      ganho_mensal = (numeroEvento * cache_por_evento) + salario_mensal + vl_merchandising;
      return ganho_mensal;
  }
}
