CREATE TABLE `student` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL,
    `age` bigint(2) NOT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO student SET name='Khanh', age=33;