create database assets_monitor CHARACTER SET utf8 COLLATE utf8_general_ci;

drop table asset_prices;
create table asset_prices (
    id bigint not null auto_increment,
    label varchar(10),
    hit varchar(10),
    price decimal(7,2),
    moment date,
    primary key(id)
);

use assetsdb;
select * from asset_prices;