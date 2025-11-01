/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.mensajes.endpoint;

import java.net.URISyntaxException;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.common.exception.MessageResolver;
import mx.gob.imss.dpes.mensajes.model.Mensaje;
import org.eclipse.microprofile.openapi.annotations.Operation;

/**
 *
 * @author antonio
 */
@Path("/mensaje")
@RequestScoped
public class MensajeEndPoint {
  
  @GET  
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Operation(summary = "Obtener un mensaje por ID",
            description = "Obtener un mensaje por ID")
    public Response load(@PathParam("id") String id) throws URISyntaxException {

        Response response;                        
        
        Mensaje mensaje = new Mensaje();
        
        String msg = MessageResolver.getMessage(id, new Object[0]);        
        mensaje.setMensaje(msg);        
        response = Response.ok(mensaje).build();

        return response;
    }


}
