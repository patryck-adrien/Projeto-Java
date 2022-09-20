package entidades;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Stm32 extends Seguidor 
        implements Serializable{ //Classe Stm32 herda da classe Seguidor
    private int v_e, v_d, sobrecarga;

    public Stm32() {
        super(0);
    }
    
    //método construtor na Herança
    public Stm32(int op, int v_e, int v_d) {
        super(op);
        this.v_e = v_e;
        this.v_d = v_d;
    }
    
//    public Stm32(int op, int sobrecarga) { //sobrecarga
//        super(op);
//        this.sobrecarga = sobrecarga;
//    }
    
    //getters & setters
    public int getV_e() { return v_e; } //o get retorna
    public int getV_d() { return v_d; }
    public int getSobrecarga() { return sobrecarga; }
    
    public void setV_e(int v_e) { this.v_e = v_e; } //o set modifica
    public void setV_d(int v_d) { this.v_d = v_d; }
    public void setSobrecarga(int sobrecarga) { 
        this.sobrecarga = sobrecarga; }
    
    //define a velocidade
    @Override
    public void execucao() {
        switch (getOp()) {
            case 1:
                setV_e(v_e + 10);
                setV_d(v_d + 10);
                break;
            case 2:
                setV_e(v_e - 10);
                setV_d(v_d + 10);
                break;
            case 3:
                setV_e(v_e + 10);
                setV_d(v_d - 10);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                System.exit(0);
        }
    }
    
    @Override
    public String toString() { //sobreposição do método toString
        execucao();
//        if(sobrecarga == 1){
//            execucao();
//            return (getV_e() + ", " + getV_d() + "\n");
//        }
//        else {
            return ("com uma adição de velocidade de " + 
                    getV_e() + " na roda esquerda e\n" + getV_d() +
                    " na roda direita.");
       // }
    }
}
