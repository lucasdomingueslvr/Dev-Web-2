public class Aluno extends Pessoa {
    private long matriculaAluno;

    public Aluno() {
        this("", 0, 01, 0);
        this.matriculaAluno = 0;
    }

    public Aluno(String nome, int idade) {
        this(nome, idade, 01, 0);
    }

    public Aluno(String nome, int idade, long cpf, long matriculaAluno) {
        super(nome, idade, cpf);
        this.matriculaAluno = matriculaAluno;
    }

    public void setMatriculaAluno(long matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public long getMatriculaAluno() {
        return this.matriculaAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + ", matricula = " + getMatriculaAluno() + "}";
    }
}
