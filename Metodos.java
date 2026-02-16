import java.util.Scanner;

public class Metodos {
    Scanner sc =new Scanner(System.in);
    public Objvehiculo[] LllenarRegistros(Objvehiculo[] r)
    {
        for (int i = 0; i < r.length; i++ ){
            Objvehiculo o = new Objvehiculo();
            System.out.println("Ingrese la marca");
            o.setMarca(sc.next());
            System.out.println("Ingrese tipo vehiculo");
            o.setTipo(sc.next());
            System.out.println("Ingrese el cilindraje");
            o.setCilindraje(sc.nextInt());
            if (o.getCilindraje() > 900 && o.getCilindraje() < 1700) {
                o.setPagoAnterior( 150.000);
                
            } else if (o.getCilindraje() >= 1700 && o.getCilindraje() < 2000) {
                o.setPagoAnterior( 200.000);
            } else {
                o.setPagoAnterior( 250.000);
                
            }
            o.setNumeroCelda(i + 1);
            r[i] = o;
        }
        return r;
    }
    public Objvehiculo[] CalcularNuevopago(Objvehiculo[] r)
    {
        for (int i = 0; i < r.length; i++) {
            r[i].setPagoActual(r[i].getPagoAnterior() * 1.23);
            
        }
        return r;
    }
    public void Mostrarregistros(Objvehiculo[] r){
        for (int i = 0; i < r.length ; i++) {
            System.out.println("Marca: " + r[i].getMarca());
            System.out.println("TipoVehiculo: " + r[i].getTipo());
            System.err.println("Cilindraje: " + r[i].getCilindraje());
            System.out.println("PagoAnterior: " + r[i].getPagoAnterior());
            System.out.println("PagoActual: " + r[i].getPagoActual());
            System.out.println("Numero de celda: " + r[i].getNumeroCelda());
            System.out.println("-----------------------------------");
            
        }
    }
}
