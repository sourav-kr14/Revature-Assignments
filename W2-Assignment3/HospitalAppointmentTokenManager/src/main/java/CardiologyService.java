public class CardiologyService
{
    public  void registerPatient(String patientName)
    {
        TokenManager tokenManager= TokenManager.getInstance();
        int token=tokenManager.genrateNextToken();
        System.out.println("== Cardiology Services ==");
        System.out.println("Name of patient     "+patientName);
        System.out.println("Your token number is    "+token);

    }
}
