import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args){ 
        HashMap<String, String> tracks = new HashMap<String, String>();
        tracks.put("Who let the Dogs out", "Who who who who who");
        tracks.put("Miracles", "It's a Miracle");
        tracks.put("Super Freak", "She's a very kinky girl");
        tracks.put("Circles", "I'll be the bad guy now");

        String val = tracks.get("Super Freak");

        for(String key : tracks.keySet()){
            System.out.println(String.format("Track: %s: Lyrics: %s", key, tracks.get(key)));
        }
    }
}