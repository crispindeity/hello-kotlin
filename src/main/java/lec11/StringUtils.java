package lec11;

public abstract class StringUtils {

    private StringUtils() {}

    public static boolean isDriectoryPath(String path) {
        return path.endsWith("/");
    }
}
