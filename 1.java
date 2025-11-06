import java.util.Scanner;
class FitnessTracker {
    private String name;
    private int age;
    private double weight; 
    private double height;
    private int totalSteps;
    private double totalCalories;

    public FitnessTracker(String name, int age, double weight, double height, int totalSteps, double totalCalories) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.totalSteps = totalSteps;
        this.totalCalories = totalCalories;
    }
    public double calculateBMI() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
    public void updateSteps(int steps) {
        this.totalSteps += steps;
    }
    public void updateCalories(double calories) {
        this.totalCalories += calories;
    }
    public void display() {
        System.out.println("\n----- Updated Fitness Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Height (cm): " + height);
        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.printf("BMI: %.2f\n", calculateBMI());
    }
}
public class FitnessTrackerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter Height (cm): ");
        double height = sc.nextDouble();
        System.out.print("Enter Initial Total Steps: ");
        int steps = sc.nextInt();
        System.out.print("Enter Initial Total Calories Burned: ");
        double calories = sc.nextDouble();
        FitnessTracker tracker = new FitnessTracker(name, age, weight, height, steps, calories);
        System.out.print("\nEnter Additional Steps to Add: ");
        int moreSteps = sc.nextInt();
        tracker.updateSteps(moreSteps);
        System.out.print("Enter Additional Calories Burned: ");
        double moreCalories = sc.nextDouble();
        tracker.updateCalories(moreCalories);
        tracker.display();

        sc.close();
    }
}
