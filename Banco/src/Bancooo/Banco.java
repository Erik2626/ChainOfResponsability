package Bancooo;

public interface Banco {
    Banco setNext (Banco nextBanco);
    void bancoRequest(Request request);

    default boolean canBanco(Request request){
        return false;
    }
    Banco getNext();
}
