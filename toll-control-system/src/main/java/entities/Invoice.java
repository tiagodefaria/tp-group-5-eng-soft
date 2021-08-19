package entities;

import java.util.Date;

public class Invoice {
    private String id;
    private Double value;
    private Date dateRef;
    private String status;

    public Invoice(String id, Double value, String status) {
        this.id = id;
        this.value = value;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getDateRef() {
        return dateRef;
    }

    public void setDateRef(Date dateRef) {
        this.dateRef = dateRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
