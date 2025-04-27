package com.designpattern.behavioural.obserber;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    List<NotificationAlertObserver> notificationAlertObserverList;
    int stockCount;
    IphoneObservable() {

    }

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        if (notificationAlertObserverList == null) {
            notificationAlertObserverList = new ArrayList<>();
        }
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        if(notificationAlertObserverList == null || notificationAlertObserverList.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
       notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {

        if(notificationAlertObserverList == null || notificationAlertObserverList.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        notificationAlertObserverList.forEach(notificationAlertObserver -> notificationAlertObserver.update());
    }

    @Override
    public void setStockCount(int stockCount) {
        if (this.stockCount == 0) {
            notifySubscriber();
        }
        this.stockCount = this.stockCount +stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
