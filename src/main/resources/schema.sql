CREATE TABLE talent_entity
(
    talent_id  BIGINT NOT NULL AUTO_INCREMENT,
    full_name  VARCHAR(255),
    mail       VARCHAR(255),
    password   VARCHAR(255),
    age        INT,
    avatar_url VARCHAR(255),
    CONSTRAINT pk_talententity PRIMARY KEY (talent_id)
);

CREATE TABLE position_entity
(
    position          VARCHAR(255) NOT NULL,
    talent_id         BIGINT       NOT NULL,
    short_description VARCHAR(255),
    full_description  VARCHAR(255),
    CONSTRAINT pk_positionentity PRIMARY KEY (position)
);

ALTER TABLE position_entity
    ADD CONSTRAINT FK_POSITIONENTITY_ON_TALENT FOREIGN KEY (talent_id) REFERENCES talent_entity (talent_id);
