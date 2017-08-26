package com.excitinglab.chatbot.util;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyUtils {

  private static Properties load(Path path) throws IOException {
    Properties properties = new Properties();
    Reader reader = Files.newBufferedReader(path);
    properties.load(reader);
    return properties;
  }

  public static String getString(Path propertyFilePath, String propertyName) throws IOException {
    return load(propertyFilePath).getProperty(propertyName);
  }

  public static Integer getInt(Path propertyFilePath, String propertyName) throws IOException {
    return Integer.parseInt(load(propertyFilePath).getProperty(propertyName));
  }

  public static Path getPath(Path propertyFilePath, String propertyName) throws IOException {
    return Paths.get(load(propertyFilePath).getProperty(propertyName));
  }

}
