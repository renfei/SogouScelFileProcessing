import net.renfei.FileProcessing;
import net.renfei.SogouScelFileProcessing;

import java.io.IOException;
import java.util.Objects;

/**
 * @author renfei
 */
public class Test {
    public static void main(String[] args) {
        //单个scel文件转化
        FileProcessing scel = new SogouScelFileProcessing();
        scel.parseFile(Objects.requireNonNull(Test.class.getClassLoader().getResource("财会词汇大全.scel")).getPath(), "/Users/renfei/Downloads/财会词汇大全.txt", true);
        //多个scel文件转化为一个txt (格式：拼音字母 词)
        try {
            scel.parseFiles("/Users/renfei/Downloads", "/Users/renfei/Downloads/txt/汇总.txt", false);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //多个scel文件转化为多个txt文件
        scel.setTargetDir("/Users/renfei/Downloads/多对多");//转化后文件的存储位置
        scel.parseFile("/Users/renfei/Downloads", false);
    }
}
