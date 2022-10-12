package com.finzly.loanApplictionManagaement.Service;

import com.finzly.loanApplicationManagement.controller.LoanApplicationController;
import com.finzly.loanApplicationManagement.entity.User;

import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public interface LoanService {
	public ResponseEntity<?> printAll();
	public ResponseEntity<?> saveTradeBeforeBooking(User user,EntityModel<LoanApplicationController> entity);
	public ResponseEntity<?> bookTrade(String bookorCancel, EntityModel<LoanApplicationController> entity);
	public ResponseEntity<?> setRate(double rate);
	public ResponseEntity<?> printAllWithPagination(int offset,int pageSize);

}
