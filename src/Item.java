/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 05664790954
 */
public class Item {

    private int valor;
    private Item proximo;
    private Item anterior;

    public Item getProximo() {
        return proximo;
    }

    public void setProximo(Item proximo) {
        this.proximo = proximo;
    }

    public Item getAnterior() {
        return anterior;
    }

    public void setAnterior(Item anterior) {
        this.anterior = anterior;
    }

    Item(int valor){
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
