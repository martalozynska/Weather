import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.parser.ParseException;


public class GetJSON {
    public String getJson(String line) throws ParseException {
        JsonObject gson = new Gson().fromJson(line, JsonObject.class);
        String description = gson.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").toString();
        String temp_Klv = gson.get("main").getAsJsonObject().get("temp").toString();
        double double_temp_Cel = Float.parseFloat(temp_Klv) - 273.15;
        String temp_Cel = Float.toString((float) double_temp_Cel);

        System.out.println("result: ");
        System.out.println("description: " + description);
        System.out.println("temperature in Kelvin: " + temp_Klv);
        System.out.println("temperature in Celsius: " + temp_Cel);

        return "";
    }

}
