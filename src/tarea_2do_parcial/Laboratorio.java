
package tarea_2do_parcial;


public class Laboratorio extends Hospital {

    private String Nombre_doctor;
    private int num_examenes_entrega;
    
    public Laboratorio(){}
    public Laboratorio(String Doctor,int examenes_entre,String direccion,String Color,String Nom_laboratorio ){
    this.Nombre_doctor=Doctor;
    this.num_examenes_entrega=examenes_entre;
    super.setDireccion(direccion);
    super.setColor_edificio(Color);
    super.setNombre_edificio(Nom_laboratorio);
    }
    
    public String getNombre_doctor() {
        return Nombre_doctor;
    }

    
    public void setNombre_doctor(String Nombre_doctor) {
        this.Nombre_doctor = Nombre_doctor;
    }

   
    public int getNum_examenes_entrega() {
        return num_examenes_entrega;
    }

  
    public void setNum_examenes_entrega(int num_examenes_entrega) {
        this.num_examenes_entrega = num_examenes_entrega;
    }
   
       public void laboratorio(){
        System.out.println("Laboratorio : "+super.getNombre_edificio());
        System.out.println("Doctor : "+getNombre_doctor());
        System.out.println("Examenes para entregar: "+getNum_examenes_entrega());
        
        Direccion_edificio();
    }
}
