import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
public class URLReader {

    public String forecast(String city) throws IOException {
        String data = "";
        URL weather = new URL("http://api.openweathermap.org/data/2.5/weather");
        String weather_new = weather.toString() + "?";
        String APPID = "5496614f4ca95e6dcc0445c1e7f3916d";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("q", city);
        params.put("APPID", APPID);
        for (String key : params.keySet()) {
            data += key + "=" + params.get(key) + "&";
        }
        data = data.substring(0, data.length() - 1);
        String new_data = weather_new + data;
        URL url = new URL(new_data);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            return inputLine;

        }

        in.close();
        return "";
    }
}
