package entidades;

import java.io.Serializable;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Motores extends Seguidor //Classe Motores herda da classe Seguidor
        implements Perda, Constantes, Serializable{ //implementa as interfaces Perda e Contantes
    public String direcao;

    public Motores() {
        super(0);
    }

    //método construtor na Herança
    public Motores(int op, String direcao) {
        super(op); // referência para a superclasse
        this.direcao = direcao;
    }
    
    //getters & setters
    public String getDirecao() { return direcao; } //o get retorna

    public void setDirecao(String direcao) { this.direcao = direcao; } //o set modifica
    
    //define a direção
    @Override
    public void execucao() { 
        switch (getOp()) {
            case 1:
                setDirecao(" seguirá em linha\nreta ");
                break;
            case 2:
                setDirecao(" será direcionado\npara esquerda ");
                break;
            case 3:
                setDirecao(" será direcionado\npara direita ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                System.exit(0);
        }
    }
    
    public String formatacao(double valor) {
        //formato para 2 casas depois da virgula
        NumberFormat formatador = NumberFormat.getNumberInstance();
        formatador.setMaximumFractionDigits(2);
        formatador.setMinimumFractionDigits(2);
        
        return formatador.format(valor);
    }
    
    @Override
    public double perda() //método concreto
    { return VOLTAGEM - 0.001; }
    
    @Override
    public String toString() {
        execucao();
        return ("Os motores recebem uma voltagem de " + formatacao(perda()) +
                " V e o robô" + getDirecao());
    }
}
