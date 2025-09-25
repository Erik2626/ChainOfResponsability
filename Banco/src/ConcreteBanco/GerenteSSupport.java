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
public class GerenteSSupport extends SupportBanco{
    public GerenteSSupport(){
    super(RequestType.GerenteSucursal);
    }

    @Override
    protected String getBancoName() {
       return "Gerente de Sucursal";
    }

    @Override
    protected void processRequest(RuntimeNode.Request request) {
       System.out.println("Gerente de sucursal proceso"+request.getDescription());
    }
    
}
