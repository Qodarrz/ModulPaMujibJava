/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tumbal;

/**
 *
 * @author heida
 */
public class Tumbal {
    
    public static void main(String[] args) {
        String[] lyrics = {
            "Ooh, want the good and the bad and everything in between",
            "Ooh, gotta cure my curiosity",
            "Ooh, yeah",
            "",
            "I'd spend ten thousand hours and ten thousand more",
            "Oh, if that's what it takes to learn that sweet heart of yours (sweet heart of yours)",
            "And I might never get there, but I'm gonna try",
            "If it's ten thousand hours or the rest of my life"
        };

        // Array of delays in milliseconds for each line
        int[] delays = {
            3000,  // 3 seconds
            5000,  // 5 seconds
            2000,  // 2 seconds
            1000,  // 1 second
            4000,  // 4 seconds
            6000,  // 6 seconds
            3500,  // 3.5 seconds
            7000   // 7 seconds
        };

        // Simulate typing effect for each line of lyrics
        for (int i = 0; i < lyrics.length; i++) {
            printWithTypingEffect(lyrics[i], 50); // 50 ms per character
            try {
                // Sleep for the specified delay after printing each line
                Thread.sleep(delays[i]);
            } catch (InterruptedException e) {
                // Handle exception if the sleep is interrupted
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    // Method to print a string with typing effect
    private static void printWithTypingEffect(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                // Sleep for the specified delay between each character
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                // Handle exception if the sleep is interrupted
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println(); // Move to the next line after printing
        System.out.flush(); // Ensure the output is flushed immediately
    }
}


