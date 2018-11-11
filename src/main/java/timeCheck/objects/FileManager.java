package timeCheck.objects;

import java.io.FilenameFilter;
import java.util.*;
import java.io.File;

public class FileManager implements Manger{
    public Set<String> getExtensionList(String folder){
        File directory = new File(folder);

        Set<String> extList = new TreeSet<String>();

        for (String fileName : directory.list()){
            File file = new File(directory.getAbsolutePath() + "//" + fileName);

            int i = fileName.lastIndexOf(".");
            if (file.isFile() && i != -1){
                extList.add(fileName.substring(i + 1, fileName.length()));
            }

        }
        return extList;
    }

    public Map<String, Integer> getExtensionCount(String folder) {
        File directory = new File(folder);
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String ext : getExtensionList(folder)){
            FilenameFilter filter = new CustomFileFilter(ext);
            map.put(ext, directory.listFiles(filter).length);
        }
        return map;
    }
}
