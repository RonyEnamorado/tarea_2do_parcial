
package tarea_2do_parcial;


public class Hospital {


  private int Num_pisos;
    private String Color_edificio;
    private String Direccion;
    private int Num_oficina;
    private String Nombre_edificio;
    
    public Hospital(){}
    public Hospital(int Num_pisos,String Color,String Direccion,int Num_oficina, String Nombre_edificio){
    
        this.Color_edificio=Color;
        this.Direccion=Direccion;
        this.Nombre_edificio=Nombre_edificio;
        this.Num_oficina=Num_oficina;
        this.Num_pisos=Num_pisos;
    
    }
 
    public String getNombre_edificio() {
        return Nombre_edificio;
    }

 
    public void setNombre_edificio(String Nombre_edificio) {
        this.Nombre_edificio = Nombre_edificio;
    }

    public int getNum_pisos() {
        return Num_pisos;
    }

   
    public void setNum_pisos(int Num_pisos) {
        this.Num_pisos = Num_pisos;
    }


    public String getColor_edificio() {
        return Color_edificio;
    }

 
    public void setColor_edificio(String Color_edificio) {
        this.Color_edificio = Color_edificio;
    }


    public String getDireccion() {
        return Direccion;
    }

  
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


    public int getNum_oficina() {
        return Num_oficina;
    }


    public void setNum_oficina(int Num_oficina) {
        this.Num_oficina = Num_oficina;
    }
 
    public void hospital(){
    
        System.out.println("Hospital: "+getNombre_edificio());
        System.out.println("Cantidad de pisos: "+getNum_pisos());
        System.out.println("Numero de Clinicas: "+getNum_oficina());
        Direccion_edificio();
    
    }
    public void Direccion_edificio(){
    
         System.out.println("Direccion del Edificio: "+getDireccion());
         System.out.println("Color del Edificio: "+getColor_edificio());
    
    }
  
}
