package com.krgcorporate.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgencyService {

    @NonNull
    private final AgencyRepository agencyRepository;

    public Page<Agency> findAll(Pageable pageable) {
        return this.agencyRepository.findAll(pageable);
    }
}
