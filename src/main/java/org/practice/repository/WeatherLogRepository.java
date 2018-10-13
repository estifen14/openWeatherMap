package org.practice.repository;

import org.practice.model.rest.WeatherLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by estifen on 10/13/28.
 */
@Repository
public interface WeatherLogRepository extends CrudRepository<WeatherLog, Long>{

}
