package mongoDB.tableMongo;

import com.google.gson.JsonObject;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public abstract class IMongoHelper {
    public String convertToJsonObject(){
        JsonObject j = new JsonObject();
        try {
            for (Field f : this.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                MongoField m = (MongoField) f.get(this);
                if (m.getValue() != null) {
                    switch (m.getDataType()){
                        case TEXT:
                        case BOOLEAN:
                            j.addProperty(f.getName(), m.getValue());
                            break;
                        case NUMERIC:
                            j.addProperty(f.getName(),new BigDecimal(m.getValue()));
                            break;
                    }

                }
            }
            return j.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
