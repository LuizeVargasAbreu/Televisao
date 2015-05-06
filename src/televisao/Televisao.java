package televisao;

import javax.swing.JOptionPane;

public class Televisao {

    public static void main(String[] args) {

        Ator ator = new Ator();
        Novela novela = new Novela();
        Emissora emissora = new Emissora();
        Apresentador apresentador = new Apresentador();

        String opcao = null;
        JOptionPane.showMessageDialog(null, "Bem Vindo a sua televisão!");

        do {
            JOptionPane.showMessageDialog(null, "Menu:"
                    + "\n1.Dados da Emissora"
                    + "\n2. Dados da Novela"
                    + "\n3. Dados do Ator"
                    + "\n4. Dados do Apresentador"
                    + "\n5. Sair do Menu");
            opcao = JOptionPane.showInputDialog("Digite a opção desejada: ");

            switch (opcao) {
                case "1": {
                    emissora.setNome_emissora(JOptionPane.showInputDialog("Digite o nome da emissora: "));
                    emissora.setEndereco_emissora(JOptionPane.showInputDialog("Digite o endereço da emissora: "));
                    String abertafechada = JOptionPane.showInputDialog("Emissora de Tv Aberta ou Fechada (ABERTA/FECHADA)?");

                    if (abertafechada.equals("ABERTA")) {
                        emissora.setTvaberta_fechada(true);
                    } else if (abertafechada.equals("FECHADA")) {
                        emissora.setTvaberta_fechada(false);
                    }

                    String exibir = null;
                    if (emissora.getTvaberta_fechada() == true) {
                        exibir = "ABERTA";
                    } else if (emissora.getTvaberta_fechada() == false) {
                        exibir = "FECHADA";
                    }

                    JOptionPane.showMessageDialog(null, "Dados da Emissora:"
                            + "\nNome: " + emissora.getNome_emissora()
                            + "\nEndereço: " + emissora.getEndereco_emissora()
                            + "\nEsta emissora é: " + exibir);
                    break;
                }
                case "2": {
                    novela.setTitulo(JOptionPane.showInputDialog("Digite o nome da novela: "));
                    novela.setAutor_novela(JOptionPane.showInputDialog("Digite o nome do autor(a) da novela: "));
                    novela.setDtprimeiro_cap(JOptionPane.showInputDialog("Digite o dia do primeiro capítulo da novela:"));
                    novela.setDtultimo_cap(JOptionPane.showInputDialog("Digite o dia do último capítulo da novela:"));
                    novela.setHora_exibicao(JOptionPane.showInputDialog("Informe a que horas a novela é exibida: "));
                    novela.setEmissora_transmite(JOptionPane.showInputDialog("Informe que emissora exibe esta novela "));
                    novela.setCenas_violencia(JOptionPane.showInputDialog("Informe se há cenas de violência nesta novela"));
                    novela.setCenas_sexo(JOptionPane.showInputDialog("Informe se há cenas de sexo nesta novela"));
                    novela.setCenas_drogas(JOptionPane.showInputDialog("Informe se há cenas de drogas nesta novela"));
                    novela.setPontmedia_ibope(Double.parseDouble(JOptionPane.showInputDialog("Informe a pontuação desta novela: ")));

                    String classificacao = null;
                    
                    if (novela.obterClassificacao() == 0)
                    {
                        classificacao = "Livre";
                    }
                    else if (novela.obterClassificacao() == 14)
                    {
                        classificacao = "Para maiores de 14 anos";
                    }
                    else if (novela.obterClassificacao() == 16)
                    {
                        classificacao = "Para maiores de 16 anos";
                    }
                    else if (novela.obterClassificacao() == 18)
                    {
                        classificacao = "Imprópria para menores de 18 anos";
                    }

                    JOptionPane.showMessageDialog(null, "Dados da Novela:"
                            + "\nNome da novela: " + novela.getTitulo()
                            + "\nAutor(a): " + novela.getAutor_novela()
                            + "\nData do primeiro capítulo: " + novela.getDtprimeiro_cap()
                            + "\nData do último capítulo: " + novela.getDtultimo_cap()
                            + "\nHorário de Exibição: " + novela.getHora_exibicao()
                            + "\nNome da Emissora que transmite: " + novela.getEmissora_transmite()
                            + "\nClassificação da novela: " + classificacao
                            + "\nNúmero parcial de pessoas que assistem a novela: " + novela.obterAudiencia());
                    break;
                }
                case "3": {
                    ator.setNome(JOptionPane.showInputDialog("Digite o nome do autor:"));
        ator.setData_nasc(JOptionPane.showInputDialog("A data de nascimento:"));
        ator.setEstado(JOptionPane.showInputDialog("O Estado desse autor:"));
        ator.setCidade(JOptionPane.showInputDialog("A cidade:"));
        ator.setEndereco(JOptionPane.showInputDialog("O endereço:"));
        ator.setBairro(JOptionPane.showInputDialog("O bairro:"));
        ator.setEmail(JOptionPane.showInputDialog("O e_mail:"));
        ator.setNm_artistico(JOptionPane.showInputDialog("O nome artístico:"));
        ator.setNovelas(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de novelas que ele fez:")));
        ator.setCache_evento(Double.parseDouble(JOptionPane.showInputDialog("Informe o cachê que ele ganha por evento:")));
        ator.setSal_mensal(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mensal dele:")));
        ator.setNumeroEventos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eventos que ele participou no mês: ")));
        
                    JOptionPane.showMessageDialog(null, "Dados do Ator/Atriz:\n"
                            + "Nome artístico: " + ator.getNm_artistico()
                            + "\nData de Nascimento: " + ator.getData_nasc()
                            + "\nE_mail: " + ator.getEmail()
                            + "\nNúmero de novelas: " + ator.getNovelas()
                            + "\nStatus: " + ator.obterStatus(ator.getNovelas(), ator.getSal_mensal())
                            + "\nGanhos Mensais: " + ator.calcularGanhos(ator.getNumeroEventos()));
                    break;
                }
                case "4": {
                    apresentador.setNome_apresentador(JOptionPane.showInputDialog("Digite o nome do apresentador: "));
                    apresentador.setData_nasc(JOptionPane.showInputDialog("Digite sua data de nascimento: "));
                    apresentador.setEstado(JOptionPane.showInputDialog("Digite seu Estado: "));
                    apresentador.setCidade(JOptionPane.showInputDialog("Digite o nome de sua cidade: "));
                    apresentador.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
                    apresentador.setBairro(JOptionPane.showInputDialog("Digite o nome de seu bairro: "));
                    apresentador.setE_mail(JOptionPane.showInputDialog("Digite seu e_mail: "));
                    apresentador.setNome_artistico(JOptionPane.showInputDialog("Digite seu nome artístico: "));
                    apresentador.setProg_apresentado(JOptionPane.showInputDialog("Digite o nome do programa que ele ou você apresenta: "));
                    apresentador.setNumeroEvento(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eventos que participas no mês: ")));
                    apresentador.setCache_por_evento(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu cachê por evento: ")));
                    apresentador.setVl_merchandising(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que ganhas por merchandising: ")));
                    apresentador.setSalario_mensal(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário mensal: ")));

                    JOptionPane.showMessageDialog(null, "Dados principais do Apresentador:"
                            + "\nNome: " + apresentador.getNome_apresentador()
                            + "\nData de nascimento: " + apresentador.getData_nasc()
                            + "\nEstado: " + apresentador.getEstado()
                            + "\nE_mail: " + apresentador.getE_mail()
                            + "\nNome Artístico: " + apresentador.getNome_artistico()
                            + "\nPrograma que apresenta: " + apresentador.getProg_apresentado()
                            + "\nNúmero de eventos que participa:" + apresentador.getNumeroEvento()
                            + "\nGanhos Mensais: " + apresentador.calcularGanhos(apresentador.getNumeroEvento()));
break;
                }
                case "5": {
                    JOptionPane.showMessageDialog(null, "TCHAU, E MUITO OBRIGADO(A) POR TER CONHECIDO UM POUCO DA NOSSA TELEVISÃO!");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    break;
                }
            }

        } while (!"5".equals(opcao));



    }
}
