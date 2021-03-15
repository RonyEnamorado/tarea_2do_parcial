
package tarea_2do_parcial;


public class Farmacia extends Hospital{
   private String Encargado_farmacia;
    private Double cantidad_medicamentos;
    private int Num_cajas;
   
    public Farmacia(){}
    public Farmacia( String Encargado,double Cantidad_medicamento,int Num_cajas,String direccion,String Color,String Nom_farmacia ){
    this.Encargado_farmacia=Encargado;
    this.cantidad_medicamentos=Cantidad_medicamento;
    this.Num_cajas=Num_cajas;
    super.setDireccion(direccion);
    super.setColor_edificio(Color);
    super.setNombre_edificio(Nom_farmacia);
    
    }
    public String getEncargado_farmacia() {
        return Encargado_farmacia;
    }

 
    public void setEncargado_farmacia(String Encargado_farmacia) {
        this.Encargado_farmacia = Encargado_farmacia;
    }

   
    public double getCantidad_medicamentos() {
        return cantidad_medicamentos;
    }

  
    public void setCantidad_medicamentos(double cantidad_medicamentos) {
        this.cantidad_medicamentos = cantidad_medicamentos;
    }

  
    public int getNum_cajas() {
        return Num_cajas;
    }

   
    public void setNum_cajas(int Num_cajas) {
        this.Num_cajas = Num_cajas;
    }

    public void farmacia(){
        System.out.println("Farmacia : "+super.getNombre_edificio());
        System.out.println("Encargado: "+getEncargado_farmacia());
        System.out.println("Numero de Caja: "+getNum_cajas());
        System.out.println("Numero de Medicamentos en Existencia: "+getCantidad_medicamentos());
        Direccion_edificio();
    }
}
