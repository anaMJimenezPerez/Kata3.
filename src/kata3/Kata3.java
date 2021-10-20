package kata3;


public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}