package br.fai.lds.models;

public  abstract class Animal {

    private int id = 0;
    private static int unicoId;
    private  String nome;

    // ----------------- Construtores --------------------------
    public int getId() {return id;}

    public String getNome() {return nome;}

    public void setId(int id) {this.id = id;}

    public void setNome(String nome) {this.nome = nome;}
    // ---------------------------------------------------------

    public Animal(){
        interaID ();
        setId(unicoId);
    }
        private void interaID() {
        unicoId +=1;
    }

}
