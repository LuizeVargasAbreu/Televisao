package televisao;

import javax.swing.JOptionPane;

public class TesteAtor {
    public static void main(String[] args) {

        Ator ator = new Ator ();
        
        ator.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        ator.setData_nasc(JOptionPane.showInputDialog("Digite sua data de nascimento:"));
        ator.setEstado(JOptionPane.showInputDialog("Digite seu Estado:"));
        ator.setCidade(JOptionPane.showInputDialog("Digite sua cidade:"));
        ator.setEndereco(JOptionPane.showInputDialog("Digite seu endereço:"));
        ator.setBairro(JOptionPane.showInputDialog("Digite seu bairro:"));
        ator.setEmail(JOptionPane.showInputDialog("Digite seu e_mail:"));
        ator.setNm_artistico(JOptionPane.showInputDialog("Digite seu nome artístico:"));
        ator.setNovelas(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de novelas que você fez:")));
        ator.setCache_evento(Double.parseDouble(JOptionPane.showInputDialog("Informe o cachê que você ganha por evento:")));
        ator.setSal_mensal(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário mensal:")));
        ator.setNumeroEventos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eventos que participastes no mês: ")));
      
        JOptionPane.showMessageDialog(null,"Dados do Ator/Atriz:\n"
                + "Nome artístico: " + ator.getNm_artistico() 
                + "\nData de Nascimento: " + ator.getData_nasc()
                + "\nE_mail: " + ator.getEmail()
                + "\nNúmero de novelas: " + ator.getNovelas());
        
       JOptionPane.showMessageDialog(null,"Dados do Ator/Atriz:\n"
                + "Nome artístico: " + ator.getNm_artistico() 
                + "\nData de Nascimento: " + ator.getData_nasc()
                + "\nE_mail: " + ator.getEmail()
                + "\nNúmero de novelas: " + ator.getNovelas()
                + "\nStatus: " + ator.obterStatus(ator.getNovelas(),ator.getSal_mensal())
                + "\nGanhos Mensais: " + ator.calcularGanhos(ator.getNumeroEventos())); 
        
        
    }
}
