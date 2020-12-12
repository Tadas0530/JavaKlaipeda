package sda.kursai.klaipeda.softwaretesting.housetask;

public class House {
    private int houseArea;
    private String district;
    private int builtYear;
    private String condition;


    public House(int houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
        HouseMethods.putHouseObjInArray(House.this);
    }

    public int getHouseArea() {
        return houseArea;
    }

    public String getDistrict() {
        return district;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public String getCondition() {
        return condition;
    }

}


