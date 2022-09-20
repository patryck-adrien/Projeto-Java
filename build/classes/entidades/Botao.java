package entidades;

import java.io.Serializable;

public class Botao extends Seguidor 
        implements Serializable{
    public int contagem;
    private boolean estado_final;

     //método construtor na Herança
    public Botao(int op, int contagem) {
        super(op);
        this.contagem = contagem;
    }

    public int getContagem() { return contagem; }
    public void setContagem(int contagem) { this.contagem = contagem; }
    
    @Override
    public void execucao() {
        if(contagem == 1 || contagem == 2)  {
            estado_final = false;
            contagem++;
        }
        if(contagem == 3){
            estado_final = true;
        }
    }
    
    @Override
    public String toString() {
        execucao();
        if(estado_final)    return ("Condição de parada ativada!\n");
        else    return ("Iniciando a corrida!\n");
    }
}
