package atividadeParaNota;

public class Candidato {
	
    //atributos
    private int num;
    private String nome;
    private int votosTotais = 0;

    public Candidato(int num, String nome){
    	this.num = num;
    	this.nome = nome;
    }

    //Getters
    public int getNum(){
        return this.num;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVotosTotais(){
        return this.votosTotais;
    }

    //Setters
    //Nesse caso setName e setNum não é utilizado, mas foi adicionado caso aja a necessidade em um ambiente real

    public void setName(String novoNome){
        this.nome = novoNome;
    }

    public void setNum(int novoNum){
        this.num = novoNum;
    }
    
    public void setVotos(int novoVoto) {
    	this.votosTotais = novoVoto;
    }

    public void adicionarVoto(){
        this.votosTotais++;
    }
	
}
