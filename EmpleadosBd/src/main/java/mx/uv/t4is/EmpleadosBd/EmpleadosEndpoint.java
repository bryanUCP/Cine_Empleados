package mx.uv.t4is.EmpleadosBd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import https.t4is_uv_mx.empleados.EmpleadosResponse;
import https.t4is_uv_mx.empleados.RegistrarEmpleadoRequest;
import https.t4is_uv_mx.empleados.RegistrarEmpleadoResponse;

import https.t4is_uv_mx.empleados.EliminarEmpleadoRequest;
import https.t4is_uv_mx.empleados.EliminarEmpleadoResponse;

import https.t4is_uv_mx.empleados.ModificarEmpleadoRequest;
import https.t4is_uv_mx.empleados.ModificarEmpleadoResponse;

@Endpoint
public class EmpleadosEndpoint {

    //int contadorId = 1 ;
    //List<Agenda> eventos = new ArrayList<>();

    @Autowired
    IEmpleado iempleado;

    //--------------------------------------------------------------------------------------------------------
    /*En esta parte recibimos los datos del xsd para la accion de registrar, los guardamos en la base de datos y despues los mostramos en pantalla
    con la parte del response*/

    @PayloadRoot(localPart = "RegistrarEmpleadoRequest", namespace = "https://t4is.uv.mx/Empleados")
    @ResponsePayload
    public RegistrarEmpleadoResponse RegistrarEmpleado(@RequestPayload RegistrarEmpleadoRequest peticion) {
        RegistrarEmpleadoResponse respuesta = new RegistrarEmpleadoResponse();

        respuesta.setRNombre(peticion.getNombre());
        respuesta.setRApellido(peticion.getApellido());
        respuesta.setRFechaNacimiento(peticion.getFechaNacimiento());
        respuesta.setRDireccion(peticion.getDireccion());
        respuesta.setRTelefono(peticion.getTelefono());
        respuesta.setRSexo(peticion.getSexo());
        respuesta.setREstadoCivil(peticion.getEstadoCivil());

        Empleado empleado = new Empleado();

        empleado.setNombre(peticion.getNombre());
        empleado.setApellido(peticion.getApellido());
        empleado.setFechaNacimiento(peticion.getFechaNacimiento());
        empleado.setDireccion(peticion.getDireccion());
        empleado.setTelefono(peticion.getTelefono());
        empleado.setSexo(peticion.getSexo());
        empleado.setEstadoCivil(peticion.getEstadoCivil());

        iempleado.save(empleado);
        return respuesta;
    }

    //------------------------------------------------------------------------

    /* En esta parte no recibimos nada del xsd pero mostramos los datos de los eventos registrados en la base de datos
    en pantalla con EventosResponse*/

    @PayloadRoot(localPart = "EmpleadosRequest", namespace = "https://t4is.uv.mx/Empleados")
    @ResponsePayload
    public EmpleadosResponse Eventos(){
        EmpleadosResponse respuesta = new EmpleadosResponse();
        Iterable<Empleado> lista = iempleado.findAll();
        for (Empleado empleado : lista) {
            EmpleadosResponse.Empleados EmpleadoBuscar = new EmpleadosResponse.Empleados();

            EmpleadoBuscar.setId(empleado.getId());
            EmpleadoBuscar.setNombre(empleado.getNombre());
            EmpleadoBuscar.setApellido(empleado.getApellido());
            EmpleadoBuscar.setFechaNacimiento(empleado.getFechaNacimiento());
            EmpleadoBuscar.setDireccion(empleado.getDireccion());
            EmpleadoBuscar.setTelefono(empleado.getTelefono());
            EmpleadoBuscar.setSexo(empleado.getSexo());
            EmpleadoBuscar.setEstadoCivil(empleado.getEstadoCivil());

            respuesta.getEmpleados().add(EmpleadoBuscar);
        }
        return respuesta;
    }

    //------------------------------------------------------------------------

    /*En esta parte hacemos la accion de modificar eventos, introducimos el id del evento que queremos modificar y tambien los datos nuevos,
    se guardan los datos en la base de datos y despues se muestran con el ModificarEventoResponse*/

