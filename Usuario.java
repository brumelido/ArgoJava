package Argo;
public class Usuario {
//conatto =Usuario
    private String nome;
    private String curso;
//sexo == curso
    public Contato(String nome, String curso)
    {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String Imprimir(){
        String saida = "";
        saida += "\n Cadastro \n nome:" +getNome()+"\n Curso: "+getCurso();
        return saida;
    }

    public String Imprimir2(){
        String saida = "";
        saida += "\n Cadastro \n Curso: "+getCurso();
        return saida;
    }

}