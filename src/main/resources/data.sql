CREATE TABLE IF NOT EXISTS usuario (id number(10) ,
                                    username varchar(500),
                                    password varchar(500),
                                    email varchar(500),
                                    firstName varchar(500),
                                    lastName varchar(500),
                                    role varchar(500));

Insert into usuario (id,
                    username,
                    password,
                    email,
                    firstName,
                    lastName,
                    role)
                    values
                    (1,
                    'leo@gmail.com',
                    '$2a$10$XeKcwfnSMbdbsXmYpjsIKeHHSxUiIA4aYBLOeJ0PrLCOvB3vP78I.',
                    'leo@gmail.com',
                    'leo',
                    'leo 2',
                    'ADMIN'
                    );