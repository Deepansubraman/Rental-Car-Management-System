class truck extends vehicle{
    public double dailyrate;
    public double milege;
    public truck(String id,double dailyrate,double milege)
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



