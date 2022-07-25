package com.kodilla.abstracts.homework;

public class Lawyer extends Job{

    public static String jobName = "Lawyer";

    public Lawyer(double salary, String responsibilities) {
        super(8000, "meetings with the client, participation in court hearings, preparation of documents");
    }
}