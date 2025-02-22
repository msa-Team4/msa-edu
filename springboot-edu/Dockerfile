# 1. Base Image 설정 (Java 21 사용)
FROM --platform=linux/amd64 eclipse-temurin:21-jdk

WORKDIR /app

# 4. JAR 파일을 컨테이너 내부로 복사
COPY target/msa-0.0.1-SNAPSHOT.jar app.jar

# 5. 컨테이너 실행 시 JAR 파일 실행
CMD ["java", "-jar", "app.jar"]