import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        List<String> appointment = new ArrayList<>();
        appointment.add("Sourav");
        appointment.add("Sachin");
        appointment.add("Sanjeev");
        appointment.add("Sameer");

        System.out.println("List of all the appointments    " + appointment);

        System.out.println("Adding Emergency Patient");
        appointment.add(1, "Sam(Emergecy)");
        System.out.println(" List after adding patient   " + appointment);

        appointment.add(2, "Sachin Kumar");
        System.out.println("Updated name  " + appointment);


        System.out.println("Removing Sanjeev (Cancelled Appointment)");
        appointment.remove("Sanjeev");
        System.out.println("After removing Sanjeev  " + appointment);

        System.out.println("Check whether Sameer is there or not    " + appointment.contains("Sameer"));


        System.out.println("Size of appointment list    " + appointment.size());
        appointment.add("Sourav");

        System.out.println("First Sourav    " + appointment.indexOf("Sourav"));
        System.out.println("Last Index  " + appointment.lastIndexOf("Sourav"));

        System.out.println("Traversing using loop");
        for (String name : appointment) {
            System.out.print(name + " ");
        }
        System.out.println(" ");
        appointment.clear();

        System.out.println("After clearing  "+appointment);

    }
}
