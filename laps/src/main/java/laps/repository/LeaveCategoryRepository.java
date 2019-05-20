package laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import laps.model.LeaveCategory;

public interface LeaveCategoryRepository extends JpaRepository<LeaveCategory, String> {

}
