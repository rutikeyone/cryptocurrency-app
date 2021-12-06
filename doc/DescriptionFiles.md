# Description files

Here is a detailed description of the project files, this will help you better understand the architecture.

Name            | Description
:-------------------------:|:-------------------------:
build.gradle  |  Contains all the libraries connected to the project and necessary for correct operation.
common  |  Contains common resource application
data | Contains dto classes and repository which use for get data with CoinPaprikaApi.
di | Contains dependency injection application with Hilt.
domain | Contains model classes, repository and use cases which use in application.
presentaion | Contains composable functions which create view application.
CoinApplication.kt | Class which contains annotation for marking the Application class where the Dagger components should be generated.