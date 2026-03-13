package com.joeychang.metmuseum;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joeychang.persistence.MetMuseum;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class MetMuseumDao {

    MetMuseum getArtPiece() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://collectionapi.metmuseum.org/public/collection/v1/objects/45734");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        MetMuseum artpiece = null;
        try {
            artpiece = mapper.readValue(response, MetMuseum.class);

        } catch (JsonProcessingException e) {
            // logger.error("This is an error: {}");
            e.printStackTrace();
        }
        return artpiece;
    }
}
