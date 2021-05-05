/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.parlamentar;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import model.Consulta;
import model.Deputados;

/**
 *
 * @author romulo
 */
@Named
@RequestScoped
public class PerfilParlamentarBean implements Serializable  {

    private Deputados parlamentar;

    public Deputados getParlamentar() {
        return parlamentar;
    }

    public void setParlamentar(Deputados parlamentar) {
        this.parlamentar = parlamentar;
    }
   
}
