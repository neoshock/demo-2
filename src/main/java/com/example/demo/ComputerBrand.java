package com.example.demo;

public class ComputerBrand {
    private Long id;
    private String brandName;

    public ComputerBrand() {
    }

    public ComputerBrand(Long id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "ComputerBrand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