    @PayloadRoot(localPart = "ModificarEmpleadoRequest", namespace = "https://t4is.uv.mx/Empleados")
    @ResponsePayload
    public ModificarEmpleadoResponse modificarEmpleado(@RequestPayload ModificarEmpleadoRequest peticion){
        ModificarEmpleadoResponse respuesta = new ModificarEmpleadoResponse();

        Empleado empleado = new Empleado();

        /*if(!eventos.isEmpty()){ 
            for (Agenda EventoModificar : eventos) { 
                if(EventoModificar.getId() == peticion.getId()){ 
                    EventoModificar.setFLimite(peticion.getNuevaFLimite()); 
                    respuesta.setId(peticion.getId()); 
                    respuesta.setFLimite(peticion.getNuevaFLimite());
                }
            }
        }*/

        empleado.setId(peticion.getId());
        empleado.setNombre(peticion.getNuevoNombre());
        empleado.setApellido(peticion.getNuevoApellido());
        empleado.setFechaNacimiento(peticion.getNuevaFechaNacimiento());
        empleado.setDireccion(peticion.getNuevaDireccion());
        empleado.setTelefono(peticion.getNuevoTelefono());
        empleado.setSexo(peticion.getNuevoSexo());
        empleado.setEstadoCivil(peticion.getNuevoEstadoCivil());

        iempleado.save(empleado);

        respuesta.setId(peticion.getId()); 
        respuesta.setNombre(peticion.getNuevoNombre());
        respuesta.setApellido(peticion.getNuevoApellido());
        respuesta.setFechaNacimiento(peticion.getNuevaFechaNacimiento());
        respuesta.setDireccion(peticion.getNuevaDireccion());
        respuesta.setTelefono(peticion.getNuevoTelefono());
        respuesta.setSexo(peticion.getNuevoSexo());
        respuesta.setEstadoCivil(peticion.getNuevoEstadoCivil());

        return respuesta;
    }

    //-----------------------------------------------------------------------------

    /*En esta parte modificamos un evento mediante su id, introducimos el id del evento a eliminar en el Request, lo borra en la base de datos y
    despues mostramos la lista de eventos de la base pero ya actualizada con el evento ya borrado. eso se muestra con el Response*/

    @PayloadRoot(localPart = "EliminarEmpleadoRequest", namespace = "https://t4is.uv.mx/Empleados")
    @ResponsePayload
    public EliminarEmpleadoResponse borrarEmpleado(@RequestPayload EliminarEmpleadoRequest peticion){
        //int indexDelElementoABorrar = 0;
        //boolean elementoEncontrado = false;
        EliminarEmpleadoResponse respuesta = new EliminarEmpleadoResponse();
        respuesta.getEmpleado().clear();
        /*if(!eventos.isEmpty()){
            for (Agenda EventoBorrar : eventos) {
                if(EventoBorrar.getId() == peticion.getId()){
                    indexDelElementoABorrar = eventos.indexOf(EventoBorrar);
                    elementoEncontrado = true;
                   
                }
            }
            if (elementoEncontrado){
                eventos.remove(indexDelElementoABorrar);
            }
            for (Agenda agenda : eventos) {
                EliminarEventoResponse.Agenda EventoNoEliminado = new EliminarEventoResponse.Agenda();
                EventoNoEliminado.setId(agenda.getId());
                EventoNoEliminado.setNombre(agenda.getNombre());
                EventoNoEliminado.setFInicio(agenda.getFInicio());
                EventoNoEliminado.setFLimite(agenda.getFLimite());
                EventoNoEliminado.setDescripcion(agenda.getDescripcion());
                respuesta.getAgenda().add(EventoNoEliminado);
            }
        }*/

        //Eliminar datos en la base de datos de la tabla agenda
        iempleado.deleteById(peticion.getId());

        Iterable<Empleado> lista = iempleado.findAll();
        for (Empleado empleado : lista) {
            EliminarEmpleadoResponse.Empleado EmpleadoEliminar = new EliminarEmpleadoResponse.Empleado();
            
            
            EmpleadoEliminar.setId(empleado.getId()); 
            EmpleadoEliminar.setNombre(empleado.getNombre());
            EmpleadoEliminar.setApellido(empleado.getApellido());
            EmpleadoEliminar.setFechaNacimiento(empleado.getFechaNacimiento());
            EmpleadoEliminar.setDireccion(empleado.getDireccion());
            EmpleadoEliminar.setTelefono(empleado.getTelefono());
            EmpleadoEliminar.setSexo(empleado.getSexo());
            EmpleadoEliminar.setEstadoCivil(empleado.getEstadoCivil());

            respuesta.getEmpleado().add(EmpleadoEliminar);
            
        }

        return respuesta;

    }


}
