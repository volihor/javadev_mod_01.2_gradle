import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gson.GsonBuilder;

public class MyName
{
    public static void main( String[] args )
    {
        Map<String, String> mapList = new LinkedHashMap<String, String>();
        mapList.put("name", "Igor");
        mapList.put("lastName", "Voloshyn");

        String json = new GsonBuilder().create().toJson(mapList);
        System.out.println(json);
    }
}
