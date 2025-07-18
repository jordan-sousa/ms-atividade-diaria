package com.jordan.art.controller;

import com.jordan.art.dto.ArtDTO;
import com.jordan.art.service.ArtService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/arts")
@RequiredArgsConstructor
public class ArtController {

    private final ArtService artService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtDTO createArt(@RequestBody ArtDTO artDTO) {
        return artService.createArt(artDTO);
    }

    @GetMapping
    public List<ArtDTO> getAllArts() {
        return artService.getAllArts();
    }

    @GetMapping("/{id}")
    public ArtDTO getArtById(@PathVariable UUID id) {
        return artService.getArtById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArt(@PathVariable UUID id) {
        artService.deleteArt(id);
    }

    @PutMapping("/{id}")
    public ArtDTO updateArt(@PathVariable UUID id, @RequestBody @Valid ArtDTO dto) {
        return artService.updateArt(id, dto);
    }

//    @GetMapping("/user/{userId}")
//    public List<ArtDTO> getArtsByUserId(@PathVariable UUID userId) {
//        return artService.getArtsByUserId(userId);
//    }

}
