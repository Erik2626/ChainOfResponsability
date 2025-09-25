
import Bancooo.Banco;
import ConcreteBanco.AsesorSupport;
import ConcreteBanco.CajeroSupport;
import ConcreteBanco.GerenteRSupport;
import ConcreteBanco.GerenteSSupport;
import ConcreteBanco.VicepresidenteSupport;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ESTACION
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Banco cajero = new CajeroSupport();
      Banco gerentes = new GerenteSSupport();
      Banco vicepresidente = new VicepresidenteSupport();
      Banco gerenter = new GerenteRSupport();
      Banco asesor = new AsesorSupport();
      
      cajero.setNext(asesor);
      asesor.setNext(gerentes);
      gerentes.setNext(gerenter);
      gerenter.setNext(vicepresidente);
      Request [] request={
          new Request(RequestType.Cajero,"Consulta saldo");
           new Request(RequestType.Asesor,"Apertura de cuenta");
           new Request(RequestType.GerenteSucursal,"Prestamos Hipotecarios");
           new Request(RequestType.GerenteRegional,"Creditos Corporativos");
           new Request(RequestType.Vicepresidente,"Politicas institucionales");
      }
    for(int i=0,i<request.length; i++){
        System.out.println(request[i]);
        cajero.bancoRequest(request[i]);
        System.out.println();
}
    }
    
}
