package com.costumerinfo.rutu;

public class CustomerInfo
{
    private String Name, Gender ;
    private int Age ;
    public CustomerInfo(String Name, String Gender, int Age)
    {
        this.Name = Name ;
        this.Gender = Gender ;
        this.Age = Age ;
    }

    public String getName()
    {
        return this.Name;
    }

    public String getGender()
    {
        return this.Gender;
    }

    public int getAge()
    {
        return this.Age;
    }
}