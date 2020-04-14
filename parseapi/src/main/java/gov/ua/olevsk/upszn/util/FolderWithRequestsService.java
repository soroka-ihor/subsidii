package gov.ua.olevsk.upszn.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FolderWithRequestsService {
    static String path;
    private static File[] files;

    static
    {
          path = "C:/Requests";
          files = new File(path).listFiles();
    }


    public static List<File> extractRequestFromTheFolder() {
        int requestCounter = 0;
        List<File> requests = new ArrayList<>();

        if (files != null && files.length > 0) {
            for (File file : files) {
                if ((file.getName().startsWith("SP") && isFileXml(file)) ||
                    (file.getName().startsWith("OS") && isFileXml(file)) ||
                    (file.getName().startsWith("BS") && isFileXml(file)) ||
                    (file.getName().startsWith("ES") && isFileXml(file))) {
                    requests.add(file);
                }
            }
        } else {
            System.out.println("There's no such directory [" + path.replace("/", "\\") + "]" + ". Or" +
                    " the folder doesn't have any files in it.");
        }

        return requests;
    }

    private static boolean isFileXml(File file) {
        if (file.getName().endsWith(".xml")) {
            return true;
        } else {
            return false;
        }
    }

}
