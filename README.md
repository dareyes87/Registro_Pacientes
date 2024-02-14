# Registro_Pacientes
Aplicacion para el registro y control de pacientes de un hospital.
POR: DANIEL HAROLDO REYES GARCIA 1190-22-12085  EL CODIGO DEL PROGRAMA SE ENCUENTRA EN LA RAMA MASTER

CODIGO SQL PARA LAS TABLAS EN POSTGRE:

paciente:
-- Table: public.paciente

-- DROP TABLE IF EXISTS public.paciente;

CREATE TABLE IF NOT EXISTS public.paciente
(
    cui bigint NOT NULL,
    nombre text COLLATE pg_catalog."default" NOT NULL,
    dic text COLLATE pg_catalog."default" NOT NULL,
    tel bigint NOT NULL,
    sex text COLLATE pg_catalog."default" NOT NULL,
    edad date,
    depa text COLLATE pg_catalog."default" NOT NULL,
    muni text COLLATE pg_catalog."default" NOT NULL
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.paciente
    OWNER to postgres;

usuario:
-- Table: public.usuarios

-- DROP TABLE IF EXISTS public.usuarios;

CREATE TABLE IF NOT EXISTS public.usuarios
(
    usuario text COLLATE pg_catalog."default" NOT NULL,
    clave text COLLATE pg_catalog."default" NOT NULL
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usuarios
    OWNER to postgres;
