CREATE TABLE `bit_wallet_account` (
  `bit_wallet_id` int(11) NOT NULL,
  `wallet_amount` double NOT NULL,
  `currency_name` varchar(45) NOT NULL,
  PRIMARY KEY (`bit_wallet_id`,`currency_name`)
);
CREATE TABLE `bit_wallet_account_transaction` (
  `bit_wallet_id` int(11) NOT NULL,
  `timestamp` datetime NOT NULL,
  `currency_name` varchar(45) NOT NULL,
  `wallet_amount` double NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) 