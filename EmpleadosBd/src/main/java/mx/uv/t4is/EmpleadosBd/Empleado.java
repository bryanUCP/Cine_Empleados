package mx.uv.t4is.EmpleadosBd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String Nombre;
    private String Apellido;
    private String FechaNacimiento;    
    private String Direccion;
    private String Telefono;
    private String Sexo;
    private String EstadoCivil;


    public Empleado() {
    }
    

    public Empleado(int id, String Nombre, String Apellido, String FechaNacimiento, String Direccion, String Telefono, String Sexo, String EstadoCivil) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return this.FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento ) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    
    public String getEstadoCivil() {
        return this.EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}
