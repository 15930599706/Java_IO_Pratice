import java.io.File;

/***
 * @author author
 * @Description
 * @Date Created in 17:30 2019/11/1
 */
public class demo {
    //File类 文件的遍历
    public static void listAllFiles(File dir){
        if (dir == null || !dir.exists()){
            return;
        }
        if (dir.isFile()){
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()){
            listAllFiles(file);
        }
    }

    public static void main(String[] args) {
        //使用File类进行文件的遍历
        File file = new File("D:\\myIDEAWorkP_duyanhui\\Java_IO_Pratice");
        listAllFiles(file);
    }
}
