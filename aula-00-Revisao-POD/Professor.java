public class Professor extends Pessoa {
    private long IDProfessor;

    public Professor() {
        this("", 0, 01, 0);
        this.IDProfessor = 0;
    }

    public Professor(String nome, int idade) {
        this(nome, idade, 01, 0);
    }

    public Professor(String nome, int idade, long cpf, long IDProfessor) {
        super(nome, idade, cpf);
        this.IDProfessor = IDProfessor;
    }

    public void setIDProfessor(long IDProfessor) {
        this.IDProfessor = IDProfessor;
    }

    public long getIDProfessor() {
        return this.IDProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", ID = " + getIDProfessor() + "}";
    }
}