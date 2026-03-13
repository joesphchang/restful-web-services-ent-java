package com.joeychang.metmuseum;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.joeychang.persistence.MetMuseum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MetMuseumDaoTest {

    @Test
    void getArtPieceSuccess() throws JsonProcessingException {
        MetMuseumDao dao = new MetMuseumDao();
        assertEquals("Quail and Millet", dao.getArtPiece().getTitle());
    }
}