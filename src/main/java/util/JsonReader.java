package util;

import models.Music;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {

    public Music readMusic(String url) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        final Music music = mapper.readValue(new File(url), Music.class);
        return music;
    }

}
