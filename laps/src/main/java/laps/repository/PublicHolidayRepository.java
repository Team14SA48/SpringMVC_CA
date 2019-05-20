package laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import laps.model.PublicHoliday;

public interface PublicHolidayRepository extends JpaRepository<PublicHoliday, Integer>{

}
