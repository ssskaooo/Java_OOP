package lectures.lec2.Ex006.Format;

import lectures.lec2.Ex006.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;


public class Doc extends lectures.lec2.Ex006.Format.TextFormat {
    
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<?Doc Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
