package com.korea.dto;

public class AuthDTO extends DTO
{
    private String id;
    private String pw;
    private String name;
    private int age;
    private String phone;
    private String addr;
    private String license;
    private String level;
    public AuthDTO(String id, String pw)
    {
        this.id = id;
        this.pw = pw;
    }

    public AuthDTO(String id, String pw, String name, int age, String phone, String addr, String license)
    {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.addr = addr;
        this.license = license;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPw()
    {
        return pw;
    }

    public void setPw(String pw)
    {
        this.pw = pw;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getAddr()
    {
        return addr;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public String getLicense()
    {
        return license;
    }

    public void setLicense(String license)
    {
        this.license = license;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    @Override
    public String toString()
    {
        return "AuthDTO{" + "id='" + id + '\'' + ", pw='" + pw + '\'' + ", name='" + name + '\'' + ", age=" + age + ", phone='" + phone + '\'' + ", addr='" + addr + '\'' + ", license='" + license + '\'' + ", level='" + level + '\'' + '}';
    }
}
