DROP TABLE IF EXISTS siswa;
CREATE TABLE siswa (
id varchar(255) NOT NULL,
nis varchar(255) NOT NULL,
nama varchar(255) NOT NULL,
kelas varchar(255) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `c_security_permission` (
    `id` varchar(255) NOT NULL,
    `permission_label` varchar(255) NOT NULL,
    `permission_value` varchar(255) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `abcdefghijklmnopqrstuvwxyz42` (`permission_value`)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `c_security_role`(
    `id` VARCHAR (255) NOT NULL,
    `nama` VARCHAR(255) NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `abcdefghijklmnopqrstuvwxyz10` (`nama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `c_security_role_permission` (
    `id_role` varchar(255) not null,
    `id_permission` varchar(255) not null,
    PRIMARY KEY (`id_role`,`id_permission`),
    KEY `3938eed097dc4741b186f7c18f36cf4b` (`id_permission`),
    CONSTRAINT `3938eed097dc4741b186f7c18f36cf4b` FOREIGN KEY (`id_permission`) REFERENCES `c_security_permission` (`id`),
    CONSTRAINT `964d72e72d053d501f2949969849b96c` FOREIGN KEY (`id_role`) REFERENCES `c_security_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `c_security_user`(
    `id` varchar(255) NOT NULL,
    `username` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    `active` BOOLEAN NOT NULL,
    `id_role` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `abcdefghijklmnopqrstuvwxyz11` (`username`),
    KEY `abcdefghijklmnopqrstuvwxyz12` (`id_role`),
    CONSTRAINT `abcdefghijklmnopqrstuvwxyz12` FOREIGN KEY (`id_role`) REFERENCES `c_security_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;