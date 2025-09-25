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
public class VicepresidenteSupport extends SupportBanco{
     public VicepresidenteSupport(){
    super(RequestType.Vicepresidente);
    }

   
     @Override
    protected String getBancoName() {
       return "Vicepresidente";
    }

    
     @Override
    protected void processRequest(RuntimeNode.Request request) {
       System.out.println("Vicepresidente proceso"+request.getDescription());
    }
    
}
