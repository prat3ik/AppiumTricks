/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        System.out.println(getAllAndroidInstalledPackages());
    }

    private static List<String> getAllAndroidInstalledPackages() {
        ProcessBuilder pb = new ProcessBuilder("adb", "shell", "pm", "list", "packages");
        Process pc = null;
        List<String> packages = new ArrayList<String>();

        try {
            Process p = pb.start();
            p.waitFor();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String _temp = null;
            while ((_temp = in.readLine()) != null) {
                System.out.println(_temp);
                packages.add(_temp);
            }
            System.out.println(packages);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packages;
    }


}
