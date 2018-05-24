package cn.lin.luo.tian;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        File baseFile = new File("D:\\Markit\\5.1.0");
        baseFile.delete();
    }
}
