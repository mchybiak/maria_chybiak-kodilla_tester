package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class WeatherNotificationServiceTestSuite {

    WeatherNotificationService notificationService = new WeatherNotificationService();
    Localization localization1 = Mockito.mock(Localization.class);
    Localization localization2 = Mockito.mock(Localization.class);
    Localization localization3 = Mockito.mock(Localization.class);
    Localization localization4 = Mockito.mock(Localization.class);

    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    User user4 = Mockito.mock(User.class);

    Notification notification = Mockito.mock(Notification.class);

    @Test // każdy subskrybent powinien dostać powiadomienie -> OK
    public void notificationShouldBeSendToSubscribedUser(){
        notificationService.subscribe(user1, localization1);
        notificationService.sendNotification(notification);
        Mockito.verify(user1).receiveNotification(notification);
    }

    @Test // wszyscy subskrybenci powinni dostać powiadomienie -> OK
    public void notificationShouldBeSendToAllSubscribedUsers(){
        notificationService.subscribe(user1, localization1);
        notificationService.subscribe(user2, localization2);
        notificationService.subscribe(user3, localization3);
        notificationService.subscribe(user4, localization4);
        notificationService.sendNotification(notification);
        Mockito.verify(user1).receiveNotification(notification);
        Mockito.verify(user2).receiveNotification(notification);
        Mockito.verify(user3).receiveNotification(notification);
        Mockito.verify(user4).receiveNotification(notification);

    }

    @Test // użytkownik może odsubskrybować lokalizację -> OK
    public void userCanUnsubscribedLocalization(){
        notificationService.subscribe(user1, localization1);
        notificationService.removeSubscriptionFromLocalization(user1,localization1);
        notificationService.sendNotification(notification);
        Mockito.verify(user1, Mockito.never()).receiveNotification(notification);

    }

    @Test // użytkownik może odsubskrybować wszystkie lokalizacje -> OK
    public void userCanUnsubscribedAllLocalization(){
        notificationService.subscribe(user1, localization1);
        notificationService.subscribe(user1, localization2);
        notificationService.subscribe(user1, localization3);
        notificationService.removeLocalization(localization1);
        notificationService.removeLocalization(localization2);
        notificationService.removeLocalization(localization3);
        notificationService.sendNotification(notification);
        Mockito.verify(user1, Mockito.never()).receiveNotification(notification);
    }

    @Test // tylko subskrybenci danej lokalizacji powinni otrzymać powiadomienie -> OK
    public void onlySubscribersOfTestingLocalizationShouldReceivedNotification(){
        notificationService.subscribe(user1,localization1);
        notificationService.subscribe(user2, localization2);
        notificationService.notificationForLocalization(localization1, notification);
        Mockito.verify(user1).receiveNotification(notification);
        Mockito.verify(user2, Mockito.never()).receiveNotification(notification);
    }

    @Test // po usunięciu z subskrybcji danej lokalizacji, subskrybent nie otrzymuje powiadomienia -> OK, ALE DLACZEGO W OSTATNIEJ LINIJCE
    // POWINNO BYĆ VERIFY.... A NIE MOCKITO.NEVER??
    public void localizationCanBeDeleted(){
        notificationService.subscribe(user1, localization1); // User subskrybuje lok1
        notificationService.notificationForLocalization(localization1, notification); // System wysyła powiadomienie dot. lok1
        Mockito.verify(user1).receiveNotification(notification); // Mockito sprawdza czy User dostał powiadomienie
        notificationService.removeLocalization(localization1); // User usuwa subskrybcję lok1
        notificationService.notificationForLocalization(localization1, notification); // System wysyła powiadomienie dot. lok1
        Mockito.verify(user1).receiveNotification(notification);  // Mockito sprawdza czy User nie dostał powiadomienia
    }
}