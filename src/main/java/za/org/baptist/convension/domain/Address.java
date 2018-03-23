package za.org.baptist.convension.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.annotation.Id;

public class Address {

    @Id
    private long id;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressLineThree;
    private String addressLineFour;
    private String addressLineFive;
    private String postalCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getAddressLineThree() {
        return addressLineThree;
    }

    public void setAddressLineThree(String addressLineThree) {
        this.addressLineThree = addressLineThree;
    }

    public String getAddressLineFour() {
        return addressLineFour;
    }

    public void setAddressLineFour(String addressLineFour) {
        this.addressLineFour = addressLineFour;
    }

    public String getAddressLineFive() {
        return addressLineFive;
    }

    public void setAddressLineFive(String addressLineFive) {
        this.addressLineFive = addressLineFive;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
