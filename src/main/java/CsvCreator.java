import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvCreator {

    public static void main(String[] args) throws IOException {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Gugu", "Painter"));
        artists.add(new Artist("Gigi", "Musician"));
        artists.add(new Artist("Gigi", "Musician"));
        StringBuilder builder = new StringBuilder();
        for (Artist artist : artists) {
            String artistString = String.format("%s, %s\n", artist.getName(), artist.getType());
            builder.append(artistString);
           // builder.append("\n");
        }
        System.out.println(builder.toString());
        BufferedWriter writer = new BufferedWriter(new FileWriter("artists.csv"));
        writer.write(builder.toString());

        writer.close();

    }
}
