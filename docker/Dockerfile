FROM 316263240806.dkr.ecr.ap-northeast-1.amazonaws.com/tesla/office

ADD target/ConvertQueueService.jar /opt/SyncQueue/
EXPOSE 8080
WORKDIR /opt/SyncQueue/
CMD ["java", "-Xms256m", "-Xmx512m", "-jar", "SyncQueue.jar"]
