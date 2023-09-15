
/**
 * Returns quake entries that have magnitude higher than the minimal magnitude.
 * 
 * 
 * @ Snehil S P
 * @ Version: 1.0 (02 August 2023)
 */

public class MinMagFilter implements Filter {
    private double magMin;
    private String name;
    
    public MinMagFilter(double min, String filterName) { 
        magMin = min;
        name = filterName;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getMagnitude() >= magMin;
    } 
    
    public String getName() {
        return name;
    }
}
