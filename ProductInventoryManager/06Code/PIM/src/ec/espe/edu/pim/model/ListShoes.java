
package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author lesly
 */
public class ListShoes {

    
    private List <PairOfShoes> listaC;
    
    public ListShoes(){
        listaC = new ArrayList <PairOfShoes>();
    }
    //ADICIONAR A LA LISTA AL CLIENTE 
    public void adicionarCliente(PairOfShoes c){
        listaC.add(c);
    }
    
    public void eliminarCliente(PairOfShoes c){
        listaC.remove(c);
    }
    
    public List<PairOfShoes> GetListShoes(){
        return listaC;
    }
    
    public void limpiarLista(){
        listaC.clear();
    }
    
    public int definirTamañoLista(){
        //CANTIDAD DE CLIENTES QUE TIENE LA LISTA 
        return listaC.size();
    }
    //CONSEGUIR POR POSICION ESPECIFICA
    public PairOfShoes obtenerCliente(int pos){
        return listaC.get(pos);
    }
    
    public void mostrarClientes(){
        Iterator it = listaC.iterator();
        PairOfShoes aux;
        while(it.hasNext()){
            aux = (PairOfShoes) it.next();
            System.out.println(aux.toString());
        }
    }
    
}
