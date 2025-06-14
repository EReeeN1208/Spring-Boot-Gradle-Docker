# Spring-Boot-Gradle-Docker

Template for a dockerized spring boot application.

Uses GitHub actions to build repository to the GitHub Package Registry.

## Getting started:

Change 'Spring-Boot-Gradle-Docker' according to your project:
- `./settings.gradle` - Line 6
- `./src/main/resources/application.properties` - Line 1

Also consider:
- Uncommenting lines 61-69 and adding necessary secret variables for automatic deployment


You can compose your docker image by using a `docker-compose.yml` such as the one below:
```yml
services:
  project-name:
    image: ghcr.io/{repo_owner}/{package_name}:master
    restart: unless-stopped
    networks:
      - web
    ports:
      - "8080:8080"
```