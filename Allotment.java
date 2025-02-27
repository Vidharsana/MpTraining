import java.util.Scanner;
public class Allotment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Candidate Name: ");
        String candidateName = scanner.nextLine();
        System.out.print("Enter Entrance Test Rank: ");
        int rank = scanner.nextInt();
        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Date of Joining (dd/mm/yyyy): ");
        String dateOfJoining = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        String branch;
        if (cgpa >= 9.0) {
            branch = "Computer Science and Engineering";
        } else if (cgpa >= 8.0) {
            branch = "Electronics and Communication Engineering";
        } else if (cgpa >= 7.0) {
            branch = "Mechanical Engineering";
        } else {
            branch = "Civil Engineering";
        }
        String university;
        if (rank <= 5000) {
            university = "Indian Institute of Technology (IIT)";
        } else if (rank <= 15000) {
            university = "National Institute of Technology (NIT)";
        } else if (rank <= 30000) {
            university = "Indian Institute of Information Technology (IIIT)";
        } else {
            university = "State Engineering College";
        }
        String collegeName;
        switch (university) {
            case "Indian Institute of Technology (IIT)":
                collegeName = "IIT Madras";
                break;
            case "National Institute of Technology (NIT)":
                collegeName = "NIT Trichy";
                break;
            case "Indian Institute of Information Technology (IIIT)":
                collegeName = "IIIT Hyderabad";
                break;
            default:
                collegeName = "Anna University";
                break;
        }
        System.out.println("\n*****************************************");
        System.out.println("College Allotment Order");
        System.out.println("*****************************************");
        System.out.println("Candidate Name : " + candidateName);
        System.out.println("College Name   : " + collegeName);
        System.out.println("Entrance Test Rank: " + rank);
        System.out.println("Branch         : " + branch);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Address        : " + address);
        System.out.println("CGPA           : " + cgpa);
        System.out.println("University     : " + university);
        System.out.println("*****************************************");
    }
}
