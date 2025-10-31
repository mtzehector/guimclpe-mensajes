/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.mensajes.model;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
/**
 *
 * @author antonio
 */
public class Mensaje extends IdentityBaseModel<String>{
  @Getter @Setter private String mensaje;  
}
