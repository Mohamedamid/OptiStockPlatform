package com.optistockplatrorm.mapper;

import com.optistockplatrorm.dto.ClientRequestDTO;
import com.optistockplatrorm.dto.ClientResponseDTO;
import com.optistockplatrorm.entity.Client;
import com.optistockplatrorm.entity.Enums.Role;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientResponseDTO toDto(Client client);
    Client toEntity(ClientRequestDTO DTO);
    @AfterMapping
    default void setDefaultRole(@MappingTarget Client client) {
        if (client.getRole() == null) {
            client.setRole(Role.CLIENT);
        }
    }
}
