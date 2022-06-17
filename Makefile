MIGRATION_LABEL = "to-be-changed"
MODULE = "ModuleName"
DATE_WITH_TIME := $(shell /bin/date "+%Y%m%d%H%M%S")

SHELL := /bin/bash

makeMigration:
	source .env && ./mvnw clean compile liquibase:diff -Ddiffname=${DATE_WITH_TIME}-${MIGRATION_LABEL} -Dliquibase.url=$$JDBC_DATABASE_URL -Dliquibase.username=$$JDBC_DATABASE_USERNAME -Dliquibase.password=$$JDBC_DATABASE_PASSWORD -Dliquibase.changeLogFile=classpath:db/changelog/*.yaml -pl ${MODULE}
