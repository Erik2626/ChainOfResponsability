package SupportBanco;

import Bancooo.Banco;
import Bancooo.RequestType;
import Bancooo.Request;
 
public abstract class SupportBanco implements Banco{
    protected Banco nextBanco;
    protected RequestType supportedType;

    protected SupportBanco(RequestType supportedType){
        this.supportedType = supportedType;
    }

    @Override
    public Banco setNext(Banco nextBanco) {
        this.nextBanco = nextBanco;
        return this;
    }

    @Override
    public void bancoRequest(Request request) {
        if(canBanco(request)){
            processRequest(request);
        }else{
            passToNext(request);
        }
    }

    @Override
    public Banco getNext() {
      return this.nextBanco;
    }

    @Override
    public boolean canBanco(Request request) {
       return request.getType() == supportedType;
    }

    protected abstract void  processRequest(Request request);

    protected void passToNext(Request request){
        if(nextBanco !=null){
            System.out.println(getBancoName()+" no maneja solicitudes de "+ request.getType() + ", pasa solicitud.");
            nextBanco.bancoRequest(request);
        }else{
            System.out.println("La solicitud "+ request.getType()+ " no pudo ser procesada por ningun manejador.");
        }
    }
    
    
    protected String getBancoName(){
    return this.getClass().getSimpleName();
    }
}
