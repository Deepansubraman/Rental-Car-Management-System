class car extends vehicle{
    public double dailyrate;
    public double milege;
    public car(String id,double dailyrate,double milege)
    {
        super(id);
        this.dailyrate=dailyrate;
        this.milege=milege;
    }
    public double rentalcost(int days)
    {
        return days*dailyrate;
    }
    public double milege()
    {
        return milege;
    }
}


