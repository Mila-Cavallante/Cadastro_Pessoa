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
       p2.setTelefone("9987-6543");
       p2.setIdade(28);
       
       CadastraPessoa cadastro= new CadastraPessoa();
       cadastro.addPessoa(p1);
       cadastro.addPessoa(p2);
       
       cadastro.imprimirPessoa();
    }
  
}
