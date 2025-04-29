package com.jordan.art.service;

import com.jordan.art.dto.ArtDTO;

import java.util.List;
import java.util.UUID;

public interface ArtService {

    ArtDTO createArt(ArtDTO artDTO);
    List<ArtDTO> getAllArts();
    ArtDTO getArtById(UUID id);
    void deleteArt(UUID id);
}
