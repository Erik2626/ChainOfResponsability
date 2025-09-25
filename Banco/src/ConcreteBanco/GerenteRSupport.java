package ConcreteBanco;

import SupportBanco.SupportBanco;
import Bancooo.Request; 
import Bancooo.RequestType;

public class GerenteRSupport extends SupportBanco{
   public GerenteRSupport(){
      super(RequestType.GERENTEREGIONAL);
    }

   @Override
   protected void processRequest(Request request) {
       System.out.println("Gerente Regional procesó: "+ request.getDescription());
    }
    
   @Override
   protected String getBancoName() {
       return "Gerente Regional";
    }
}
