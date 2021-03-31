package experiment3_10;

public class Client {
    public static void main(String[] args) {
        Photograph photograph = new Photograph();
        Filter filter;
       // filter = new BlackWhiteFilter();
       // filter = new MonochromaticFilter();
        filter = new NostalgicFilter();
        photograph.setFilter(filter);
        photograph.doFilter();
    }
}