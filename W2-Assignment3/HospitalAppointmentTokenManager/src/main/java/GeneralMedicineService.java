public class GeneralMedicineService {
    public void registerPatient(String patientName)
    {
        TokenManager tokenManager= TokenManager.getInstance();
        int token=tokenManager.genrateNextToken();
        System.out.println("== General Medicine Service ==");
        System.out.println("Name of patient     "+patientName);
        System.out.println("Your token number is    "+token);
    }
}
