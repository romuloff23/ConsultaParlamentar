/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.parlamentar;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Consulta;
import model.Deputados;

/**
 *
 * @author Rômulo Farias
 */
@Named
@SessionScoped
public class ParlamentarBaen implements Serializable {

    private List<Deputados> allParlamentar;
    private Deputados deputadoSelecionado;

    public Deputados getDeputadoSelecionado() {
        return deputadoSelecionado;
    }

    public void setDeputadoSelecionado(Deputados deputadoSelecionado) {
        this.deputadoSelecionado = deputadoSelecionado;
    }
    
    
    public List<Deputados> getAllParlamentar() {
        Consulta consulta = new Consulta();
        allParlamentar = consulta.getDeputados();
        return allParlamentar;
    }

    public String irPergil(Deputados deputadoSelecionado){
        this.deputadoSelecionado = deputadoSelecionado;
        return "perfil?faces-redirect=true";
    }
}
