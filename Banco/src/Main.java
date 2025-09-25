import Bancooo.Banco;
import Bancooo.Request;
import Bancooo.RequestType;
import ConcreteBanco.AsesorSupport;
import ConcreteBanco.CajeroSupport;
import ConcreteBanco.GerenteRSupport;
import ConcreteBanco.GerenteSSupport;
import ConcreteBanco.VicepresidenteSupport;

public class Main {
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
            new Request(RequestType.CAJERO,"Consulta saldo"),
            new Request(RequestType.ASESOR,"Apertura de cuenta"),
            new Request(RequestType.GERENTESUCURSAL,"Prestamos Hipotecarios"),
            new Request(RequestType.GERENTEREGIONAL,"Creditos Corporativos"),
            new Request(RequestType.VICEPRESIDENTE,"Politicas institucionales")
      };
    
      for (int i = 0;i < request.length; i++){
            System.out.println(request[i]);
            cajero.bancoRequest(request[i]);
            System.out.println();
      }

        Banco onlyCajero = new CajeroSupport();
        Banco onlyAsesor = new AsesorSupport();
        Banco onlyGerenteS = new GerenteSSupport();
        Banco onlyGerenteR = new GerenteRSupport();
        Banco onlyVicepresidente = new VicepresidenteSupport();

        onlyCajero.setNext(onlyAsesor);
        onlyAsesor.setNext(onlyGerenteS);
        onlyGerenteS.setNext(onlyGerenteR);
        onlyGerenteR.setNext(onlyVicepresidente);

        Request cajeroRequest = new Request(RequestType.CAJERO, "Consulta de saldo");
        Request asesorRequest = new Request(RequestType.ASESOR, "Apertura de cuenta");
        Request gerenteSRequest = new Request(RequestType.GERENTESUCURSAL, "Prestamos Hipotecarios");
        Request gerenteRRequest = new Request(RequestType.GERENTEREGIONAL, "Creditos Corporativos");
        Request vicepresidenteRequest = new Request(RequestType.VICEPRESIDENTE, "Politicas institucionales");

        System.out.println(cajeroRequest);
        System.out.println(asesorRequest);
        System.out.println(gerenteSRequest);
        System.out.println(gerenteRRequest);
        System.out.println(vicepresidenteRequest);
    }
}

    
    

