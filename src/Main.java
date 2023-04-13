import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, InterruptedException {

        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();

        while (true){
            var x = clipboard.getData(DataFlavor.stringFlavor);
            System.out.println(x);
            Thread.sleep(1000);
        }

    }
}
