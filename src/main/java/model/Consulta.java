/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author romulo
 */

public class Consulta {
    
    public List<Deputados> getDeputados(){
        Gson gson = new Gson();
        Client cliente = ClientBuilder.newClient();
        Response response = cliente.target("https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome")
            .request(MediaType.APPLICATION_JSON_TYPE)
            .header("Accept", "application/json").get();
        Deputados deputado = gson.fromJson(response.readEntity(String.class),Deputados.class );
        return deputado.getDados();
    }
    
}

