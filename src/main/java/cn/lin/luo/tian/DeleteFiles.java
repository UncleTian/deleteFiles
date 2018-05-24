package cn.lin.luo.tian;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFiles {
    public static void main(String[] args) {
        String outputFile = "D:\\Markit\\New folder\\log.txt";
        try (FileWriter fw = new FileWriter(outputFile);) {
            long start = System.currentTimeMillis();
            File baseFile = new File("D:\\Markit\\5.1.1");
            deleteFiles(baseFile, fw);
            long end = System.currentTimeMillis();
            System.out.println("total delete time : " + (end - start) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void deleteFiles(File file, FileWriter fw) throws IOException {
        if (file.isFile()) {
            System.out.println("delete file : " + file.getName());
            fw.write("delete file : " + file.getName() + System.lineSeparator());
            file.delete();
        }
        else {
            for (File f : file.listFiles()) {
                deleteFiles(f, fw);
            }
            System.out.println("delete directory : " + file.getName());
            fw.write("delete directory : " + file.getName() + System.lineSeparator());
            file.delete();
        }
    }
}
