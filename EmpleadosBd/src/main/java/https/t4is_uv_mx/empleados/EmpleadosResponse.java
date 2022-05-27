//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.18 a las 12:17:47 AM CDT 
//


package https.t4is_uv_mx.empleados;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Empleados" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "empleados"
})
@XmlRootElement(name = "EmpleadosResponse")
public class EmpleadosResponse {

    @XmlElement(name = "Empleados", required = true)
    protected List<EmpleadosResponse.Empleados> empleados;

    /**
     * Gets the value of the empleados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empleados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpleados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpleadosResponse.Empleados }
     * 
     * 
     */
    public List<EmpleadosResponse.Empleados> getEmpleados() {
        if (empleados == null) {
            empleados = new ArrayList<EmpleadosResponse.Empleados>();
        }
        return this.empleados;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "nombre",
        "apellido",
        "fechaNacimiento",
        "direccion",
        "telefono",
        "sexo",
        "estadoCivil"
    })
    public static class Empleados {

        protected int id;
        @XmlElement(name = "Nombre", required = true)
        protected String nombre;
        @XmlElement(name = "Apellido", required = true)
        protected String apellido;
        @XmlElement(name = "FechaNacimiento", required = true)
        protected String fechaNacimiento;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;
        @XmlElement(name = "Telefono", required = true)
        protected String telefono;
        @XmlElement(name = "Sexo", required = true)
        protected String sexo;
        @XmlElement(name = "EstadoCivil", required = true)
        protected String estadoCivil;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad apellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellido() {
            return apellido;
        }

        /**
         * Define el valor de la propiedad apellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellido(String value) {
            this.apellido = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaNacimiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        /**
         * Define el valor de la propiedad fechaNacimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaNacimiento(String value) {
            this.fechaNacimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
        }

        /**
         * Obtiene el valor de la propiedad sexo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSexo() {
            return sexo;
        }

        /**
         * Define el valor de la propiedad sexo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSexo(String value) {
            this.sexo = value;
        }

        /**
         * Obtiene el valor de la propiedad estadoCivil.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstadoCivil() {
            return estadoCivil;
        }

        /**
         * Define el valor de la propiedad estadoCivil.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstadoCivil(String value) {
            this.estadoCivil = value;
        }

    }

}
