/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author JoelS
 */


public class PilhaEncadeada{


    public class Node{
        private Integer informacao;
        private Node proximo;
        public Node(){
            informacao = null;
            proximo = null;
        }
        public void setInfo(Integer info){
            informacao = info;
        }
        public void setProximo(Node proximo){
            this.proximo = proximo;
        }
        public Integer getInfo(){
            return informacao;
        }
        public Node getProximo(){
            return proximo;
        }
    }
    private Node Lista;
    private Node aux;
    private Node topo;

    public PilhaEncadeada(){
        Lista = null;
        aux = null;
    }
    public void adicionar(Integer dado){
        Node no = new Node();
        no.setInfo(dado);
        
      /* 
        if(Lista == null){
        Lista = no;
        }
        else{
            Node nos = Lista;
            
            while(nos.getProximo() != null){
                nos = nos.getProximo();
            }
            nos.setProximo(no);
        */
        if(topo == null){
        topo = no;
        
        }
        else{
            no.setProximo(topo);
            topo = no;
            
            
           
    }}
    public void excluir() {
        
    if (topo != null) { 
        aux = topo.getProximo();
        topo = aux;
        
        
    } else {
        
    }
}

    public void mostrar(){
        Node no = topo;
        System.out.println(no.getInfo());
        while(no.getProximo() != null){
            no = no.getProximo();
            System.out.println(no.getInfo());
        }
    }

}

