# SQLvsNOSQL
Wczytanie 1000 rekordów do bazy danych SQL oraz NOSQL

MYSQL		MongoDB	
WRITE	READ	WRITE	READ
1551	161	1176	76
1491	235	1200	74
1623	157	1252	76
1469	219	1003	71
1667	348	991	70
1560,2	224	1124,4	73,4

Okazuje się, że baza danych noSQL jest szybsza od tradycyjnej bazy SQL. Badania przeprowadzono na loklanych bazach dancyh na tym samym urządzeniu. 
Zapis danych do bazy noSQL zajmuje 72% czasu, który potrzebuje SQL na zapis tych samych danych.
Odczyt danych z bazy noSQL zajmuje 32% czasu, który potrzebuje SQL na odczyt tych samych danych
