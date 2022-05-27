//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.18 a las 12:17:47 AM CDT 
//


package https.t4is_uv_mx.empleados;

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
 *         &lt;element name="RNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RDireccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RTelefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RSexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "rNombre",
    "rApellido",
    "rFechaNacimiento",
    "rDireccion",
    "rTelefono",
    "rSexo",
    "rEstadoCivil"
})
@XmlRootElement(name = "RegistrarEmpleadoResponse")
public class RegistrarEmpleadoResponse {

    @XmlElement(name = "RNombre", required = true)
    protected String rNombre;
    @XmlElement(name = "RApellido", required = true)
    protected String rApellido;
    @XmlElement(name = "RFechaNacimiento", required = true)
    protected String rFechaNacimiento;
    @XmlElement(name = "RDireccion", required = true)
    protected String rDireccion;
    @XmlElement(name = "RTelefono", required = true)
    protected String rTelefono;
    @XmlElement(name = "RSexo", required = true)
    protected String rSexo;
    @XmlElement(name = "REstadoCivil", required = true)
    protected String rEstadoCivil;

    /**
     * Obtiene el valor de la propiedad rNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNombre() {
        return rNombre;
    }

    /**
     * Define el valor de la propiedad rNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNombre(String value) {
        this.rNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad rApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRApellido() {
        return rApellido;
    }

    /**
     * Define el valor de la propiedad rApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRApellido(String value) {
        this.rApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad rFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFechaNacimiento() {
        return rFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad rFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFechaNacimiento(String value) {
        this.rFechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad rDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDireccion() {
        return rDireccion;
    }

    /**
     * Define el valor de la propiedad rDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDireccion(String value) {
        this.rDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad rTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTelefono() {
        return rTelefono;
    }

    /**
     * Define el valor de la propiedad rTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTelefono(String value) {
        this.rTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad rSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSexo() {
        return rSexo;
    }

    /**
     * Define el valor de la propiedad rSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSexo(String value) {
        this.rSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad rEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREstadoCivil() {
        return rEstadoCivil;
    }

    /**
     * Define el valor de la propiedad rEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREstadoCivil(String value) {
        this.rEstadoCivil = value;
    }

}
