
package kata3;


import java.awt.Dimension;
import static java.awt.Frame.NORMAL;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISTOGRAM");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel panel;
        panel = new ChartPanel(createChart(createDataset()));
        panel.setPreferredSize(new Dimension(500,400));
        return panel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histogram JFreeChart", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(3, "", "ulpgc.es");
        dataSet.addValue(7, "", "gmail.com");
        dataSet.addValue(5, "", "hotmail.es");
        return dataSet;
    }
    
}


