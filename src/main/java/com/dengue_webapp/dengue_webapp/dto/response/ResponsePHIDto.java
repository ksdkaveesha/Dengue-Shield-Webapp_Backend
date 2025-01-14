package com.dengue_webapp.dengue_webapp.dto.response;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ResponsePHIDto {

    private String id;

    private String name;

    private String phone;

    private String email;

    private String area;

    private String address;

    public ResponsePHIDto(String id, String name, String phone, String email, String area, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.area = area;
        this.address = address;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
