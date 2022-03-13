## Spring Boot 文件上传 / 下载 

## 安装步骤

**1. 下载资源** 

```shell
git clone https://github.com/HakerHaven/file-upload-download.git
```

**2. 指定文件上传目录**

打开 `src/main/resources/application.properties` 文件 ，更改属性 `file.upload-dir` 确定文件上传的仓库位置。

```properties
file.upload-dir=/Users/callicoder/uploads
```

**3. 使用 maven 运行应用程序**

```shell
cd file-upload-download
mvn spring-boot:run
```

应用访问 `http://localhost:8080`.

您也可以将应用程序以 jar 的形式打包，然后像这样运行 jar 文件

```shell
mvn clean package
java -jar target/file-upload-download-0.0.1-SNAPSHOT.jar
```

**4. jar包启动后可以通过配置的端口进行页面访问测试文件上传与下载** 

1. 环境要求：JDK1.8
2. application.properties 配置文件里面设置自己需要的参数，路径最好使用绝对路径
3. 启动命令

```shell
java -jar file-upload-download-0.0.1-SNAPSHOT.jar -Dspring-config.location=application.properties
```

---

**5. 文件上传接口**

 POST请求
   1. 文件上传：http://localhost:9002/uploadFile

 GET请求：
   1. 文件下载：json 返回值`fileDownloadUri`

---

**失败报文**

```json
{
"timestamp": "2022-03-05T10:46:43.126+00:00",
"status": 500,
"error": "Internal Server Error",
"path": "/uploadFile"
}
```

**成功报文**

```json
{
"fileName": "IDM下载器(新).zip",
"fileDownloadUri": "http://localhost:9002/downloadFile/20220305+184803769+IDM下载器(新).zip",
"fileType": "file",
"size": 10439278,
"status": "OK"
}
```

根据 status 判断是否上传成功，链接地址可以存入库，进行后续的访问下载

git merge
继续开发，并完成。