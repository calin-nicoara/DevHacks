INSERT INTO company(
            id, name)
    VALUES (-1, 'Accenture');

INSERT INTO employee(
            id, email, name, password, username, company_id)
    VALUES (-1, 'ileana_voicu@gmail.com', 'Ileana Voicu', 'parola', 'ileana_voicu', -1);

INSERT INTO room(
            id, details, name, company_id)
    VALUES (-1, 'etaj 1, aripa vest', 'Camera Batcave', -1);

INSERT INTO room(
            id, details, name, company_id)
    VALUES (-2, 'etaj 2, aripa est', 'Camera Ice Age', -1);

INSERT INTO room(
            id, details, name, company_id)
    VALUES (-3, 'etaj 2, aripa vest', 'Camera Mordor', -1);


INSERT INTO meeting(
            id, code, time_begin, time_end, employee_id, room_id)
    VALUES (-1, '11111', '2015-08-20 15:00:000', '2015-08-20 17:00:000', -1, -3);

INSERT INTO meeting(
            id, code, time_begin, time_end, employee_id, room_id)
    VALUES (-2, '11112', '2015-08-20 11:00:000', '2015-08-20 13:00:000', -1, -3);

INSERT INTO meeting(
            id, code, time_begin, time_end, employee_id, room_id)
    VALUES (-3, '11113', '2015-08-21 11:00:000', '2015-08-20 13:00:000', -1, -1);

INSERT INTO visitor(
            id, email, entry_time, exit_time, name, phone, meeting_id)
    VALUES (-1, 'calin_nicoara@gmail.com', '2015-08-20 14:48:000', '2015-08-20 17:15:000', 'Calin Nicoara', '0765693675',
-1);