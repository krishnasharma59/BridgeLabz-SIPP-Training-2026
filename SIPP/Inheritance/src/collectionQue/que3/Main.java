package collectionQue.que3;

import java.util.*;

public class Main {

    static HashSet<String> participants = new HashSet<>();

    // Register Participant
    static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println("Duplicate registration not allowed for: " + email);
        }
    }

    // Display Participants
    static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
        } else {
            for (String email : participants) {
                System.out.println(email);
            }
        }

        System.out.println("\nTotal Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("krishna@gmail.com");
        registerParticipant("aman@gmail.com");
        registerParticipant("rahul@gmail.com");

        // Duplicate Registration
        registerParticipant("aman@gmail.com");

        displayParticipants();
    }
}
