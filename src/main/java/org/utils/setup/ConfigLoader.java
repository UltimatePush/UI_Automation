package org.utils.setup;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class ConfigLoader {

    public static String config_file = "config.properties";
    public static void loadConfig(){
        Properties prop = new Properties();
        try{
            FileInputStream file = new FileInputStream(config_file);
            prop.load(file);
            for(Setup keys : Setup.values()){
                Field field = Setup.class.getField(keys.name());
                ConfigKey annot = field.getAnnotation(ConfigKey.class);
                if(annot != null){
                    String key = annot.value();
                    String value = prop.getProperty(key);
                    if(value != null){
                        keys.setValue(value);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
