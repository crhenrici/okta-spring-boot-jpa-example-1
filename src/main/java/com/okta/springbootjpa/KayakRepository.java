package com.okta.springbootjpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource
@PreAuthorize("hasAuthority('Admin')")
public interface KayakRepository extends CrudRepository<Kayak, Integer> {

}