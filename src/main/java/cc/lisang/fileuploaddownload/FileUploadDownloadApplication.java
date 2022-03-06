package cc.lisang.fileuploaddownload;

import cc.lisang.fileuploaddownload.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileUploadDownloadApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileUploadDownloadApplication.class, args);
    }
}
