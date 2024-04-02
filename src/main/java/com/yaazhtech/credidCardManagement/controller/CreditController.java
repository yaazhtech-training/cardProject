package com.yaazhtech.credidCardManagement.controller;
import com.yaazhtech.credidCardManagement.data.CreditData;
import com.yaazhtech.credidCardManagement.model.CreditInfo;
import com.yaazhtech.credidCardManagement.repository.CreditRepo;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class CreditController implements CreditInterface {
    @Autowired
    CreditRepo creditRepo;

    @Override
    public String saveCreditCardData(CreditInfo creditInfo) {
        CreditData creditData = new CreditData();
        creditData.setId(creditInfo.getId());
        creditData.setCardHolderName(creditInfo.getCardHolderName());
        creditData.setCardHolderPan(creditInfo.getCardHolderPan());
        creditData.setCardNumber(creditInfo.getCardNumber());
        creditData.setCardLimit(creditInfo.getCardLimit());
        creditData.setCardCvv(creditInfo.getCardCvv());
        creditData.setCardPin(creditInfo.getCardPin());
        creditData.setBankName(creditInfo.getBankName());
        creditRepo.save(creditData);
        return "Credit card data saved successfully";
    }

    @Override
    public List<CreditData> getCardDetails() {

        return creditRepo.findAll();
    }

    @Override
    public CreditData getCreditCardDataById(Long id) {
        return creditRepo.findById(id).orElse(null) ;
    }

    @Override
    public void deleteUser(Long id) {
        creditRepo.deleteById(id);
    }

    @Override
    public CreditData updateCreditCardData(Long id, CreditData updateCreditCardData) {
       CreditData existData = creditRepo.findById(id).orElse(null);
        existData.setCardHolderName(updateCreditCardData.getCardHolderName());
        return creditRepo.save(existData);
    }


}


