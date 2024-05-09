package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    Boolean existsByStreetAndCityAndApartmentNoAndPostalCodeAndCountryId(
            String street, String city, String apartmentNo, String postalCode, Long countryId);
    Optional<Address> findByStreetAndCityAndApartmentNoAndPostalCodeAndCountryId(
            String street, String city, String apartmentNo, String postalCode, Long countryId);
}
