import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.Music;
import util.JsonReader;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("hello");


        System.out.println("Read from json");
        String jsonName = args[0].substring(0, args[0].lastIndexOf("."));
        JsonReader reader = new JsonReader();

        Music music = reader.readMusic(args[0]);

        System.out.println(music.toString());

        System.out.println();

        System.out.println("Write to xml");
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(new File(jsonName + ".xml"), music);



    }

}
