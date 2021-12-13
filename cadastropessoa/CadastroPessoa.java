//Exercício 5
//Programa principal
package cadastropessoa;
/**
 *
 * @author camil
 */
public class CadastroPessoa {

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       p1.setNome("Matheus");
       p1.setEndereço("Rua Saturno");
       p1.setTelefone("91234-5678");
       p1.setIdade(20);
       
       Pessoa p2 = new Pessoa();
       p2.setNome("Maria");
       p2.setEndereço("Rua Marte");
       p2.setTelefone("99987-6543");
       p2.setIdade(37);
       
       Pessoa p3 = new Pessoa();
       p3.setNome("Sabrina");
       p3.setEndereço("Rua Plutão");
       p3.setTelefone("4002-8922");
       p3.setIdade(56);
       
       Pessoa p4 = new Pessoa();
       p4.setNome("Anderson");
       p4.setEndereço("Rua Vênus");
       p4.setTelefone("3363-1997");
       p4.setIdade(45);
       
       CadastraPessoa cadastro= new CadastraPessoa();//Insert
       cadastro.addPessoa(p1);
       cadastro.addPessoa(p2);
       cadastro.addPessoa(p3);
       cadastro.addPessoa(p4);
       
       System.out.println(cadastro.imprimirPessoa());
              
       cadastro.RemovePessoa(p2);//Delete
       
       System.out.println(cadastro.imprimirPessoa());
       
       p1.setIdade(22);//Update
       cadastro.AtualizarPessoa(p1);//Update
       
       System.out.println(cadastro.imprimirPessoa());
       
       cadastro.buscaPessoa("Matheus");//Select
        
    }
  
}

