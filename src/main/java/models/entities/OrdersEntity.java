package models.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class OrdersEntity {
    private int id;
    private String status;
    private Date ordered;
    private String shipTo;
    private Date shippedDate;
    private Integer userOrderId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ordered", nullable = false)
    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    @Basic
    @Column(name = "shipTo", nullable = false, length = 255)
    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    @Basic
    @Column(name = "shipped_date", nullable = false)
    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    @Basic
    @Column(name = "userOrderId", nullable = true)
    public Integer getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Integer userOrderId) {
        this.userOrderId = userOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (id != that.id) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (ordered != null ? !ordered.equals(that.ordered) : that.ordered != null) return false;
        if (shipTo != null ? !shipTo.equals(that.shipTo) : that.shipTo != null) return false;
        if (shippedDate != null ? !shippedDate.equals(that.shippedDate) : that.shippedDate != null) return false;
        if (userOrderId != null ? !userOrderId.equals(that.userOrderId) : that.userOrderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (ordered != null ? ordered.hashCode() : 0);
        result = 31 * result + (shipTo != null ? shipTo.hashCode() : 0);
        result = 31 * result + (shippedDate != null ? shippedDate.hashCode() : 0);
        result = 31 * result + (userOrderId != null ? userOrderId.hashCode() : 0);
        return result;
    }
}
