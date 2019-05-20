package laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import laps.model.CompensationClaimHistory;

public interface CompensationClaimHistoryRepository extends JpaRepository<CompensationClaimHistory, Integer>{

}
