package models.dao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class DataAccess {
   public static enum StorageType {
        USERS, MENUS, ITEMS, CATEGORIES,COUNTERS;
    }



    public void saveToStorage(StorageType type, Object ob) {
        ObjectOutputStream out = null;
        try {
            String OUTPUT_DIR =  this.getClass().getClassLoader().getResource("DataFiles").getPath();
            System.out.println(OUTPUT_DIR);
            //URI uri = ClassLoader.getSystemResource("DataFiles").toURI();
            String mainPath = Paths.get(OUTPUT_DIR).toString();
            Path path = Paths.get(mainPath ,type.toString());
            out = new ObjectOutputStream(Files.newOutputStream(path));
            out.writeObject(ob);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(out != null) {
                try {
                    out.close();
                } catch(Exception e) {}
            }
        }
    }

    public Object readFromStorage(StorageType type) {
        ObjectInputStream in = null;
        Object retVal = null;
        try {
            String OUTPUT_DIR =  this.getClass().getClassLoader().getResource("DataFiles").toURI().getPath();

            URI uri = ClassLoader.getSystemResource("DataFiles").toURI();
            String mainPath = Paths.get(uri).toString();
            Path path = Paths.get(mainPath ,type.toString());

            //Path path = Paths.get(OUTPUT_DIR, type.toString());
            System.out.println("file path: " + path);
            in = new ObjectInputStream(Files.newInputStream(path));
            retVal = in.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch(Exception e) {}
            }
        }
        return retVal;
    }

}
