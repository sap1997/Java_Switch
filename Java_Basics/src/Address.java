public class Address {

private String buildingNo;

private String StreetName;

private String cityName;

//Getters & setters

public Address(String cityName) {

this.cityName = cityName;

}

public String getCityName() {

return cityName;

}

public void setCityName(String cityName) {

this.cityName = cityName;

}

public String getStreetName() {

return StreetName;

}

public void setStreetName(String streetName) {

StreetName = streetName;

}

public String getBuildingNo() {

return buildingNo;

}

public void setBuildingNo(String buildingNo) {

this.buildingNo = buildingNo;

}

}
