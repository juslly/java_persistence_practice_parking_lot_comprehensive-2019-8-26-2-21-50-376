CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age int(4) NOT NULL
);

CREATE TABLE parkingLot (
  parkingLotId INTEGER PRIMARY KEY,
  capacity int(4) NOT NULL,
  availablePositionCount int(4) NOT NULL
);
