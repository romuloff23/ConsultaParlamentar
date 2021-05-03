/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.parlamentar;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import model.Consulta;
import model.Deputados;

/**
 *
 * @author romulo
 */
@Named
public final class PerfilParlamentarBean implements Serializable  {

    private Deputados parlamentar;
    
    @PostConstruct
    public void init() {
        parlamentar = (Deputados) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("deputado");
    }
    
    

    public Deputados getParlamentar() {
        return parlamentar;
    }

    public void setParlamentar(Deputados parlamentar) {
        this.parlamentar = parlamentar;
    }
   
}
