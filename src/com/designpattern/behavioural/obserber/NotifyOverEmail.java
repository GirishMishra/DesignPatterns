package com.designpattern.behavioural.obserber;

public class NotifyOverEmail implements NotificationAlertObserver{

    String email;
    StockObservable stockObservable;

    public NotifyOverEmail(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(email, "product is in stock hurryup");
    }

   void sendEmail(String email, String msg) {
       System.out.println(email+""+msg + stockObservable.getStockCount());
    }
}
