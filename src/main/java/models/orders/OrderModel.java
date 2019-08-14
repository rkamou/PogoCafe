package models.orders;
import classes.Status;
import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders", schema = "PogoCafe", catalog = "")

public class OrderModel {

  @Id
  @Column(name = "id", nullable = false)
  @DatabaseField(generatedId = true)
  private int id;

  @Basic
  @Column(name = "user_order_id", nullable = true, length = 255)
  private int user_order_id;

  @Column(name = "status", nullable = true,  length = 10)
  private Status status;

  @Column(name = "shipTo", nullable = true,  length = 10)
  private String  shipTo;


  @Column(name = "ordered", nullable = true, length = 255)
  private Date ordered;

  @Column(name = "shipped_date", nullable = true, length = 255)
  private Date shippped_date;

  @Column(name = "order_package", nullable = true, length = 255)
  private String order_package;









  public OrderModel(int user_order_id, String shipTo, Status status, String order_package,Date ordered, Date shipped_date){
    this.user_order_id = user_order_id;
    this.shipTo        = shipTo;
    this.status        = status;
    this.ordered       = ordered;
    this.shippped_date = shipped_date;
    this.order_package = order_package;
  }

  public OrderModel(){

  }


  public void setStatus(Status status) {
    this.status = status;
  }

  public Status getStatus() {
    return status;
  }

  public int getUser_order_id() {
    return user_order_id;
  }

  public void setUser_order_id(int user_order_id) {
    this.user_order_id = user_order_id;
  }

  public String getShipTo() {
    return shipTo;
  }

  public void setShipTo(String shipTo) {
    this.shipTo = shipTo;
  }

  public Date getOrdered() {
    return ordered;
  }

  public void setOrdered(Date ordered) {
    this.ordered = ordered;
  }

  public Date getShippped_date() {
    return shippped_date;
  }

  public void setShippped_date(Date shippped_date) {
    this.shippped_date = shippped_date;
  }

  public String getOrder_package() {
    return order_package;
  }

  public void setOrder_package(String order_package) {
    this.order_package = order_package;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String String(){
      return ""+this.order_package;
  }
}
