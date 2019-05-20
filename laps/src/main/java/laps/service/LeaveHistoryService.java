package laps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import laps.model.LeaveHistory;
import laps.repository.LeaveHistoryRepository;

@Service
public class LeaveHistoryService {
	
	@Autowired
	private LeaveHistoryRepository lhr;

	public List<LeaveHistory> listAllAppliedRequests() {
		return lhr.findByStatus("Applied");
	}
	
	public LeaveHistory findLeaveHistoryById(int id) {
		return lhr.findById(id);
	}
}
