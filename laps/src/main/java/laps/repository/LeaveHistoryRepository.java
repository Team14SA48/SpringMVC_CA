package laps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import laps.model.LeaveHistory;

public interface LeaveHistoryRepository extends JpaRepository<LeaveHistory, Integer> {
	List<LeaveHistory> findByStatus(String status);
	LeaveHistory findById(int id);
}
