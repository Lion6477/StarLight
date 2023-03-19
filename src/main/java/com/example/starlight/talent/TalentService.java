package com.example.starlight.talent;

import com.example.starlight.talent.model.entity.TalentEntity;
import com.example.starlight.talent.model.response.TalentsPagination;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TalentService {
    TalentRepository talentRepository;

    public TalentsPagination talentsPagination(int page, int size) {
        Page<TalentEntity> talentEntityPage = talentRepository.findAll(PageRequest.of(page, size));
        return TalentsPagination.builder()
                .talentShortDiscs(talentEntityPage.getContent())
                .totalTalents(talentEntityPage.getTotalElements())
                .totalPage(talentEntityPage.getTotalPages())
                .build();
    }
}
