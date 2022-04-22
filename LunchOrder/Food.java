public class Food 
{
    private String NAME;
    private double PRICE;
    private double FAT;
    private double CARBS;
    private double FIBER;
    
   //CONSTRUCTER FOR FOOD...
   public Food(String NAME, double PRICE, double FAT, double  CARBS, double FIBER)
    {
        this.NAME = NAME;
        this.PRICE = PRICE;
        this.FAT = FAT;
        this.CARBS = CARBS;
        this.FIBER = FIBER;
    }

    //GETTER & SETTER METHODS FOR THE ATTRIBUTE OF THE FOOD...
    /**
     * @return String return the NAME
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * @param NAME the NAME to set
     */
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    /**
     * @return double return the PRICE
     */
    public double getPRICE() {
        return PRICE;
    }

    /**
     * @param PRICE the PRICE to set
     */
    public void setPRICE(double PRICE) {
        this.PRICE = PRICE;
    }

    /**
     * @return double return the FAT
     */
    public double getFAT() {
        return FAT;
    }

    /**
     * @param FAT the FAT to set
     */
    public void setFAT(double FAT) {
        this.FAT = FAT;
    }

    /**
     * @return double return the CARBS
     */
    public double getCARBS() {
        return CARBS;
    }

    /**
     * @param CARBS the CARBS to set
     */
    public void setCARBS(double CARBS) {
        this.CARBS = CARBS;
    }

    /**
     * @return double return the FIBER
     */
    public double getFIBER() {
        return FIBER;
    }

    /**
     * @param FIBER the FIBER to set
     */
    public void setFIBER(double FIBER) {
        this.FIBER = FIBER;
    }

}
