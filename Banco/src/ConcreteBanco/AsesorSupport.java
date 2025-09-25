package ConcreteBanco;

import SupportBanco.SupportBanco;
import Bancooo.Request;
import Bancooo.RequestType;

public class AsesorSupport extends SupportBanco{
     public AsesorSupport(){
         super(RequestType.ASESOR);
    }

   @Override
   protected void processRequest(Request request) {
       System.out.println("Asesor procesó: "+ request.getDescription());
    }

   @Override
   protected String getBancoName() {
       return "Asesor";
    } 
}
