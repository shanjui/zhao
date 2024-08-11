# 使用 OpenJDK 17 作为基础镜像
FROM openjdk:11-jdk

# 将 JAR 文件复制到镜像中
COPY /etc/docker/jenkins_jar/zhaokai-pro-1.0-SNAPSHOT.jar /etc/docker/docker_jar/zhaokai-pro.jar

# 设置工作目录
WORKDIR /etc/docker/docker_jar

# 运行 JAR 文件
ENTRYPOINT ["java", "-jar", "zhaokai-pro.jar"]