package models.entities;

import javax.persistence.*;

@Entity
@Table(name = "lineitem")
public class LineitemEntity {
    private int id;
    private int quantity;
    private Integer idItem;
    private int idOrder;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "idItem", nullable = true)
    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    @Basic
    @Column(name = "idOrder", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineitemEntity that = (LineitemEntity) o;

        if (id != that.id) return false;
        if (quantity != that.quantity) return false;
        if (idOrder != that.idOrder) return false;
        if (idItem != null ? !idItem.equals(that.idItem) : that.idItem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + quantity;
        result = 31 * result + (idItem != null ? idItem.hashCode() : 0);
        result = 31 * result + idOrder;
        return result;
    }
}
