package com.krgcorporate.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContractService {

    @NonNull
    private final ContractRepository contractRepository;

    public Page<Contract> findAll(Pageable pageable) {
        return this.contractRepository.findAll(pageable);
    }

    public void doSomething() {

    }
}
