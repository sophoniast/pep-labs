CREATE TABLE post(id SERIAL NOT NULL, 
post VARCHAR(255),PRIMARY KEY(id.post), 
CONSTRAINT user_fk FOREIGN KEY (id.user) REFERENCES  user(id.user));