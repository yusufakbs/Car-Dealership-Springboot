package com.yusuf.Car_Dealership.utility;

import com.yusuf.Car_Dealership.entity.superclasses.Car;

import java.util.Random;
import java.util.UUID;

public class CarCodeGenerator {

    public static String generateCarCode(String batchNumber, Car car) {

        String initials = car.getBrand().getInitials();
        String modelInitials = null;
        if (car.getModel().length() == 1) {
            modelInitials = (car.getModel() + car.getModel()).toUpperCase();
        } else {
            modelInitials = car.getModel().toUpperCase().substring(0, 2);
        }
        String carType = car.getClass().getSimpleName().substring(0,1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(initials + "-" + modelInitials + "-");
        stringBuilder.append(batchNumber);
        stringBuilder.append("-");
        stringBuilder.append(generateCode());
        stringBuilder.append("-Y-"+car.getYear()+"-"+ carType);
        return stringBuilder.toString();
    }
    public static String generateCode() {
        UUID uuid = UUID.randomUUID();
        // UUID'yi al ve '-' karakterlerini kaldır
        String uniqueCode = uuid.toString().replaceAll("-", "");
        // 50 karakterlik bir kısmını al, daha fazla karakter varsa kırp
        return uniqueCode.substring(0, 8).toUpperCase();
    }

    public static String generateBatchNumber() {
        UUID uuid = UUID.randomUUID();
        String uniqueCode = uuid.toString().replaceAll("-", "").toUpperCase();
        char[] charArr = new char[6];
        int charIndex = 0;
        for (int i = 0; i < uniqueCode.length(); i++) {
            int asciiValue = uniqueCode.charAt(i);
            if (asciiValue >= 65 && asciiValue <= 90) {
                charArr[charIndex] = (char) asciiValue;
                charIndex++;
            }
            if (charIndex == 4) {
                break;
            }
        }
        Random random = new Random();
        String batchNumbers = String.valueOf(random.nextInt(10, 100));
        charArr[4] = batchNumbers.charAt(0);
        charArr[5] = batchNumbers.charAt(1);
        return String.valueOf(charArr);
    }
}
