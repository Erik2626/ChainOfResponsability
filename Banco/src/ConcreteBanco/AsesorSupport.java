/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteBanco;

import SupportBanco.SupportBanco;
import jdk.nashorn.internal.ir.RuntimeNode;

/**
 *
 * @author ESTACION
 */
public class AsesorSupport extends SupportBanco{
     public AsesorSupport(){
    super(RequestType.Asesor);
    }

  
     @Override
    protected String getBancoName() {
       return "Asesor";
    }

    
     @Override
    protected void processRequest(RuntimeNode.Request request) {
       System.out.println("Asesor proceso"+request.getDescription());
    }
    
}
