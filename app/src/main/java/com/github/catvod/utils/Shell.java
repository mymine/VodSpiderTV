package com.github.catvod.utils;
import io.github.pixee.security.SystemCommand;


public class Shell {

    public static void exec(String command) {
        try {
            int code = SystemCommand.runCommand(Runtime.getRuntime(), command).waitFor();
            if (code != 0) throw new RuntimeException("Shell command failed with exit code " + code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
