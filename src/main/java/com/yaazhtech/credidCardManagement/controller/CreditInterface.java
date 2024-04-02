package com.yaazhtech.credidCardManagement.controller;

import com.yaazhtech.credidCardManagement.data.CreditData;
import com.yaazhtech.credidCardManagement.model.CreditInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CreditInterface {
    @PostMapping("/save")
    public String saveCreditCardData(@RequestBody CreditInfo creditInfo);//method declaration
    @GetMapping("/getCardDetails")
    public List<CreditData> getCardDetails();
    @GetMapping("/{id}")
    public CreditData getCreditCardDataById(@PathVariable Long id);
    @DeleteMapping("{id}")
    public void  deleteUser(@PathVariable Long id);
    @PutMapping("{id}")
    public CreditData updateCreditCardData(@PathVariable Long id, @RequestBody CreditData updateCreditCardData);
}
