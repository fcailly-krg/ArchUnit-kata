package com.krgcorporate.example;

import com.krgcorporate.example.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract, String> {
}
