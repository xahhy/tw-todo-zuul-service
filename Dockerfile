FROM anapsix/alpine-java:8
RUN apk add --no-cache curl netcat-openbsd
COPY ./build/libs/*SNAPSHOT.jar /app.jar
COPY ./entrypoint.sh /entrypoint.sh
ENV JAVA_OPTS=""
ENV PROFILE="pro"
HEALTHCHECK --interval=10s --timeout=3s \
  CMD curl -f http://localhost:8088/api/health || exit 1
EXPOSE 8088
ENTRYPOINT ["sh", "entrypoint.sh"]

