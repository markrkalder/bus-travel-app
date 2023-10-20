package com.demo.bustravel.repository;

import com.demo.bustravel.model.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends CrudRepository<Route, String> {

}
