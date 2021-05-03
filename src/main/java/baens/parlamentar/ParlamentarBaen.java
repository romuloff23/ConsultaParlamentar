/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.parlamentar;

import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import model.Consulta;
import model.Deputados;

/**
 *
 * @author Rômulo Farias
 */
@Named
public class ParlamentarBaen implements Serializable {

    private List<Deputados> allParlamentar;

    public List<Deputados> getAllParlamentar() {
        Consulta consulta = new Consulta();
        allParlamentar = consulta.getDeputados();
        return allParlamentar;
    }

    public String irParaPerfil(Deputados a){
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("deputado", a);
        return "perfil?faces-redirect=true";
    }
}
