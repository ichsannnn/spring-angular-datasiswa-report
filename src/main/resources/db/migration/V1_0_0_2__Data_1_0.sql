INSERT INTO siswa VALUES
('1', '10578', 'Ichsan Firdaus', 'XII-RPL');

INSERT INTO c_security_role (id, nama, description) VALUES
('admin', 'admin', 'Application Admin'),
('user', 'user', 'Application User');

INSERT INTO c_security_permission(id, permission_label, permission_value) VALUES
('peserta_update', 'Edit Peserta', 'ROLE_PESERTA_UPDATE'),
('peserta_view', 'View Peserta', 'ROLE_PESERTA_VIEW'),
('peserta_create', 'CreatePeserta', 'ROLE_PESERTA_CREATE'),
('peserta_delete', 'Delete Peserta', 'ROLE_PESERTA_DELETE'),
('user_view', 'View User', 'ROLE_USER_VIEW');

INSERT INTO c_security_role_permission (id_role, id_permission) VALUES
('admin', 'peserta_update'),
('admin', 'peserta_view'),
('admin', 'peserta_create'),
('admin', 'peserta_delete'),
('user', 'peserta_view'),
('user', 'user_view'),
('admin', 'user_view');

INSERT INTO c_security_user(id, username, password, active, id_role) VALUES
('936c5bace0006443da4ba33b2a5b9701', 'admin', 'admin', true, 'admin'),
('3938eed097dc4741b186f7c18f36cf4b', 'user', 'user', true, 'user');
