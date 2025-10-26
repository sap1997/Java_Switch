import java.util.List;

public class EmployeeClass {

private String name;

private List<Address> addressList;

//Getters & setters

public EmployeeClass(String name, List<Address> addressList) {

this.name = name;

this.addressList = addressList;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}


public List<Address> getAddressList() {

return addressList;

}

public void setAddressList(List<Address> addressList) {

this.addressList = addressList;

}

}

 

 