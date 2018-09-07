/* посещения */
CREATE TABLE visitation (
  Visit_id INTEGER,
  Date     DATE,
  W_id     INTEGER
);

INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (1, '2017-01-10', 2);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (2, '2017-01-11', 5);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (3, '2017-01-13', 1);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (4, '2017-01-15', 4);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (5, '2017-01-17', 3);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (6, '2017-01-21', 2);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (7, '2017-01-21', 2);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (8, '2017-01-25', 7);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (9, '2017-02-01', 9);
INSERT INTO visitation (Visit_id, Date, W_id)
VALUES (10, '2017-02-12', 10);


/* сотрудники документы */
CREATE TABLE employees_documentation (
  SD_CHAIN_ID INTEGER,
  W_id        INTEGER,
  D_id        INTEGER
);

INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (1, 9, 1);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (2, 1, 5);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (3, 2, 2);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (4, 6, 9);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (5, 3, 4);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (6, 7, 7);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (7, 4, 3);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (8, 10, 10);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (9, 5, 8);
INSERT INTO employees_documentation (SD_CHAIN_ID, W_id , D_id)
VALUES (10, 8, 6);


/* документы общие */
CREATE TABLE common_documents (
  D_id INTEGER,
  Name TEXT,
  URL  TEXT
);

INSERT INTO common_documents (D_id, Name , URL)
VALUES (1, 'паспорт', 'https://gs-progect.com/documents/14638');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (2, 'инн', 'https://gs-progect.com/documents/56676');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (3, 'снилс', 'https://gs-progect.com/documents/45258');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (4, 'свидетельство о браке', 'https://gs-progect.com/documents/54549');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (5, 'номер зарплатной карты', 'https://gs-progect.com/documents/98358');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (6, 'медицинская книжка', 'https://gs-progect.com/documents/11747');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (7, 'загранпаспорт', 'https://gs-progect.com/documents/92312');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (8, 'водительские права', 'https://gs-progect.com/documents/47676');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (9, 'свидетельство о рождении', 'https://gs-progect.com/documents/78921');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (10, 'номер страхового полиса', 'https://gs-progect.com/documents/57633');
INSERT INTO common_documents (D_id, Name , URL)
VALUES (11, 'адрес пропрописки', 'https://gs-progect.com/documents/95778');


/* техническое задание */
CREATE TABLE specifications (
  TZ_id INTEGER,
  Name  TEXT,
  Date  DATE,
  URL   TEXT,
  P_id  INTEGER
);

INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (1, 'ТЗ на поисковый сервис', '2013-01-01', 'https://gs-progect.com/TZ/54852', 1);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (2, 'ТЗ на месенджер', '2013-06-02', 'https://gs-progect.com/TZ/218568', 2);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (3, 'ТЗ на видеосервис', '2014-01-01', 'https://gs-progect.com/TZ/24862', 3);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (4, 'ТЗ на сервис криптовалют', '2014-06-02', 'https://gs-progect.com/TZ/45546', 4);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (5, 'ТЗ на сервис геолокации', '2015-01-01', 'https://gs-progect.com/TZ/14822', 5);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (6, 'ТЗ на музыкальную библиотеку', '2015-06-02', 'https://gs-progect.com/TZ/78561', 6);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (7, 'ТЗ на операционную систему', '2016-01-01', 'https://gs-progect.com/TZ/178965', 7);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (8, 'ТЗ на фентези стратегию', '2016-06-02', 'https://gs-progect.com/TZ/76225', 8);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (9, 'ТЗ на шутер', '2017-01-01', 'https://gs-progect.com/TZ/745368', 9);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (10, 'ТЗ на видео редактор', '2017-06-02', 'https://gs-progect.com/TZ/45368', 10);
INSERT INTO specifications (TZ_id, Name , Date, URL, P_id)
VALUES (11, 'ТЗ на приложение управления автомобилем', '2018-01-01', 'https://gs-progect.com/TZ/48228', 10);





/* сотрудник */
CREATE TABLE employee (
  W_id     INTEGER,
  Birth    DATE,
  FIO      TEXT,
  P_DATA   TEXT,
  Status   TEXT,
  Vacation BOOL
);

INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (1, '1970-03-11','Петров Виктор Иванович', '3243 234423', 'РАБОТАЕТ', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (2, '1965-05-14','Иванов Дмитрий Александрович', '6735 368935', 'УВОЛЕН', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (3, '1974-02-25','Сидоров Сергей Станиславович', '7893 876542', 'РАБОТАЕТ', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (4, '1990-01-21','Никоноров Степан Бурцевич', '8720 957642', 'РАБОТАЕТ', true);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (5, '1981-06-17','Москвина Дарья Петровна', '3467 859302', 'УВОЛЕН', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (6, '1969-10-16','Стеганович Петр Алексеевич', '1019 450184', 'РАБОТАЕТ', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (7, '1991-12-17','Гурьев Денис Борисович', '0912 062744', 'РАБОТАЕТ', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (8, '1899-06-09','Соловьева Александра Михайловна', '0295 256842', 'УВОЛЕН', true);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (9, '1968-11-16','Степанченко Владимир Владимирович', '1019 450184', 'РАБОТАЕТ', false);
INSERT INTO employee (W_id, Birth, FIO, P_DATA, Status, Vacation)
VALUES (10, '1975-10-25','Зиновьева Виктория Станиславовна', '1063 450156', 'РАБОТАЕТ', false);


/* сотрудники проекты */
CREATE TABLE employees_projects (
  SP_CHAIN_ID INTEGER,
  W_id        INTEGER,
  P_id        INTEGER
);

INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (1, 5, 11);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (2, 4, 3);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (3, 1, 9);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (4, 9, 2);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (5, 2, 1);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (6, 10, 7);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (7, 3, 4);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (8, 6, 5);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (9, 7, 8);
INSERT INTO employees_projects (SP_CHAIN_ID, W_id, P_id)
VALUES (10, 8, 6);


/* проекты */
CREATE TABLE projects (
  P_ID        INTEGER,
  Name        TEXT,
  S_Date      DATE,
  F_Date      DATE,
  C_id        INTEGER,
  Description TEXT,
  E_ID        INTEGER
);

INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (1, 'поисковый сервис', '2013-01-01', '2013-06-01', 1, 'разработка поискового сервиса', 1);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (2, 'мессенджер', '2013-06-02', '2013-12-31', 3, 'разработка мессенджера', 1);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (3, 'сервис видеотрансляций', '2014-01-01', '2014-06-01', 2, 'разработка сервиса видео трансляций', 2);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (4, 'сервис криптовалют', '2014-06-02', '2014-12-31', 7, 'разработка сервиса криптовалюты', 5);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (5, 'сервис геолокации', '2015-01-01', '2015-06-01', 8, 'разработка сервиса геолокации', 5);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (6, 'музыкальная библиотека', '2015-06-02', '2015-12-31', 5, 'разработка музыкальной библиотеки', 2);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (7, 'операционная система', '2016-01-01', '2016-06-01', 2, 'разработка операционной системы', 2);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (8, 'фентези стратегия', '2016-06-02', '2016-12-31', 4, 'разработка стратегии в жанре фентези', 7);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (9, 'шутер в виртуальной реальности', '2017-01-01', '2017-06-01', 2, 'разработка шутера в виртуальной реальности', 19);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (10, 'видео редактор', '2017-06-02', '2017-12-31', 9, 'разработка приложения видеоредактора', 5);
INSERT INTO projects (P_ID, Name, S_Date, F_Date, C_id, Description, E_ID)
VALUES (11, 'приложение управления автомобилем', '2018-01-01', '2018-06-01', 10, 'разработка приложения для управления автомобилем', 6);


/* этапы */
CREATE TABLE phase (
  E_ID        INTEGER,
  Name        TEXT,
  Description TEXT,
  E_Date      DATE
);

INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (1, 'Планирование', 'разработка плана', '2017-06-01');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (2, 'Проектирование', 'проектирование основной архитектуры', '2017-06-15');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (3, 'Разработка эскизного проекта', 'Разработка предварительного решения', '2017-07-01');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (4, 'Разработка технического проекта', 'Разработка окончательного варианта системы', '2017-07-15');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (5, 'Разработка рабочей документации', 'Разработка документации на систему', '2017-08-01');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (6, 'Адаптация системы', 'Адаптация системы', '2017-08-15');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (7, 'Подготовка системы к вводу', 'Подготовка системы к вводу в действие', '2017-09-01');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (8, 'Пуско-наладочные работы', 'проведение пуско-наладочных работ', '2017-09-15');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (9, 'Опытная эксплуатация', 'Проведение приемочных испытаний', '2017-10-01');
INSERT INTO phase (E_ID , Name, Description, E_Date)
VALUES (10, 'Ввод в эксплуатацию', 'Приемка системы в промышленную эксплуатацию', '2017-10-31');




/* транзакции */
CREATE TABLE transactions (
  T_id INTEGER,
  Name TEXT,
  C_id INTEGER,
  P_id INTEGER,
  Sum  INTEGER
);

INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (1, 'Отлата выполнения', 1, 1, 250000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (2, 'Отлата выполнения', 2, 3, 750000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (3, 'Отлата выполнения', 3, 2, 600000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (4, 'Отлата выполнения', 4, 7, 420000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (5, 'Отлата выполнения', 6, 5, 800000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (6, 'Отлата выполнения', 7, 2, 170000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (7, 'Отлата выполнения', 8, 4, 840000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (8, 'Отлата выполнения', 9, 2, 750000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (9, 'Отлата выполнения', 10, 9, 250000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (10, 'Отлата выполнения', 11, 10, 620000);
INSERT INTO transactions (T_id , Name, C_id, P_id, Sum)
VALUES (11, 'Отлата выполнения', 5, 8, 460000);


/* встреча */
CREATE TABLE meeting (
  M_ID INTEGER,
  Name TEXT,
  C_id INTEGER,
  P_id INTEGER,
  Date DATE,
  Time TIME
);

INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (1, 'обсуждение ТЗ', 1, 1, '2016-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (2, 'обсуждение реализации', 1, 1, '2016-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (3, 'обсуждение в эксплуатацию', 1, 1, '2016-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (4, 'обсуждение ТЗ', 3, 2, '2016-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (5, 'обсуждение реализации', 3, 2, '2017-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (6, 'ообсуждение в эксплуатацию', 3, 2, '2017-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (7, 'обсуждение ТЗ', 7, 4, '2016-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (8, 'обсуждение реализации', 7, 4, '2017-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (9, 'обсуждение в эксплуатацию', 7, 4, '2017-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (10, 'обсуждение ТЗ', 4, 8, '2017-10-14', '102000');
INSERT INTO meeting (M_ID, Name, C_id, P_id, Date, Time)
VALUES (11, 'обсуждение реализации', 4, 8, '2017-10-14', '102000');


/* клиенты */
CREATE TABLE clients (
  C_id   INTEGER,
  Name   TEXT,
  FIO    TEXT,
  S_Date DATE,
  Status TEXT
);

INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (1, 'Новые технологии','Петров Николай Сергеевич','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (2, 'CG Systems','Крюкова Ольга Петровна','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (3, 'Terrarial LTD','Дудник Андрей Романович','2016-10-14','ОЖИДАНИЕ');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (4, 'Офисные системы','Багдасарян Николай Иванович','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (5, 'Промышленные инфосистемы','Семенов Семен Сергеевич','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (6, 'Pied piper Inc','Петров Николай Сергеевич','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (7, 'Teck tecnology','Пантелеймонова Екатерина Анатольевна','2016-10-14','ОЖИДАНИЕ');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (8, 'Крепкие ведра','Богатырева Марина Владимировна','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (9, 'Вертолеты Семенова','Болдырев Алексей Иванович','2016-10-14','СОТРУДНИЧЕСТВО');
INSERT INTO clients (C_id, Name, FIO, S_Date, Status)
VALUES (10, 'Subs Inc','Немнова Марина Владимировна','2016-10-14','СОТРУДНИЧЕСТВО');




