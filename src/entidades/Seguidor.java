package entidades;

public abstract class Seguidor { // classe abstrata
    private int op;

    //método construtor
    public Seguidor(int op) {
        this.op = op;
    }

    //getters & setters
    public int getOp() { return op; } //o get retorna
    
    public void setOp(int op) { this.op = op; } //o set modifica
    
    public abstract void execucao (); // método abstrato que será reescrito nas classes filhas
}
