
package cadastropessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author camil
 */
public class CadastraPessoa {
    //Pessoa[] pessoas= new Pessoa[3];
    //int indice=0;
    
    List<Pessoa> pessoas = new ArrayList<>();
    
    public void addPessoa(Pessoa p){ //ponteiro
        pessoas.add(p);
        //indice++;
    }
    public void imprimirPessoa(){
        for(int i=0;i<pessoas.size();i++){
            System.out.println(pessoas.get(i).getNome()+"\n");
        }
    }
}
