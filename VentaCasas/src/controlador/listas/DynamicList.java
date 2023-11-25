/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.listas;

import exeption.EmptyException;
import java.util.function.Predicate;

/**
 *
 * @author darwi
 */
public class DynamicList <E> {
    private Node<E> header;
    private Node<E> last;
    private Integer length;
    
    public DynamicList(){
        header = null;
        last = null;
        length = 0;
    }
    
    public Boolean isEmpty(){
        return (header == null || length.intValue() == 0);
               
    }
        
    private void addHeader(E info){
        Node<E> help;
        if(isEmpty()){
            help = new Node<>(info);
            header = help;
            last = help;
            length++;
        }else{
            help = new Node<>(info, null);
            last.setNext(help);
            last = help;
            length++;  
        }
    }
    
    private void addLast(E info){
        Node<E> help;
        if(isEmpty()){
            addHeader(info);
        }else{
            help = new Node<>(info, null);
            last.setNext(help);
            last = help;
            length++;  
        }
    }
    private  E getFirst() throws EmptyException{
        if(isEmpty()){
            throw new EmptyException("Error, Lista vacia");
        }
        return header.getInfo();
    }
    
     private  E getLast() throws EmptyException {
        if(isEmpty()){
            throw new EmptyException("Error, Lista vacia");
        }
        return last.getInfo();
    }
    
    public void add(E info){
        addLast(info);
    }
    
    public void add(E info, Integer index) throws EmptyException, IndexOutOfBoundsException{
        if(isEmpty() || index.intValue() == 0){
            addHeader(info);
        }else if(index.intValue() == length){
            addLast(info);
        }else{
           Node<E> searchpreView = getNode(index - 1);
           Node<E> search = getNode(index);
           Node<E> help = new Node <> (info, search);
           searchpreView.setNext(help);
           length++;
           
        }
    }
    
    public E getInfo(Integer index) throws EmptyException{
        return getNode(index).getInfo();
        
    }
    
    private Node<E> getNode(Integer index) throws  EmptyException, IndexOutOfBoundsException {
        if(isEmpty()){
            throw  new EmptyException("Error, Lista vacia");
        }else if (index.intValue() < 0 || index.intValue() == length ){
            throw new IndexOutOfBoundsException("Error, fuera de rango");
        }else if(index.intValue() == 0){
            return header;
        }else if(index.intValue() == (length -1)){
            return last;
        }else{
            Node<E> search = header;
            int cont = 0;
            while (cont < index.intValue()) {
                cont++;
                search = search.getNext();
            }
            return search; 
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("List Data \n");
            try {
                Node<E> help = header;
                sb.append(help.getInfo()).append("\n");
                help = help.getNext();        
            } catch (Exception e) {
                sb.append(e.getMessage());
            }
            return sb.toString();
    }

    public Integer getLength() {
        return length;
    }
    
    public Node<E> obtenerNodo(Integer id) throws EmptyException{      
        return getNode(id);
    }
}
    

