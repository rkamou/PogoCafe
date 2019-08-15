package models.orders;
import classes.Status;
import java.util.Date;

public class OrderModel {

  private int id;

  private int user_order_id;

  private Status status;

  private String  shipTo;

  private Date ordered;

  private Date shippped_date;

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
