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
public class CajeroSupport extends SupportBanco{
     public CajeroSupport(){
    super(RequestType.Cajero);
    }

     @Override
    protected String getBancoName() {
       return "Cajero";
    }

     @Override
    protected void processRequest(RuntimeNode.Request request) {
       System.out.println("Cajero proceso"+request.getDescription());
    }
    
}
