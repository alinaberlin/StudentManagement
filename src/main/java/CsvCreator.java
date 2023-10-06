import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvCreator {

    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Gugu", "Painter"));
        artists.add(new Artist("Gigi", "Musician"));
        artists.add(new Artist("Gigi", "Musician"));
        StringBuilder builder = new StringBuilder();
        for (Artist artist : artists) {
            String artistString = String.format("%s, %s", artist.getName(), artist.getType());
            builder.append(artistString);
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
