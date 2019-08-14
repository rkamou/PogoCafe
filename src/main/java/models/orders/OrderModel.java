package models.orders;

import services.Status;

public class OrderModel {
  private int orderId;
  private Status status;
  private int orderQuantite;
  private int userIdSession;

  public void setOrderId(int orderId){
    this.orderId = orderId;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public void setOrderQuantite(int orderQuantite) {
    this.orderQuantite = orderQuantite;
  }

  public void setUserIdSession(int userIdSession) {
    this.userIdSession = userIdSession;
  }

  public int getOrderId() {
    return orderId;
  }

  public Status getStatus() {
    return status;
  }

  public int getOrderQuantite() {
    return orderQuantite;
  }

  public int getUserIdSession() {
    return userIdSession;
  }

}
