FROM java:8
ADD /NumberDetails-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java","-jar","NumberDetails-0.0.1-SNAPSHOT.jar"]