package ConcreteBanco;

import SupportBanco.SupportBanco;
import Bancooo.Request;
import Bancooo.RequestType;

public class VicepresidenteSupport extends SupportBanco{
     public VicepresidenteSupport(){
    super(RequestType.VICEPRESIDENTE);
    }
    
     @Override
    protected void processRequest(Request request) {
       System.out.println("Vicepresidente procesó: "+ request.getDescription());
    }

   @Override
   protected String getBancoName() {
       return "Vicepresidente";
    }
    
}
