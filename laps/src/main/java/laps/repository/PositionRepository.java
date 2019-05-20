package laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import laps.model.Position;

public interface PositionRepository extends JpaRepository<Position, String> {
	Position findByPositionName(String positionName);
}
