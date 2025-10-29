package Lab4;

import java.util.Comparator;

public class SalePerson implements Comparable<SalePerson> {
    private final String firstName;
    private final String lastName;
    private final int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName =  lastName;
        this.totalSales = totalSales;
    }

    public String toString(){
        return lastName + " , " + firstName + " : " + totalSales;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        SalePerson other = (SalePerson) obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }

    public int compareTo(SalePerson other){
        if(this.totalSales != other.totalSales){
            return other.totalSales - this.totalSales;
        }
        return this.lastName.compareTo(other.lastName);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getTotalSales(){
        return this.totalSales;
    }
}
