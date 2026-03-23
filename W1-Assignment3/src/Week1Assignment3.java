import java.util.*;
class InvalidName extends Exception
{
    public InvalidName(String msg)
    {
        super(msg);
    }
}
class InvalidMovie extends Exception
{
    public InvalidMovie(String msg)
    {
        super(msg);
    }
}

class InvalidTicket extends Exception
{
    public InvalidTicket(String msg)
    {
        super(msg);
    }
}

class InsufficientSeat extends Exception
{
    public InsufficientSeat(String msg)
    {
        super(msg);
    }
}
class PaymentFailed extends Exception
{
    public PaymentFailed(String msg)
    {
        super(msg);
    }
}

class NoCancellation extends Exception
{
    public NoCancellation(String msg)
    {
        super(msg);
    }
}

public class Week1Assignment3
{
    static int availableSeats=10;
    static boolean cancelled=false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the name to book ticket");
            String name=sc.nextLine();
            if(name.isEmpty())
            {
                throw  new InvalidName("Name Cannot be Empty");
            }
            System.out.println("Select movie (Leo/Jailer/Vikram)");
            String movie=sc.nextLine();
            if(!(movie.equals("Leo") || movie.equals("Jailer") || movie.equals("Vikram"))) throw new InvalidMovie("Invalid movie");

            System.out.println("Enter no of tickets");
            int noOfTickets=sc.nextInt();
            if(noOfTickets>availableSeats) throw  new InvalidTicket("Ticket Unavailable");
            if(noOfTickets<=0) throw new InvalidTicket("Wrong Input , value must be greater than 0");
int totalPrice=noOfTickets*299;
            System.out.println("Enter the payment amount");
            int payment=sc.nextInt();
            if(payment<totalPrice) throw new PaymentFailed("Enter sufficient amount");
            availableSeats-=noOfTickets;
            System.out.println("Booking Successfull");

            System.out.println("Cancel Booking (Yes/No)");
            sc.nextLine();
            String cancel= sc.nextLine();

        } catch (InvalidName e) {
            throw new RuntimeException(e.getMessage());
        } catch (InvalidMovie e) {
            throw new RuntimeException(e.getMessage());
        } catch (InvalidTicket e) {
            throw new RuntimeException(e.getMessage());
        } catch (PaymentFailed e) {
            throw new RuntimeException(e.getMessage());
        }
        finally {
            System.out.println("THANKYOUUUUUU");
        }

    }


}


