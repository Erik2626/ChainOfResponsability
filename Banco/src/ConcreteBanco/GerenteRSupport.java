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
public class GerenteRSupport extends SupportBanco{
     public GerenteRSupport(){
    super(RequestType.GerenteRegional);
    }

     @Override
    protected String getBancoName() {
       return "Gerente Regional";
    }

     @Override
        protected void processRequest(RuntimeNode.Request request) {
       System.out.println("Gerente Regional proceso"+request.getDescription());
    }
    
}
