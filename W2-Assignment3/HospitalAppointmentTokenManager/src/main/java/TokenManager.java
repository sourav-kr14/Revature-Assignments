public class TokenManager {
    private static TokenManager instance;
    private int currentTokenNumber;
    private String hospitalName;

    private TokenManager() {
        hospitalName="SK Hospitals";
        currentTokenNumber=0;
    }
    public static TokenManager getInstance()
    {
        if(instance == null)
        {
            instance=new TokenManager();
        }
        return instance;
    }
    public int genrateNextToken()
    {
        return ++currentTokenNumber;

    }
    public String getHospitalName()
    {
        return hospitalName;

    }
    public void displayCurrentTokenStatus()
    {
        System.out.println("CURRENT TOKEN STATUS");
        System.out.println("Name of Hospital    "+hospitalName);
        System.out.println("Current token number   "+currentTokenNumber);
        System.out.println("Next Token      "+(currentTokenNumber+1));
    }
}