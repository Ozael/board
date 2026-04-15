package dev.ozael.dto;

import dev.ozael.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
        String name,
        BoardColumnKindEnum kind,
        int cardsAmount) {
}
