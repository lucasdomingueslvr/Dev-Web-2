import java.util.List;

public class Disciplina {

    private String nomeDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Disciplina() {
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina, List<Alunos> alunos, List<Professor> professores) {

        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
    }
        public void setNomeDisciplina ( String nomeDisciplina){
            this.nomeDisciplina = (nomeDisciplina);
        }
        public String getnomeDisciplina(){
            return this.nomeDisciplina;
        }
        public void setAlunos(List<Alunos> alunos){
        this.alunos = alunos;
        }
        public List<Aluno> getALunos(){
            return this.alunos;
        }
        public void setProfessores(List<Professor> professores){
            this.professores = professores;
        }
        public List<Professor> getProfessores(){
            return this.professores;
        }
        
}

