package sda.kursai.klaipeda.softwaretesting.housetask;

public class HouseMethods {

    private static House[] houseArray = new House[3];

    public static void putHouseObjInArray(House house) {
        for (int i = 0; i < houseArray.length; i++) {
            if (houseArray[i] == null) {
                houseArray[i] = house;
                break;
            }
        }
    }

    public static int findNewestHouse() {
        int age = houseArray[0].getBuiltYear();
        String houseName = "none";
        for (int i = 0; i < houseArray.length; i++) {
            if (age < houseArray[i].getBuiltYear()) {
                age = houseArray[i].getBuiltYear();
                houseName = houseArray[i].getDistrict();
            }
        }
        System.out.println("House in " + houseName + " (age " + age + ")" + " district is the newest.");
        return age;
    }

    public static int findFittedHouse() {
        int fittedHouseCount = 0;
        for (int i = 0; i < houseArray.length; i++) {
            if (houseArray[i].getCondition().equalsIgnoreCase("fitted")) {
                System.out.println("House in " + houseArray[i].getDistrict() + " district is fitted.");
                fittedHouseCount++;
            }
        }
        return fittedHouseCount;
    }

    public static int findSmallestHouse() {
        int smallestArea = houseArray[0].getHouseArea();
        String houseName = "None";
        for (int i = 0; i < houseArray.length; i++) {
            if (smallestArea > houseArray[i].getHouseArea()) {
                smallestArea = houseArray[i].getHouseArea();
                houseName = houseArray[i].getDistrict();
            }
        }
        System.out.println("House in " + houseName + " district is the smallest.");
        return smallestArea;
    }
}