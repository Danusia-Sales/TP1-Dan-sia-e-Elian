package gato;

public class cat{
    boolean femea;
    String nome;
    String raça;
    int registro;
    int idade;
    cat mae;
    public cat(String n){
        this.nome=n;
    }
    public void miar(){
        if(idade>=2){
            System.out.print("MIAU");
        }else{
            System.out.print("MIAAAAAAAUUUUU");
        }
    }
}
