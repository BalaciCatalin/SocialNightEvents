CREATE TABLE CLIENT (ID BIGINT NOT NULL, EMAIL VARCHAR(255), FIRSTNAME VARCHAR(255), LASTNAME VARCHAR(255), PHONENUMBER INTEGER, PRIMARY KEY (ID))
CREATE TABLE LOCATION (ID BIGINT NOT NULL, CITY VARCHAR(255), DESCRIPTION VARCHAR(255), NAME VARCHAR(255), PHONENUMBER INTEGER, STREET VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE EVENT (ID BIGINT NOT NULL, DATE DATE, DESCRIPTION VARCHAR(255), ENTRYPRICE FLOAT, IMAGE BYTEA, MUSICTYPE VARCHAR(255), NAME VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE CLIENT_EVENT (Client_ID BIGINT NOT NULL, eventList_ID BIGINT NOT NULL, PRIMARY KEY (Client_ID, eventList_ID))
CREATE TABLE LOCATION_EVENT (Location_ID BIGINT NOT NULL, eventList_ID BIGINT NOT NULL, PRIMARY KEY (Location_ID, eventList_ID))
CREATE TABLE EVENT_CLIENT (Event_ID BIGINT NOT NULL, clientList_ID BIGINT NOT NULL, PRIMARY KEY (Event_ID, clientList_ID))
ALTER TABLE CLIENT_EVENT ADD CONSTRAINT FK_CLIENT_EVENT_Client_ID FOREIGN KEY (Client_ID) REFERENCES CLIENT (ID)
ALTER TABLE CLIENT_EVENT ADD CONSTRAINT FK_CLIENT_EVENT_eventList_ID FOREIGN KEY (eventList_ID) REFERENCES EVENT (ID)
ALTER TABLE LOCATION_EVENT ADD CONSTRAINT FK_LOCATION_EVENT_Location_ID FOREIGN KEY (Location_ID) REFERENCES LOCATION (ID)
ALTER TABLE LOCATION_EVENT ADD CONSTRAINT FK_LOCATION_EVENT_eventList_ID FOREIGN KEY (eventList_ID) REFERENCES EVENT (ID)
ALTER TABLE EVENT_CLIENT ADD CONSTRAINT FK_EVENT_CLIENT_clientList_ID FOREIGN KEY (clientList_ID) REFERENCES CLIENT (ID)
ALTER TABLE EVENT_CLIENT ADD CONSTRAINT FK_EVENT_CLIENT_Event_ID FOREIGN KEY (Event_ID) REFERENCES EVENT (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)