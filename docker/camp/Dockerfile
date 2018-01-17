FROM 316263240806.dkr.ecr.ap-northeast-1.amazonaws.com/tesla/base-java
ADD opt/SyncQueue/CampService.jar /opt/SyncQueue/
ADD match.py /opt/SyncQueue/
ADD requirement.txt /opt/SyncQueue/
RUN apt-get update && apt-get install -y \
  curl \
  less
RUN curl -kL https://bootstrap.pypa.io/get-pip.py | python3
RUN pip install -r /opt/SyncQueue/requirement.txt
EXPOSE 8080
WORKDIR /opt/SyncQueue/
CMD ["java", "-Xms256m", "-Xmx512m", "-jar", "CampService.jar"]
