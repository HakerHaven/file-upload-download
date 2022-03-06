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

**2. Run the app using maven**

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