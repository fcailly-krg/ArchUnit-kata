package com.krgcorporate.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class AgencyService {

    Logger logger;

    @NonNull
    private final AgencyRepository agencyRepository;

    public Page<Agency> findAll(Pageable pageable) {
        return this.agencyRepository.findAll(pageable);
    }

    public void throwException() throws Exception {
        throw new Exception();
    }

    public void printLog() {
        System.out.println("log");
    }

    public void printLog2() {
        logger.log(Level.INFO, "log");
    }
}
