package dominio;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity //entidade de domínio
@DiscriminatorValue("P")
public class Vendedor extends Pessoa {
private int codVendedor;
public Vendedor() {
this("",0,0);
}
public Vendedor(String nome, int idade, int codVendedor) {
super(nome,idade);
setcodVendedor(codVendedor);
}
public int getcodVendedor() {
return this.codVendedor;
}
public void setcodVendedor(int codVendedor) {
this.codVendedor = codVendedor;
}
@Override
public String toString() {
return "Vendedor [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", codVendedor= " + getcodVendedor() + "]";
}
public void imprimeDados() {
System.out.println("Nome: "+ super.getNome());
System.out.println("idade: "+ super.getidade());
System.out.println("Código do Vendedor: "+ getcodVendedor());
}
}