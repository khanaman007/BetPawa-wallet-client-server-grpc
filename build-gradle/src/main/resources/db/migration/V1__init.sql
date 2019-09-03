CREATE TABLE bit_wallet_account
(
  bit_wallet_id bigint NOT NULL,
  wallet_amount double precision,
  currency_name character varying(255),
  CONSTRAINT bit_wallet_account_pkey PRIMARY KEY (bit_wallet_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE bit_wallet_account
  OWNER TO postgres;
  CREATE TABLE public.bit_wallet_account_transaction
(
  bit_wallet_id bigint,
  wallet_amount double precision,
  currency_name character varying(255),
  transaction character varying(255),
  "timestamp" timestamp with time zone,
  id bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE bit_wallet_account
  OWNER TO postgres;