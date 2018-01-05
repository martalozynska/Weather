public class Main {

    public static void main(String[] args) throws Exception {
        URLReader urlreader = new URLReader();
        String line = urlreader.forecast("Lviv");
        GetJSON myJson = new GetJSON();
        System.out.println(myJson.getJson(line));
    }
}

