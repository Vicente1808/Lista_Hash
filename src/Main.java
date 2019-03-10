/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 05664790954
 */
public class Main {
    public static void main(String[] args) {

        ListaHash lista = new ListaHash(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(24);
        lista.inserir(26);
        lista.inserir(28);
        lista.inserir(29);
        lista.inserir(27);
        lista.inserir(25);
        lista.inserir(23);
        lista.inserir(21);
        lista.inserir(38);
        lista.inserir(48);
        lista.inserir(46);
        lista.inserir(44);
        lista.inserir(40);

        //System.out.println(lista.exibeLista());


        System.out.println(lista.excluir(25));
        System.out.println(lista.excluir(24));
        System.out.println(lista.excluir(44));

        System.out.println(lista.exibeLista());
    }
}
