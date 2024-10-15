import java.util.Scanner;

public class MedicalChatBotHelpy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean validInput; // loop control
        int userInput = 0;
        validInput = false;

        System.out.println("\nWelcome to the medical assistant! My name is Helpy! \nHow can I help you today?");
        do {
            // Paint the walls
            String marker = "@@";
            for (int i = 0; i < 18; ++i){
                System.out.println(marker);
                marker += "@@";
            }
            // Print symptom options table with borders
            System.out.println("+----+------------------------------+");
            System.out.println("|  1 | I have a headache            |");
            System.out.println("|  2 | I have a cough               |");
            System.out.println("|  3 | I feel dizzy                 |");
            System.out.println("|  4 | I don't know why I'm here    |");
            System.out.println("|  5 | What is Health IT Academy?   |");
            System.out.println("|  6 | Why is the sky blue?         |");
            System.out.println("|  7 | Why does this program exist? |");
            System.out.println("+----+------------------------------+");
            System.out.println("|  8 | Exit program                 |");
            System.out.println("+----+------------------------------+");

            System.out.println("Please enter the number corresponding to your symptom or question:");
            input = scanner.nextLine();

            // Check if the input is not empty
            if (input.isEmpty()) {
                System.out.println("Wrong input! Please enter a valid number.");
                continue; // Prompt the user again
            }

            // Check if the input is numeric manually
            boolean isNumeric = true; // Assume the input is numeric initially

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (!Character.isDigit(c)) { // Check if the character is not a digit
                    isNumeric = false; // Set to false if any character is not a digit
                    break;
                }
            }

            // Proceed if the input is numeric
            if (isNumeric) {
                userInput = Integer.parseInt(input); // Convert input to integer

                // Check if user selected to exit
                if (userInput == 8) {
                    System.out.println("Thank you for using Helpy medical assistance bot! Have a nice day!");
                    validInput = true; // Exit the loop
                } else if (userInput >= 1 && userInput <= 7) {
                    // Valid symptom option
                    System.out.println("You selected option: " + userInput);

                    String severityInput;
                    int severityLevel;
                    // Display corresponding message based on user selection
                    switch (userInput) {
                        case 1:
                            System.out.println("You said: I have a headache.");
                            // Display severity levels
                            System.out.println("\nPlease select the number in front of the severity level you think you have:");
                            System.out.println("+----+--------------------+");
                            System.out.println("|  1 | Very Mild         |");
                            System.out.println("|  2 | Mild              |");
                            System.out.println("|  3 | Mild to Moderate  |");
                            System.out.println("|  4 | Moderate          |");
                            System.out.println("|  5 | Moderate to Severe|");
                            System.out.println("|  6 | Severe            |");
                            System.out.println("|  7 | Very Severe       |");
                            System.out.println("|  8 | Critical          |");
                            System.out.println("|  9 | Emergency         |");
                            System.out.println("| 10 | Life-threatening   |");
                            System.out.println("+----+--------------------+");
                            // Ask for severity level input
                            System.out.println("Enter severity level (1-10):");
                            severityInput = scanner.nextLine();
                            severityLevel = Integer.parseInt(severityInput);
                            // Provide medical advice based on severity level
                            System.out.println("\nMedical Advice:");
                            switch (severityLevel) {
                                case 1:
                                    System.out.println("Very Mild: Usually not concerning; consider drinking water or resting. \nIf persistent, monitor for changes.");
                                    break;
                                case 2:
                                    System.out.println("Mild: Manage with over-the-counter pain relievers (e.g., acetaminophen \nor ibuprofen) and ensure proper hydration.");
                                    break;
                                case 3:
                                    System.out.println("Mild to Moderate: If pain continues, use pain relievers as needed and \nconsider relaxation techniques (e.g., deep breathing, meditation). If recurring, consider keeping a headache diary.");
                                    break;
                                case 4:
                                    System.out.println("Moderate: Over-the-counter medication may be effective. If headaches are \nfrequent or worsening, consult a healthcare provider for further evaluation.");
                                    break;
                                case 5:
                                    System.out.println("Moderate to Severe: Prescription medication may be necessary. Discuss \noptions with a healthcare provider, especially if headaches disrupt daily activities.");
                                    break;
                                case 6:
                                    System.out.println("Severe: Seek medical advice promptly. You may need stronger medications \nor investigations to determine the underlying cause.");
                                    break;
                                case 7:
                                    System.out.println("Very Severe: Consider visiting a healthcare professional immediately. \nYou may require urgent treatment, especially if accompanied by other symptoms.");
                                    break;
                                case 8:
                                    System.out.println("Critical: Immediate medical attention is necessary. This could indicate a \nserious condition that requires prompt intervention.");
                                    break;
                                case 9:
                                    System.out.println("Emergency: Call emergency services or go to the nearest emergency room. \nThis level of pain could signify a critical issue.");
                                    break;
                                case 10:
                                    System.out.println("Life-threatening: This requires immediate emergency care. Call emergency \nservices right away.");
                                    break;
                                default:
                                    System.out.println("Invalid severity level. Please enter a number between 1 and 10.");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("You said: I have a cough.");
                            // Display severity levels
                            System.out.println("\nPlease select the number in front of the severity level you think you have:");
                            System.out.println("+----+-------------------------+");
                            System.out.println("|  1 | Very Mild              |");
                            System.out.println("|  2 | Mild                   |");
                            System.out.println("|  3 | Moderate               |");
                            System.out.println("|  4 | Severe                 |");
                            System.out.println("+----+-------------------------+");

                            // Ask for severity level input for cough
                            System.out.println("Enter severity level (1-4):");
                            severityInput = scanner.nextLine();
                            severityLevel = Integer.parseInt(severityInput);
                            // Provide medical advice based on severity level
                            System.out.println("\nMedical Advice:");
                            switch (severityLevel) {
                                case 1:
                                    System.out.println("Very Mild: Often not concerning; stay hydrated and monitor for changes.");
                                    break;
                                case 2:
                                    System.out.println("Mild: You may consider over-the-counter cough suppressants or \nthroat lozenges.");
                                    break;
                                case 3:
                                    System.out.println("Moderate: If the cough persists or worsens, consider consulting a \nhealthcare provider. They may recommend further evaluation or treatment.");
                                    break;
                                case 4:
                                    System.out.println("Severe: Seek medical attention, especially if the cough is \naccompanied by difficulty breathing, chest pain, or other concerning symptoms.");
                                    break;
                                default:
                                    System.out.println("Invalid severity level. Please enter a number between 1 and 4.");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("You said: I feel dizzy.");
                            // Display severity levels
                            System.out.println("\nPlease select the number in front of the severity level you think you have:");
                            System.out.println("+----+-------------------------+");
                            System.out.println("|  1 | Very Mild              |");
                            System.out.println("|  2 | Mild                   |");
                            System.out.println("|  3 | Moderate               |");
                            System.out.println("|  4 | Severe                 |");
                            System.out.println("+----+-------------------------+");

                            // Ask for severity level input for dizziness
                            System.out.println("Enter severity level (1-4):");
                            severityInput = scanner.nextLine();
                            severityLevel = Integer.parseInt(severityInput);

                            // Provide medical advice based on severity level
                            System.out.println("\nMedical Advice:");
                            switch (severityLevel) {
                                case 1:
                                    System.out.println("Very Mild: Usually not a concern; ensure proper hydration and rest.");
                                    break;
                                case 2:
                                    System.out.println("Mild: This may be related to dehydration or low blood sugar, \ntry to drink water or eat something light.");
                                    break;
                                case 3:
                                    System.out.println("Moderate: If dizziness persists, consider consulting a \nhealthcare provider. It could indicate an underlying issue.");
                                    break;
                                case 4:
                                    System.out.println("Severe: Seek immediate medical attention, especially if \naccompanied by symptoms like fainting, confusion, or difficulty speaking.");
                                    break;
                                default:
                                    System.out.println("Invalid severity level. Please enter a number between 1 and 4.");
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Nobody knows! Have a nice day!");
                            break;
                        case 5:
                            System.out.println("Health IT Academy is an educational program, \na platform, or an initiative that focuses on information technology in healthcare. \nThe program offers courses and training on various aspects of IT in the healthcare industry.");
                            break;
                        case 6:
                            System.out.println("The sky appears blue primarily due to a phenomenon known as Rayleigh scattering. \nBut I doubt that you actually care!");
                            break;
                        case 7:
                            System.out.println("This program exists for educational purposes and of course for FUN!!");
                            break;
                        default:
                            break; // Should not reach here
                    }

                    // Prompt to continue
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine(); // Wait for user to press Enter

                    System.out.println("You can continue to choose another option or exit by selecting 8.");
                } else {
                    System.out.println("Wrong input! Please enter a number between 1 and 8.");
                }
            } else {
                System.out.println("Wrong input! Please enter a valid number.");
                // Prompt to continue
                System.out.println("Press Enter to continue...");
                scanner.nextLine(); // Wait for user to press Enter
            }

            // Reset validInput for the next iteration if user hasn't exited
            if (userInput != 8) {
                validInput = false; // Continue looping until a valid exit command is received
            }

        } while (!validInput); // Continue until the user decides to exit

        // Close the scanner
        scanner.close();
        System.out.println("PROGRAM ENDED!");
    }
}
