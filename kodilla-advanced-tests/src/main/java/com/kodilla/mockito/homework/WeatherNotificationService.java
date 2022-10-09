package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    public Map<Localization, Set<User>> subscribers = new HashMap<>();

    // getOrDefault -> Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
    // Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.
    public void notificationForLocalization(Localization localization, Notification notification){
        this.subscribers.getOrDefault(localization, new HashSet<>()).forEach(user -> user.receiveNotification(notification));
    }


    // Możliwość skasowania danej lokalizacji
    public void removeLocalization(Localization localization){
        this.subscribers.remove(localization);
    }

    //Możliwość wysyłki powiadomienia do wszystkich.
    public void sendNotification(Notification notification){
        for (Map.Entry<Localization, Set<User>> entry: this.subscribers.entrySet()){
            entry.getValue().forEach(user -> user.receiveNotification(notification));
        }
    }
    public void subscribe (User user, Localization localization) {
        if (!this.subscribers.containsKey(localization)) {
            this.subscribers.put(localization, new HashSet<>());
        }
        this.subscribers.get(localization).add(user);
    }

    public void removeSubscription(User user){
        for (Map.Entry<Localization,Set<User>> entry:this.subscribers.entrySet()) {
            entry.getValue().remove(user);
        }
    }


    //Można wycofać subskrypcję z danej lokalizacji.

    // ! zaprzeczenie warunku
    public void removeSubscriptionFromLocalization(User user, Localization localization){
        if(!this.subscribers.containsKey(localization))
        {
            this.subscribers.put(localization,new HashSet<>());
        }
        this.subscribers.get(localization).remove(user);

    }
}
