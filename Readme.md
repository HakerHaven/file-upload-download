## Spring Boot 文件上传 / 下载 

## Steps to Setup

**1. Clone the repository** 

```bash
git clone https://github.com/HakerHaven/file-upload-download.git
```

**2. Specify the file uploads directory**

Open `src/main/resources/application.properties` file and change the property `file.upload-dir` to the path where you want the uploaded files to be stored.

```
file.upload-dir=/Users/callicoder/uploads
```

**3. Run the app using maven**

```bash
cd file-upload-download
mvn spring-boot:run
```

That's it! The application can be accessed at `http://localhost:8080`.

You may also package the application in the form of a jar and then run the jar file like so -

```bash
mvn clean package
java -jar target/file-upload-download-0.0.1-SNAPSHOT.jar
```

**4. jar包启动后可以通过配置的端口进行页面访问测试文件上传与下载** 

1. 环境要求：JDK1.8
2. application.properties配置文件里面设置自己需要的参数，路径最好使用绝对路径
3. 启动命令
   java -jar file-upload-download-0.0.1-SNAPSHOT.jar -Dspring-config.location=application.properties
   带nohup日志启动
   nohup java -jar file-upload-download-0.0.1-SNAPSHOT.jar -Dspring-config.location=application.properties &

---

**5. 文件上传接口 http://localhost:9002/uploadFile**

报文示例，失败报文

```json
{
"timestamp": "2022-03-05T10:46:43.126+00:00",
"status": 500,
"error": "Internal Server Error",
"path": "/uploadFile"
}
```

成功报文

```json
{
"fileName": "IDM下载器(新).zip",
"fileDownloadUri": "http://localhost:9002/downloadFile/20220305+184803769+IDM下载器(新).zip",
"fileType": "file",
"size": 10439278,
"status": "OK"
}
```

根据status判断是否上传成功，链接地址可以存入库，进行后续的访问下载