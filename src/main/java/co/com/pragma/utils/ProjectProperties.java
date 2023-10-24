package co.com.pragma.utils;

public class ProjectProperties {

    private ProjectProperties(){}

    static ConfigFileReader reader = new ConfigFileReader("imageComparison.properties");

    public static String getPathToSaveScreenshot(){ return reader.getPropertyByKey("PATH_TO_SAVE_SCREENSHOT"); }

    public static String getPathToSaveResult(){ return reader.getPropertyByKey("PATH_TO_SAVE_RESULT"); }
}
