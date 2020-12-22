package com.webflux.projetodemowebflux.repository;

import com.webflux.projetodemowebflux.model.Devs;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DevsRepository extends ReactiveMongoRepository <Devs, String> {

}
