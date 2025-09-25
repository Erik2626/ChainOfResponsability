package ConcreteBanco;

import SupportBanco.SupportBanco;
import Bancooo.Request;
import Bancooo.RequestType;

public class GerenteSSupport extends SupportBanco{

   public GerenteSSupport(){
      super(RequestType.GERENTESUCURSAL);
    }

    @Override
    protected void processRequest(Request request) {
       System.out.println("Gerente de sucursal procesó: "+ request.getDescription());
    }
    
   @Override
   protected String getBancoName() {
       return "Gerente de Sucursal";
    }
}
