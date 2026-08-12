package tutorial;

import java.util.Scanner;

// Base class
class Students {
    String name;
    int rollNo;
    String course;

    void setStudentDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Level 2
class StudentAccount extends Students {
    double collegeFee;

    void setCollegeFee(double collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayAccountDetails() {
        displayStudentDetails();
        System.out.println("College Fee: " + collegeFee);
    }
}

// Level 3 - Hosteller
class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;

    void setHostellerDetails(double hostelFee, double messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayHostellerDetails() {
        System.out.println("\n--- HOSTELLER DETAILS ---");
        displayAccountDetails();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: " + (collegeFee + hostelFee + messFee));
    }
}

// Level 3 - Day Scholar
class DayScholar extends StudentAccount {
    double busFee;

    void setDayScholarDetails(double busFee) {
        this.busFee = busFee;
    }

    void displayDayScholarDetails() {
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        displayAccountDetails();
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: " + (collegeFee + busFee));
    }
}

// Main class
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hosteller details
        Hosteller h = new Hosteller();

        System.out.print("Enter Hosteller's Name: ");
        String hName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int hRollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String hCourse = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double hCollegeFee = sc.nextDouble();

        System.out.print("Enter Hostel Fee: ");
        double hHostelFee = sc.nextDouble();

        System.out.print("Enter Mess Fee: ");
        double hMessFee = sc.nextDouble();

        h.setStudentDetails(hName, hRollNo, hCourse);
        h.setCollegeFee(hCollegeFee);
        h.setHostellerDetails(hHostelFee, hMessFee);

        sc.nextLine(); // consume newline

        // Day Scholar details
        DayScholar d = new DayScholar();

        System.out.print("\nEnter Day Scholar's Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int dRollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String dCourse = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double dCollegeFee = sc.nextDouble();

        System.out.print("Enter Bus Fee: ");
        double dBusFee = sc.nextDouble();

        d.setStudentDetails(dName, dRollNo, dCourse);
        d.setCollegeFee(dCollegeFee);
        d.setDayScholarDetails(dBusFee);

        // Display details
        h.displayHostellerDetails();
        d.displayDayScholarDetails();

        sc.close();
    }
}