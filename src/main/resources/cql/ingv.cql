CREATE KEYSPACE driver_collect WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

CREATE TABLE driver_collect.driver_gps (
    idDriver uuid,
    latitude float,
    longitude float,
    altitude float,
    precision float,
    timestamp timestamp,
    PRIMARY KEY (idDriver)
) WITH comment = 'Q1. Quelle est la position d'un chauffeur ?';



CREATE KEYSPACE client_collect WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

CREATE TABLE client_collect.client_gps (
    idClient uuid,
    latitude float,
    longitude float,
    altitude float,
    precision float,
    timestamp timestamp,
    PRIMARY KEY (idClient)
) WITH comment = 'Q2. Quelle est la position du client ?';