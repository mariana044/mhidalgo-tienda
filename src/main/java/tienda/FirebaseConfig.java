
package com.tienda;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FirebaseConfig {

    private final Properties prop = new Properties();

    public FirebaseConfig() {
        try (InputStream input = new FileInputStream("firebase.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getBucketName() {
        return prop.getProperty("firebase.bucket.name");
    }

    public String getStoragePath() {
        return prop.getProperty("firebase.storage.path");
    }

    public String getJsonPath() {
        return prop.getProperty("firebase.json.path");
    }

    public String getJsonFile() {
        return prop.getProperty("firebase.json.file");
    }
}
