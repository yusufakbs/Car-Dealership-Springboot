package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.CreditCardInfo;
import com.yusuf.Car_Dealership.repository.CreditCardInfoRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditCardInfoService extends ServiceManager<CreditCardInfo, Long> {

    private final CreditCardInfoRepository creditCardInfoRepository;

    //TODO Kredi kartı bilgilerini encrypted yap.
    public CreditCardInfoService(CreditCardInfoRepository creditCardInfoRepository) {
        super(creditCardInfoRepository);
        this.creditCardInfoRepository = creditCardInfoRepository;
    }

    public Optional<CreditCardInfo> findByCreditCardNo(String creditCardNo) {
        return creditCardInfoRepository.findByCreditCardNo(creditCardNo);
    }

    public Boolean doesCreditCardInfoExists(CreditCardInfo creditCardInfo) {
        return creditCardInfoRepository.existsByOwnersNameAndOwnersSurnameAndCreditCardNoAndCreditCardExpirationDateAndCvc(
                creditCardInfo.getOwnersName(), creditCardInfo.getOwnersSurname(),
                creditCardInfo.getCreditCardNo(), creditCardInfo.getCreditCardExpirationDate(),
                creditCardInfo.getCvc());
    }

    public Optional<CreditCardInfo> findDuplicateCreditCardInfo(CreditCardInfo creditCardInfo) {
        return creditCardInfoRepository.findByOwnersNameAndOwnersSurnameAndCreditCardNoAndCreditCardExpirationDateAndCvc(
                creditCardInfo.getOwnersName(), creditCardInfo.getOwnersSurname(),
                creditCardInfo.getCreditCardNo(), creditCardInfo.getCreditCardExpirationDate(),
                creditCardInfo.getCvc());
    }

}
