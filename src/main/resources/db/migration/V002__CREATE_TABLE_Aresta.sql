CREATE TABLE aresta ( 
   id INT NOT NULL auto_increment primary key, 
   source CHAR(1) NOT NULL, 
   targer CHAR(1) NOT NULL, 
   distance DECIMAL(5,2),
   grafo_id INT NOT NULL
)