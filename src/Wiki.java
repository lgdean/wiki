import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Wiki {
    public static void main(String[] args) {
        try {
            File file = new File("output/StandAlone.html");
            FileWriter writer = new FileWriter(file);
            writer.write("<html>");
            writer.write("<body>");
            writer.write("This is a stand-alone page about one thing.");
            writer.write("</body>");
            writer.write("</html>");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
