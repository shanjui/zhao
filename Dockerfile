# 使用 OpenJDK 17 作为基础镜像
FROM openjdk:11-jdk

# 将 JAR 文件复制到镜像中
COPY target/zhaokai-test-1.0-SNAPSHOT.jar /app/zhaokai-test.jar

# 设置工作目录
WORKDIR /app

# 运行 JAR 文件
ENTRYPOINT ["java", "-jar", "zhaokai-test.jar"]