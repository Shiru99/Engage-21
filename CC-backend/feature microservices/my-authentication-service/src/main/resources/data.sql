INSERT INTO
    cc_users (id, username, password, active, role)
VALUES
    (
        0,
        'John',
        '{bcrypt}$2a$10$jBxirFzCFwYVAskGcBMINuxjxJuD/gXIWqzkkCjtRhFpkzm9H1NPO',
        'true',
        'student'
    ),
    (
        1,
        'Jenny',
        '{bcrypt}$2a$10$jBxirFzCFwYVAskGcBMINuxjxJuD/gXIWqzkkCjtRhFpkzm9H1NPO',
        'true',
        'student'
    ),
    (
        2,
        'James',
        '{bcrypt}$2a$10$jBxirFzCFwYVAskGcBMINuxjxJuD/gXIWqzkkCjtRhFpkzm9H1NPO',
        'true',
        'teacher'
    ),
    (
        3,
        'temp',
        '1234',
        'true',
        'teacher'
    )
;

-- password : 1234