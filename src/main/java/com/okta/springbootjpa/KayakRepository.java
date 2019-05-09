package com.okta.springbootjpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource
public interface KayakRepository extends CrudRepository<Kayak, Integer> {
    @PreAuthorize("hasAuthority('Admin')")
    <S extends Kayak> S save(S entity);
}