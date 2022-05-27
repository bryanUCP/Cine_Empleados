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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nuevoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevaFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevaDireccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevoTelefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevoSexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevoEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nuevoNombre",
    "nuevoApellido",
    "nuevaFechaNacimiento",
    "nuevaDireccion",
    "nuevoTelefono",
    "nuevoSexo",
    "nuevoEstadoCivil"
})
@XmlRootElement(name = "ModificarEmpleadoRequest")
public class ModificarEmpleadoRequest {

    protected int id;
    @XmlElement(required = true)
    protected String nuevoNombre;
    @XmlElement(required = true)
    protected String nuevoApellido;
    @XmlElement(required = true)
    protected String nuevaFechaNacimiento;
    @XmlElement(required = true)
    protected String nuevaDireccion;
    @XmlElement(required = true)
    protected String nuevoTelefono;
    @XmlElement(required = true)
    protected String nuevoSexo;
    @XmlElement(required = true)
    protected String nuevoEstadoCivil;

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
     * Obtiene el valor de la propiedad nuevoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoNombre() {
        return nuevoNombre;
    }

    /**
     * Define el valor de la propiedad nuevoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoNombre(String value) {
        this.nuevoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoApellido() {
        return nuevoApellido;
    }

    /**
     * Define el valor de la propiedad nuevoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoApellido(String value) {
        this.nuevoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaFechaNacimiento() {
        return nuevaFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad nuevaFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaFechaNacimiento(String value) {
        this.nuevaFechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaDireccion() {
        return nuevaDireccion;
    }

    /**
     * Define el valor de la propiedad nuevaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaDireccion(String value) {
        this.nuevaDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoTelefono() {
        return nuevoTelefono;
    }

    /**
     * Define el valor de la propiedad nuevoTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoTelefono(String value) {
        this.nuevoTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoSexo() {
        return nuevoSexo;
    }

    /**
     * Define el valor de la propiedad nuevoSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoSexo(String value) {
        this.nuevoSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoEstadoCivil() {
        return nuevoEstadoCivil;
    }

    /**
     * Define el valor de la propiedad nuevoEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoEstadoCivil(String value) {
        this.nuevoEstadoCivil = value;
    }

}
