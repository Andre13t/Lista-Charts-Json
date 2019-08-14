package Json;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Array;

public class LerJson {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader reader = new FileReader( "arrayjson.json");
        BufferedReader bReader =  new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();

        String linha_um;
        while ((linha_um = bReader.readLine()) != null){
            builder = builder.append(linha_um);
            System.out.println(builder);
        }

    }
}
