
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
        pessoas.add(p);//Insert
        //indice++;
    }
    public String imprimirPessoa(){
        String pe = " ";
        for (Pessoa p:pessoas){
            pe += "Nome: "+p.getNome()+ "\n";
            pe += "Endereço: "+p.getEndereço()+ "\n";
            pe += "Telefone: "+p.getTelefone()+ "\n";
            pe += "Idade: "+p.getIdade()+ "\n";
        }
        return pe;
    }
    public Pessoa buscaPessoa(String nomePessoa){//Select
        for (Pessoa b:pessoas){
            if(b.getNome().equals(nomePessoa)){
                 String pe = " ";
                        pe += "Nome: "+b.getNome()+ "\n";
                        pe += "Endereço: "+b.getEndereço()+ "\n";
                        pe += "Telefone: "+b.getTelefone()+ "\n";
                        pe += "Idade: "+b.getIdade()+ "\n";
            }
        }
        return null;      
    }
    
    public Pessoa buscaPessoa(Pessoa p){
        for (Pessoa x:pessoas){
            if (x == p)
            {
                return x;
            }
        }return null;
    }
    
    
    public boolean RemovePessoa (Pessoa p){//Delete
       Pessoa pe = buscaPessoa(p);
        if(pe != null)
       {
            pessoas.remove(pe);
            
            return true;
        }
        return false;
                
    }
    
    public boolean AtualizarPessoa (Pessoa p){//Update
        if (pessoas.contains(p)){
         Pessoa b =buscaPessoa(p);
         b.setNome(p.getNome());
         b.setEndereço(p.getEndereço());
         b.setIdade(p.getIdade());         
         }
        return false;
         
    }
    
}//fim classe
