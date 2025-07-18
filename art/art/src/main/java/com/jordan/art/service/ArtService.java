package com.jordan.art.service;

import com.jordan.art.dto.ArtDTO;

import java.util.List;
import java.util.UUID;

public interface ArtService {

    ArtDTO createArt(ArtDTO artDTO);

    List<ArtDTO> getAllArts();

    ArtDTO getArtById(UUID id);

    ArtDTO updateArt(UUID id, ArtDTO artDTO);

//    List<ArtDTO> getArtsByUserId(UUID userId);

    void deleteArt(UUID id);
}
