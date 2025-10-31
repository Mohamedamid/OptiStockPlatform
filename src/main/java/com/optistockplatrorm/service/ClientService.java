package com.optistockplatrorm.service;

import com.optistockplatrorm.dto.ClientRequestDTO;
import com.optistockplatrorm.dto.ClientResponseDTO;
import com.optistockplatrorm.entity.Client;
import com.optistockplatrorm.entity.Enums.Role;
import com.optistockplatrorm.mapper.ClientMapper;
import com.optistockplatrorm.repository.ClientRepository;
import com.optistockplatrorm.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private  ClientMapper clientMapper;

    public ClientResponseDTO createClient(ClientRequestDTO dto) {
        Client client = Client.builder()
                .name(dto.name())
                .email(dto.email())
                .password(PasswordUtil.hash(dto.password()))
                .phone(dto.phone())
                .role(Role.CLIENT)
                .createdAt(LocalDateTime.now())
                .active(true)
                .build();
        return clientMapper.toDto(clientRepository.save(client));
    }
}
