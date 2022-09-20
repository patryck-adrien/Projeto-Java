package dados;

import entidades.*;

import java.io.FileInputStream; //arquivo leitura
import java.io.ObjectInputStream; //leitor

import java.io.FileOutputStream; //arquivo gravação
import java.io.ObjectOutputStream; //gravador

import java.io.IOException; //exceção de entrada e saída
import java.io.EOFException; //exceção fim de arquivo encontrado

import java.util.ArrayList;
import java.util.Iterator; //apontador para varrer o arraylist

public class Analise {
    
    ////// ARRAYLIST //////// (coleção na memória)
    private ArrayList analise;

    public Analise() { //cria coleção
        analise = new ArrayList();
    }

    public void inserir(Motores m, Stm32 s) {
        analise.add(m); //adiciona obj s ao ArrayList
        analise.add(s);
    }
    
    public String listarTodos() {
        StringBuilder lista = new StringBuilder();
        
        //preencher lista com elementos da analise
        Iterator i = analise.iterator();
        while ( i.hasNext() ) { //enquanto tem um proximo obj no ArrayList
            Motores m = (Motores) i.next(); //retorna uma referencia Object
            lista.append(m); 
            Stm32 s = (Stm32) i.next(); //retorna uma referencia Object
            lista.append(s); 
            //chama o metodo toString de Stm32 e adiciona o texto à StringBuilder
        }
        return lista.toString();
    } 
    
    /////// ARQUIVO /////////
    private ObjectOutputStream gravacao;
    private final String dir = "src/dados/"; //grava no pacote dados do proj
    
    public ObjectOutputStream abreArquivoGravacao(){
        try {
                setGravacao(
                  new ObjectOutputStream(
                    new FileOutputStream(dir+"analise.ser")));
        }
        catch (IOException e){
            System.err.println("\nErro abertura de arquivo:\n"+e);
        }

        return getGravacao();
    }

    public void gravarObjetos () {
        try
        {
            //varrer obj arraylist gravando no arq
            Iterator it = analise.iterator(); //ponteiro aux p lista
            while ( it.hasNext() ){ //se nao é null
                gravacao.writeObject( (Motores)it.next() );
                gravacao.writeObject( (Stm32)it.next() ); //pega obj e grava
                
            }
        }
        catch ( IOException e )
        {
            System.err.println( "\nErro gravacao do objeto no arquivo:\n" + e);
        }

    }

    public void fechaArquivoGravacao() {
        try{
                if (gravacao != null)
                    gravacao.close();
        }
        catch(IOException e){
            System.out.println("Erro fechar arquivo");
        }
    }


    //abertura e leitura do arquivo
    private ObjectInputStream leitura;

    public ObjectInputStream abreArquivoLeitura()
    {   try {   setLeitura(
                  new ObjectInputStream(
                    new FileInputStream(dir+"analise.ser")));
        }
        catch (IOException e){
            System.err.println("\nErro abertura de arquivo:\n"+e);
        }
        return leitura;
    }

    public void leRegistros()
    {   //Motores m;
        Stm32 s;
        try
        {   analise.clear(); //limpa o arraylist
            while(true) //forçando EOFException
            {   //m = ( Motores ) leitura.readObject(); //le do arq 
//                analise.add(m); //inclui no arraylist
                s = ( Stm32 ) leitura.readObject(); //le do arq 
                analise.add(s); //inclui no arraylist
            }
        }
        catch ( EOFException e )
        {   return; // fim do arquivo foi alcançado
        }
        catch ( ClassNotFoundException e )
        {   System.err.println( "Não foi possível criar o objeto.");
        }
        catch ( IOException e )
        {   System.err.println("\nErro de leitura do arquivo:\n"+e);
        }
    }

    public void fechaArquivoLeitura()
    {   try{   if (leitura != null)
                        leitura.close();
        }
        catch(IOException e){
            System.out.println("\nErro fechar arquivo:\n"+e);
        }
    }

    //getters&setters
    public ArrayList getAnalise() { return analise; }
    public void setAnalise(ArrayList analise) {
        this.analise = analise;
    }
    public ObjectOutputStream getGravacao() {
        return gravacao;
    }

    public ObjectInputStream getLeitura() {
        return leitura;
    }

    public void setGravacao(ObjectOutputStream gravacao) {
        this.gravacao = gravacao;
    }

    public void setLeitura(ObjectInputStream leitura) {
        this.leitura = leitura;
    }
}
