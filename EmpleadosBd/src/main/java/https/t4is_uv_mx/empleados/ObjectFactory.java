//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.18 a las 12:17:47 AM CDT 
//


package https.t4is_uv_mx.empleados;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.empleados package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpleadosRequest_QNAME = new QName("https://t4is.uv.mx/Empleados", "EmpleadosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.empleados
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpleadosResponse }
     * 
     */
    public EmpleadosResponse createEmpleadosResponse() {
        return new EmpleadosResponse();
    }

    /**
     * Create an instance of {@link EliminarEmpleadoResponse }
     * 
     */
    public EliminarEmpleadoResponse createEliminarEmpleadoResponse() {
        return new EliminarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link RegistrarEmpleadoRequest }
     * 
     */
    public RegistrarEmpleadoRequest createRegistrarEmpleadoRequest() {
        return new RegistrarEmpleadoRequest();
    }

    /**
     * Create an instance of {@link RegistrarEmpleadoResponse }
     * 
     */
    public RegistrarEmpleadoResponse createRegistrarEmpleadoResponse() {
        return new RegistrarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link EmpleadosResponse.Empleados }
     * 
     */
    public EmpleadosResponse.Empleados createEmpleadosResponseEmpleados() {
        return new EmpleadosResponse.Empleados();
    }

    /**
     * Create an instance of {@link ModificarEmpleadoRequest }
     * 
     */
    public ModificarEmpleadoRequest createModificarEmpleadoRequest() {
        return new ModificarEmpleadoRequest();
    }

    /**
     * Create an instance of {@link ModificarEmpleadoResponse }
     * 
     */
    public ModificarEmpleadoResponse createModificarEmpleadoResponse() {
        return new ModificarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link EliminarEmpleadoRequest }
     * 
     */
    public EliminarEmpleadoRequest createEliminarEmpleadoRequest() {
        return new EliminarEmpleadoRequest();
    }

    /**
     * Create an instance of {@link EliminarEmpleadoResponse.Empleado }
     * 
     */
    public EliminarEmpleadoResponse.Empleado createEliminarEmpleadoResponseEmpleado() {
        return new EliminarEmpleadoResponse.Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/Empleados", name = "EmpleadosRequest")
    public JAXBElement<Object> createEmpleadosRequest(Object value) {
        return new JAXBElement<Object>(_EmpleadosRequest_QNAME, Object.class, null, value);
    }

}
