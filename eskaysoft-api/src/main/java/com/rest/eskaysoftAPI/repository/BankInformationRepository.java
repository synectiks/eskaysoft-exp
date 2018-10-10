package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.BankInformation;

@Repository("bankinformationRepository")
@Transactional
public interface BankInformationRepository extends JpaRepository<BankInformation, Long> {
	public List<BankInformation> findAllByOrderByNameAsc();

}