public class Main {
    public static void main(String[] args) {
        CardiologyService cs = new CardiologyService();
        GeneralMedicineService gms = new GeneralMedicineService();
        OrthopedicsService os = new OrthopedicsService();
        PediatricsService ps = new PediatricsService();


        cs.registerPatient("CS_Patient1");
        cs.registerPatient("CS_Patient2");
        gms.registerPatient("GMS_Patient1");
        gms.registerPatient("GMS_Patient2");
        os.registerPatient("OS_Patient1");
        os.registerPatient("OS_Patient2");
        ps.registerPatient("PS_Patient1");
        ps.registerPatient("PS_Patient2");

        TokenManager tokenManager = TokenManager.getInstance();
        tokenManager.displayCurrentTokenStatus();


        TokenManager tm1 = TokenManager.getInstance();
        TokenManager tm2 = TokenManager.getInstance();
        System.out.println("======================");
        System.out.println("Is Singleton Verified   " + (tm1 == tm2));
    }

}
