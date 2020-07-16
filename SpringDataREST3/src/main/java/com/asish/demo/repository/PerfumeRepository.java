package com.asish.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.Perfume;

@RepositoryRestResource(collectionResourceRel = "asish",path = "asi")
public interface PerfumeRepository extends PagingAndSortingRepository<Perfume, Integer> {

}
