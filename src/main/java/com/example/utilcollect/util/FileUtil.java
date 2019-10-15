package com.example.utilcollect.util;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;

public final class FileUtil {
    @NotNull
    public static String readFile(File filePath) throws IOException {
        StringBuilder res = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        String str;
        while ((str = reader.readLine()) != null) {
            res.append(str).append("\r\n");
        }
        return res.toString();
    }
}
