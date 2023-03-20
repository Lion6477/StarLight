package com.example.starlight.talent;

import com.example.starlight.talent.model.response.TalentsPagination;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TalentController {
    TalentService talentService;

    @GetMapping("/talent")
    public TalentsPagination getAllTalents(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        return talentService.talentsPagination(page, size);
    }
}