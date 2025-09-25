package ConcreteBanco;

import SupportBanco.SupportBanco;
import Bancooo.Request;
import Bancooo.RequestType;

public class CajeroSupport extends SupportBanco{
   public CajeroSupport(){
      super(RequestType.CAJERO);
    }

   @Override
   protected void processRequest(Request request) {
       System.out.println("Cajero procesó: "+ request.getDescription());
    }

   @Override
   protected String getBancoName() {
       return "Cajero";
   }
}
