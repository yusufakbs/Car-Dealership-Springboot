package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.CreditCardInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreditCardInfoRepository extends JpaRepository<CreditCardInfo, Long> {
    Optional<CreditCardInfo> findByCreditCardNo(String creditCardNo);

    Boolean existsByOwnersNameAndOwnersSurnameAndCreditCardNoAndCreditCardExpirationDateAndCvc(String ownersName, String ownersSurname, String creditCardNo, String creditCardExpirationDate, String cvc);

    Optional<CreditCardInfo> findByOwnersNameAndOwnersSurnameAndCreditCardNoAndCreditCardExpirationDateAndCvc(String ownersName, String ownersSurname, String creditCardNo, String creditCardExpirationDate, String cvc);
}
