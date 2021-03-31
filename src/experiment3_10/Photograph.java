package experiment3_10;

public class Photograph {
    private Filter filter;
    public void setFilter(Filter filter){
        this.filter = filter;
    }

    public void doFilter(){
        filter.doFilter();
    }
}
