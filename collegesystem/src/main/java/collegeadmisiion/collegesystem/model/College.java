package collegeadmisiion.collegesystem.model;





@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String collegeName;
    private String branch;
    private String category;
    private double cutoffPercentile;
    private String region;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getCutoffPercentile() { return cutoffPercentile; }
    public void setCutoffPercentile(double cutoffPercentile) { this.cutoffPercentile = cutoffPercentile; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
}

