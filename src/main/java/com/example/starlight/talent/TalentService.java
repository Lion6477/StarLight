package com.example.starlight.talent;

import com.example.starlight.talent.model.response.TalentsPagination;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TalentService {
    TalentRepository talentRepository;
    TalentMapper mapper;

    public TalentsPagination talentsPagination(int page, int size) {
        return mapper.toTalentsPagination(talentRepository.findAll(PageRequest.of(page, size)));
    }
}
