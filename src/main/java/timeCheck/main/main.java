package timeCheck.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import timeCheck.objects.FileManager;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("timecontext.xml");
        FileManager manager = (FileManager) context.getBean("fileManager");
        manager.getExtensionCount("/home/sirius/Документы");
        manager.getExtensionCount("/home/sirius");

    }
}
