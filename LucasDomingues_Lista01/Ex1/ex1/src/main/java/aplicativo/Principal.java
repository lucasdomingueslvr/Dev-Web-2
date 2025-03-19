package aplicativo;
import dominio.Pessoa;
import dominio.Vendedor;
import dominio.Cliente;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class Principal {
public static void main(String[] args) {
//Instancia o EntityManagerFactory com as configurações de persistencia
EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
//Intancia o EntityManager
EntityManager em = emf.createEntityManager();

Vendedor Vendedor1 = new Vendedor("Lucas", 20, 0001);
Cliente Cliente1 = new Cliente("Rafael", 34, 0001);
em.getTransaction().begin();// iniciar transação com banco de dados
em.persist(Vendedor1);
em.persist(Cliente1);
//consulta em jpql
Query consultaV = em.createQuery("select Vendedor from Vendedor Vendedor");
ArrayList<Vendedor> listaV = (ArrayList<Vendedor>) consultaV.getResultList();
//consulta em jpql
Query consultaC = em.createQuery("select Cliente from Cliente Cliente");
ArrayList<Cliente> listaC = (ArrayList<Cliente>) consultaC.getResultList();
em.getTransaction().commit();//confirmar as alterações realizadas
emf.close();
em.close();
for(Vendedor objV: listaV) {
System.out.println(objV);
}
for(Cliente objC: listaC) {
System.out.println(objC);
}
}
}