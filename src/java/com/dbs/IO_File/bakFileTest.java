package src.java.com.dbs.IO_File;

import java.io.File;
import java.io.IOException;

/**
 * 删除源文件同时备份到新目录下
 */
public class bakFileTest {
    public static void main(String[] args) throws IOException {
        String source = "D:\\tmp\\sourceDir\\source.txt";
        String destDir = "D:\\tmp\\targetDir";
        String filename = "source.txt";
        bak(filename, source, destDir, true);
    }

    public static String bak(String filename, String sourceFile, String dest, boolean cover) throws IOException {
        String fileSplitter = File.separator;
        File source = new File(sourceFile);
        String destDir = dest + fileSplitter + "bak";
        String destFile = destDir + fileSplitter + filename + "_" + DateUtils.getCurrentTimeStack();
        File newDir = new File(destDir);
        File newFile = new File(destFile);
        System.out.println("旧路径：" + source.getAbsolutePath());

        // 新路径是否存在
        if (newDir.exists()) {
            if (cover) {
                source.renameTo(newFile);
                System.out.println("成功转移到：" + newFile.getAbsolutePath());
            } else {
                System.out.println("文件已存在");
            }
        } else {

            // 新路径还未创建，则自动在此创建
            File fileParent = newFile.getParentFile();
            if(!fileParent.exists()) {
                fileParent.mkdirs();
            }
            boolean move = source.renameTo(newFile);
            System.out.println("move:" + move);
            System.out.println("成功转移到：" + newFile.getAbsolutePath());
        }
        return "";
    }

    public static void bakCover(String filename, String sourceFile, String dest, boolean cover) {
        String fileSplitter = File.separator;
        File source = new File(sourceFile);
        String destFile = dest + fileSplitter + "bak" + fileSplitter + filename + "_" + DateUtils.getCurrentTimeStack();
        File newFile = new File(destFile);
        System.out.println("旧路径：" + source.getAbsolutePath());
        source.renameTo(newFile);
        System.out.println("成功转移到：" + newFile.getAbsolutePath());
    }
}
