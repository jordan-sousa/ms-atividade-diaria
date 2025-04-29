package com.jordan.art.service;

import com.jordan.art.dto.ArtDTO;
import com.jordan.art.model.Art;
import com.jordan.art.repository.ArtRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArtServiceImpl implements ArtService{

    private final ArtRepository artRepository;

    @Override
    public ArtDTO createArt(ArtDTO artDTO) {
        Art art = Art.builder()
                .taskLocation(artDTO.taskLocation())
                .executorName(artDTO.executorName())
                .employeeId(artDTO.employeeId())
                .taskDate(artDTO.taskDate())
                .build();

        Art saveArt = artRepository.save(art);

        return new ArtDTO(
                saveArt.getId(),
                saveArt.getTaskLocation(),
                saveArt.getExecutorName(),
                saveArt.getEmployeeId(),
                saveArt.getTaskDate()
        );
    }

    @Override
    public List<ArtDTO> getAllArts() {
        return artRepository.findAll()
                .stream()
                .map(art -> new ArtDTO(
                        art.getId(),
                        art.getTaskLocation(),
                        art.getExecutorName(),
                        art.getEmployeeId(),
                        art.getTaskDate()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public ArtDTO getArtById(UUID id) {
        Art art = artRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Art not found with id: " + id));

        return new ArtDTO(
                art.getId(),
                art.getTaskLocation(),
                art.getExecutorName(),
                art.getEmployeeId(),
                art.getTaskDate()
        );
    }

    @Override
    public void deleteArt(UUID id) {
        if (!artRepository.existsById(id)) {
            throw new RuntimeException("Art not found with id: " + id);
        }
        artRepository.deleteById(id);
    }

}
