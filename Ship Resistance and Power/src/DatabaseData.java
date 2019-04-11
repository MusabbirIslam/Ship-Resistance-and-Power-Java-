
public class DatabaseData {
    

    private String minHP;
    private String maxHP;
    private String engineModel;
    private String engineManufacturer;
    private String engineRPM;
    private String engineWebLink;
    
    public DatabaseData(String minHP, String engineRPM, String maxHP, String engineModel, String engineManufacturer, String engineWebLink)
    
    
    {
       
        this.minHP= minHP;
        this.maxHP = maxHP;
        this.engineModel = engineModel;
        this.engineManufacturer = engineManufacturer;
        this.engineRPM = engineRPM;
        this.engineWebLink = engineWebLink;
    }
    
    
    public String getminHP()
    {
        return minHP;
    }
    
    public String getmaxHP()
    {
        return maxHP;
    }
    
    public String getengineModel()
    {
        return engineModel;
    }
    
    public String getengineManufacturer()
    {
        return engineManufacturer;
    }
    
    public String getengineRPM()
    {
        return engineRPM;
    }
    
    public String getengineWebLink()
    {
        return engineWebLink;
    }
}



