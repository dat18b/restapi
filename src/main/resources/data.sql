INSERT INTO post(id, content) VALUES (1, 'Dette er en post')
INSERT INTO post(id, content) VALUES (2, 'Dette er en post')
INSERT INTO post(id, content) VALUES (3, 'Dette er en post')

INSERT INTO comment(id, content, fk_post_id) VALUES (1, 'Dette er en Comment', 1)
INSERT INTO comment(id, content, fk_post_id) VALUES (2, 'Dette er en ny anden Comment', 1)
INSERT INTO comment(id, content, fk_post_id) VALUES (3, 'Dette er en Comment', 2)
