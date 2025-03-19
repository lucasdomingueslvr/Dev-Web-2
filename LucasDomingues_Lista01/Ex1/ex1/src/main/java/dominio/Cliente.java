package dominio;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity //entidade de domínio
@DiscriminatorValue("C")
public class Cliente extends Pessoa {
private int codCliente;
public Cliente() {
this("",0,0);
}
public Cliente(String nome, int idade, int codCliente) {
super(nome,idade);
setcodCliente(codCliente);
}
public int getcodCliente() {
return this.codCliente;
}
public void setcodCliente(int codCliente) {
this.codCliente = codCliente;
}
@Override
public String toString() {
    return "Cliente [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + " ,codCliente= " + getcodCliente() + "]";
}
public void imprimeDados() {
System.out.println("Nome: "+ super.getNome());
System.out.println("idade: "+ super.getidade());
System.out.println("Código do Cliente: "+ getcodCliente());
}
}