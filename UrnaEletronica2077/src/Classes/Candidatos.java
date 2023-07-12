package Classes;

public class Candidatos {

    public String nome;
    public String partido;
    
    public Candidatos(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    public static void add(Candidatos candidato1) {
        
    }
    
    @Override
    public String toString() {//ensinando a classe candidatos a se formatar como string, toda vez que for escrever um objeto do tipo "candidatos" eu vou retornar o atributo nome e partido
        return nome + " ; " + partido;
    }

    
    
    
    
    
}
