public class Subject {
    private int  datascience;
    private int cloud;
    private int maths;
    private  int distributedComputing;

    public Subject()
    {
        
    }
    
    public Subject(int datascience, int cloud, int maths, int distributedComputing) {
        this.datascience = datascience;
        this.cloud = cloud;
        this.maths = maths;
        this.distributedComputing = distributedComputing;
    }

    public int getDatascience() {
        return datascience;
    }

    public void setDatascience(int datascience) {
        this.datascience = datascience;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getDistributedComputing() {
        return distributedComputing;
    }

    public void setDistributedComputing(int distributedComputing) {
        this.distributedComputing = distributedComputing;
    }

    @Override
    public String toString() {
        return "Subject [datascience=" + datascience + ", cloud=" + cloud + ", maths=" + maths
                + ", distributedComputing=" + distributedComputing + "]";
    }

    

}
