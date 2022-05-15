TRUNCATE users RESTART IDENTITY CASCADE;

INSERT INTO users (user_id,email, full_name, password, role) VALUES (1,'admin@example.com', 'Demo Admin', '$2a$10$glHBb0tkb6AP0fS6SnKKbOtW4RZLnK51GoISvaB3sADZ73ENERR9K', 'ADMIN');