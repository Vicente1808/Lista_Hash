/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Tabelas HASH
 * @author Pablo Vicente
 */
public class ListaHash {

    Item[] lista;
    int grupos;


    ListaHash(int grupos){
        lista = new Item[grupos];
        this.grupos=grupos;
    }



    public Item buscar(int valor){
        Item retorno =null;
        int resto = valor%grupos;
        Item temp = lista[resto];
        Item primeiro = lista[resto];

        if(primeiro!=null){
            if(primeiro.getValor()==valor){
                retorno = primeiro;
            }else{
                temp=temp.getProximo();
                while(temp!=primeiro){
                    if(temp.getValor()==valor){
                        retorno = temp;
                    }else{
                        temp=temp.getProximo();
                    }
                }
            }
        }


        return retorno;
    }

    public String inserir(int valor){
        String retorno = "Valor inserido com sucesso!";
        int resto = valor%grupos;
        Item novo = new Item(valor);

        if(buscar(valor)!=null){
            retorno = "Valor duplicado. Já encontra-se na tabela!";
        }else{
            if(lista[resto]==null){
                lista[resto]=novo;
                novo.setAnterior(novo);
                novo.setProximo(novo);
            }else{
                Item atual = lista[resto];
                Item ultimo = atual.getAnterior();
                atual.setAnterior(novo);
                ultimo.setProximo(novo);
                novo.setAnterior(ultimo);
                novo.setProximo(atual);
            }
        }
        return retorno;
    }

    public String excluir(int valor){
        String retorno= "Valor não encontrado na tabela!";
        int resto = valor%grupos;
        Item temp = lista[resto];
        Item primeiro = lista[resto];
        Item ultimo = primeiro.getAnterior();

        if(primeiro.getValor()==valor){
            if(primeiro.getProximo().getValor()==valor){
                lista[resto]=null;
            }else{
                Item proximo = primeiro.getProximo();
                proximo.setAnterior(ultimo);
                ultimo.setProximo(proximo);
                lista[resto]=proximo;
            }
            retorno = "Valor: "+valor +" excluido com sucessor!";
        }else{
            temp=primeiro.getProximo();
            while(temp!=primeiro){
                if(temp.getValor()==valor){
                    Item anterior = temp.getAnterior();
                    Item proximo = temp.getProximo();
                    anterior.setProximo(proximo);
                    proximo.setAnterior(anterior);
                    retorno = "Valor: "+valor +" excluido com sucessor!";
                    temp=temp.getProximo();
                }else{
                    temp=temp.getProximo();
                }
            }
        }

        return retorno;
    }

    public String exibeLista(){
        String retorno= "";

        for(int i =0;i<grupos;i++){
            Item primeiro = lista[i];
            Item temp = lista[i];

            if(primeiro == null){
                if(retorno.equals("")){
                    retorno = "ND |\n";
                }else{
                    retorno = retorno+ "ND |";
                }
            }else if(retorno.equals("")){
                retorno = primeiro.getValor()+" |";
                temp=temp.getProximo();
            }else{
                retorno = retorno + primeiro.getValor()+" |";
                temp=temp.getProximo();
            }

            while(temp!=primeiro){
                if(retorno.equals("")){
                    retorno = temp.getValor()+" |";
                    temp=temp.getProximo();
                }else{
                    retorno = retorno + temp.getValor()+" |";
                    temp=temp.getProximo();
                }
            }
            retorno = retorno +"\n"; //Quebra cada indice do array
        }
        return retorno;
    }
}
