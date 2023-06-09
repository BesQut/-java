package DZ.DZ2.sem_2;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Log {
    static {
        try (FileInputStream in = new FileInputStream("Log.config")) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception a) {
            a.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
