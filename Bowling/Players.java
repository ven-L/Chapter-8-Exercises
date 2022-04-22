public class Players 
{
        private String pName;
        private int totalScore;

        Players(String pName, int totalScore)
        {
            this.pName = pName; 
            this.totalScore = totalScore;
        }

    /**
     * @return String return the pName
     */
    public String getPName() 
    {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setPName(String pName) 
    {
        this.pName = pName;
    }

    /**
     * @return int return the totalScore
     */
    public int getTotalScore() 
    {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(int totalScore)
    {
        this.totalScore = totalScore;
    }

}
