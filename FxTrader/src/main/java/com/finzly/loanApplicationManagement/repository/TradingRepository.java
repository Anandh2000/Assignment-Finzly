package com.finzly.loanApplicationManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.loanApplicationManagement.entity.FxTradingData;

public interface TradingRepository extends JpaRepository<FxTradingData, Integer>{

}
