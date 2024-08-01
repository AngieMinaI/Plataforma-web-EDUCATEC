
package clases;

public class Pagos {
   private int id_pago;
   private int id_alumno;
   private int ciclo;
   private int nro_cuota;
   private double monto;
   private String fecha;

    public Pagos() {
    }

    public Pagos(int id_pago, int id_alumno, int ciclo, int nro_cuota, double monto, String fecha) {
        this.id_pago = id_pago;
        this.id_alumno = id_alumno;
        this.ciclo = ciclo;
        this.nro_cuota = nro_cuota;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getNro_cuota() {
        return nro_cuota;
    }

    public void setNro_cuota(int nro_cuota) {
        this.nro_cuota = nro_cuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }  
   
           
}
