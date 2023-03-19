package com.example.starlight.talent;

import com.example.starlight.talent.model.entity.TalentEntity;
import com.example.starlight.talent.model.response.TalentsPagination;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface TalentMapper {
    default TalentsPagination toTalentsPagination(Page<TalentEntity> talentEntityPage) {
        if (talentEntityPage == null) {
            return null;
        }
        return TalentsPagination.builder()
                .talents(talentEntityPage.getContent())
                .totalTalents(talentEntityPage.getTotalElements())
                .totalPage(talentEntityPage.getTotalPages())
                .build();

    }
}
