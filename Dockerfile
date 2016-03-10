FROM java:8

ADD simpleJPA.tar .

EXPOSE 4567

ENTRYPOINT ["/simpleJPA/bin/simpleJPA"]
